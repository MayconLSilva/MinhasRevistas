/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import Model.ModeloRevistas;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Util.ConectaBanco;

/**
 *
 * @author Maycon Silva
 */
public class ControleRevista {
    
    ConectaBanco conecta = new ConectaBanco();
    ModeloRevistas modelo = new ModeloRevistas();
    
    private int anoRev, numeroRev;
    private String caixaRev,colecao;
    
    
    
    public void SalvarRevista(ModeloRevistas mod){
        //conecta.desconecta();
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("insert into tblRevistas (ano_tblRevistas,caixa_tblRevistas_fk,numeroEdicao_tblRevistas,colecao_tblRevistas) values (?,?,?,?)");
            pst.setInt(1, mod.getAno());
            pst.setString(2, mod.getCaixa());
            pst.setInt(3, mod.getNumeroEdicao());
            pst.setString(4, mod.getColecao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Revista Cadastrada!");
        }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "Erro ao inserir revista!\nERRO:" + ex); 
        }
        conecta.desconecta();
    }
    
    public void ExcluirRevista(ModeloRevistas mod){
        conecta.desconecta();
        conecta.conexao();
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement("delete from tblRevistas where id_tblRevistas = ?");
            pst.setInt(1, mod.getIdRevista());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Revista Excluida!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a revista!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void EditarRevista(ModeloRevistas mod){
        conecta.desconecta();
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("update tblRevistas set ano_tblRevistas = ?,caixa_tblRevistas_fk = ?,numeroEdicao_tblRevistas = ?,colecao_tblRevistas=? where id_tblRevistas  =?");
            pst.setInt(1, mod.getAno());
            pst.setString(2, mod.getCaixa());            
            pst.setInt(3, mod.getNumeroEdicao());  
            pst.setString(4, mod.getColecao());
            pst.setInt(5, mod.getIdRevista());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Revista atualizada com sucesso!","Editar Revista",JOptionPane.INFORMATION_MESSAGE);
                   
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar revista!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void CarregarRevistas(int idRevista){
        conecta.conexao(); 
        conecta.executaSQL("SELECT *FROM tblRevistas where id_tblRevistas = '"+idRevista+"'");
        try { 
            while(conecta.rs.next()){                
                anoRev = conecta.rs.getInt("ano_tblRevistas");
                caixaRev = conecta.rs.getString("caixa_tblRevistas_fk");
                numeroRev = conecta.rs.getInt("numeroEdicao_tblRevistas");
                colecao = conecta.rs.getString("colecao_tblRevistas");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar id da revista!\nERRO:"+ex);
        }
    }

    /**
     * @return the anoRev
     */
    public int getAnoRev() {
        return anoRev;
    }

    /**
     * @param anoRev the anoRev to set
     */
    public void setAnoRev(int anoRev) {
        this.anoRev = anoRev;
    }

    /**
     * @return the numeroRev
     */
    public int getNumeroRev() {
        return numeroRev;
    }

    /**
     * @param numeroRev the numeroRev to set
     */
    public void setNumeroRev(int numeroRev) {
        this.numeroRev = numeroRev;
    }

    /**
     * @return the caixaRev
     */
    public String getCaixaRev() {
        return caixaRev;
    }

    /**
     * @param caixaRev the caixaRev to set
     */
    public void setCaixaRev(String caixaRev) {
        this.caixaRev = caixaRev;
    }

    /**
     * @return the colecao
     */
    public String getColecao() {
        return colecao;
    }

    /**
     * @param colecao the colecao to set
     */
    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    

    
    
  
}
