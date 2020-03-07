/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.ModeloColecao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Util.ConectaBanco;

/**
 *
 * @author Maycon Silva
 */
public class ControleColecao {
    
    ConectaBanco conecta = new ConectaBanco();
    ModeloColecao modelo = new ModeloColecao();
    
    private String nomePesquisado;
    
    public void SalvarColecao(ModeloColecao mod){
        //conecta.desconecta();
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("insert into tblColecao (nome_tblColecao) values (?)");
            pst.setString(1, mod.getNomeColecao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Coleção Cadastrada!");
        }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "Erro ao inserir coleção!\nERRO:" + ex); 
        }
        conecta.desconecta();
    }
    
    public void ExcluirColecao(ModeloColecao mod){
        conecta.desconecta();
        conecta.conexao();
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement("delete from tblColecao where id_tblColecao = ?");
            pst.setInt(1, mod.getIdColecao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Coleção Excluida!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a coleção!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void EditarColecao(ModeloColecao mod){
        conecta.desconecta();
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("update tblColecao set nome_tblColecao = ? where id_tblColecao =?");
            pst.setString(1, mod.getNomeColecao());
            pst.setInt(2, mod.getIdColecao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Coleção atualizada com sucesso!","Editar Coleção",JOptionPane.INFORMATION_MESSAGE);
                   
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar coleção!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void CarregarColecao(int idColecao){
        System.out.println("controle "+idColecao);
        conecta.conexao(); 
        conecta.executaSQL("SELECT *FROM tblColecao where id_tblColecao = '"+idColecao+"'");
        try { 
            while(conecta.rs.next()){                
                String nome = conecta.rs.getString("nome_tblColecao");
                nomePesquisado = nome;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar id da coleção!\nERRO:"+ex);
        }
    }

    /**
     * @return the nomePesquisado
     */
    public String getNomePesquisado() {
        return nomePesquisado;
    }

    /**
     * @param nomePesquisado the nomePesquisado to set
     */
    public void setNomePesquisado(String nomePesquisado) {
        this.nomePesquisado = nomePesquisado;
    }
    
  
}
