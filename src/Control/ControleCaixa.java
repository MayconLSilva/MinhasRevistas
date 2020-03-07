/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.ModeloCaixa;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Util.ConectaBanco;

/**
 *
 * @author Maycon Silva
 */
public class ControleCaixa {
    
    ConectaBanco conecta = new ConectaBanco();
    ModeloCaixa modelo = new ModeloCaixa();
    
    private String identif,cor;
    private int num;
    
    
    
    public void SalvarCaixa(ModeloCaixa mod){
        //conecta.desconecta();
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("insert into tblCaixa (numero_tblCaixa,identificacaoEtiqueta_tblCaixa,cor_tblCaixa) values (?,?,?)");
            pst.setInt(1, mod.getNumeroCaixa());
            pst.setString(2, mod.getIdentificacaoEtiquetaCaixa());
            pst.setString(3, mod.getCorCaixa());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Caixa Cadastrado!");
        }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "Erro ao inserir caixa!\nERRO:" + ex); 
        }
        conecta.desconecta();
    }
    
    public void ExcluirCaixa(ModeloCaixa mod){
        conecta.desconecta();
        conecta.conexao();
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement("delete from tblCaixa where id_tblCaixa = ?");
            pst.setInt(1, mod.getIdCaixa());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Caixa Excluido!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a caixa!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void EditarCaixa(ModeloCaixa mod){
        conecta.desconecta();
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("update tblCaixa set numero_tblCaixa = ?,identificacaoEtiqueta_tblCaixa = ?,cor_tblCaixa = ? where id_tblCaixa  =?");
            pst.setInt(1, mod.getNumeroCaixa());
            pst.setString(2, mod.getIdentificacaoEtiquetaCaixa());
            pst.setString(3, mod.getCorCaixa());
            pst.setInt(4, mod.getIdCaixa());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Caixa atualizado com sucesso!","Editar Caixa",JOptionPane.INFORMATION_MESSAGE);
                   
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar caixa!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void CarregarCaixa(int idCaixa){
        conecta.conexao(); 
        conecta.executaSQL("SELECT *FROM tblCaixa where id_tblCaixa = '"+idCaixa+"'");
        try { 
            while(conecta.rs.next()){                
                num = conecta.rs.getInt("numero_tblCaixa");
                identif = conecta.rs.getString("identificacaoEtiqueta_tblCaixa");
                cor = conecta.rs.getString("cor_tblCaixa");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar id do caixa!\nERRO:"+ex);
        }
    }

    /**
     * @return the identif
     */
    public String getIdentif() {
        return identif;
    }

    /**
     * @param identif the identif to set
     */
    public void setIdentif(String identif) {
        this.identif = identif;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    

    
    
  
}
