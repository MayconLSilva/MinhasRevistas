/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.ModeloEmprestimo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Util.ConectaBanco;

/**
 *
 * @author Maycon Silva
 */
public class ControleEmprestimo {
    
    ConectaBanco conecta = new ConectaBanco();
    ModeloEmprestimo modelo = new ModeloEmprestimo();
    
    private String nomeAmigo, dataEmprestimo,dataDevolucao,livroEmprestimo;
    
    
    
    public void SalvarEmprestimo(ModeloEmprestimo mod){
        //conecta.desconecta();
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("insert into tblEmprestimo (dataEmprestimo_tblEmprestimo,dataDevolucao_tblEmprestimo,nomeAmigo_tblEmprestimo,livro_tblEmprestimo) values (?,?,?,?)");
            pst.setString(1, mod.getDataEmprestimo());
            pst.setString(2, mod.getDataDevolucao());
            pst.setString(3, mod.getNomeAmigoEmprestado());
            pst.setString(4, mod.getLivroEmprestado());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Livro Agendado Emprestimo!");
        }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "Erro ao inserir livro emprestado!\nERRO:" + ex); 
        }
        conecta.desconecta();
    }
    
    public void ExcluirEmprestimo(ModeloEmprestimo mod){
        conecta.desconecta();
        conecta.conexao();
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement("delete from tblEmprestimo where id_tblEmprestimo = ?");
            pst.setInt(1, mod.getIdEmprestimo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Emprestimo Excluido!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o emprestimo!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void EditarEmprestimo(ModeloEmprestimo mod){
        conecta.desconecta();
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("update tblEmprestimo set dataEmprestimo_tblEmprestimo = ?,dataDevolucao_tblEmprestimo = ?,nomeAmigo_tblEmprestimo = ?,livro_tblEmprestimo = ? where id_tblEmprestimo  =?");
            pst.setString(1, mod.getDataEmprestimo());
            pst.setString(2, mod.getDataDevolucao());
            pst.setString(3, mod.getNomeAmigoEmprestado());
            pst.setString(4, mod.getLivroEmprestado());            
            pst.setInt(5, mod.getIdEmprestimo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Emprestimo atualizado com sucesso!","Editar Amigo",JOptionPane.INFORMATION_MESSAGE);
                   
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao emprestimo ao amigo!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void CarregarEmprestimo(int idEmprestimo){
        conecta.conexao(); 
        conecta.executaSQL("SELECT *FROM tblEmprestimo where id_tblEmprestimo = '"+idEmprestimo+"'");
        try { 
            while(conecta.rs.next()){                
                nomeAmigo = conecta.rs.getString("nomeAmigo_tblEmprestimo");
                dataEmprestimo = conecta.rs.getString("dataEmprestimo_tblEmprestimo");
                dataDevolucao = conecta.rs.getString("dataDevolucao_tblEmprestimo");
                livroEmprestimo = conecta.rs.getString("livro_tblEmprestimo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar id do emprestimo!\nERRO:"+ex);
        }
    }

    /**
     * @return the nomeAmigo
     */
    public String getNomeAmigo() {
        return nomeAmigo;
    }

    /**
     * @param nomeAmigo the nomeAmigo to set
     */
    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    /**
     * @return the dataEmprestimo
     */
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * @param dataEmprestimo the dataEmprestimo to set
     */
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * @return the dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the livroEmprestimo
     */
    public String getLivroEmprestimo() {
        return livroEmprestimo;
    }

    /**
     * @param livroEmprestimo the livroEmprestimo to set
     */
    public void setLivroEmprestimo(String livroEmprestimo) {
        this.livroEmprestimo = livroEmprestimo;
    }

    
    
  
}
