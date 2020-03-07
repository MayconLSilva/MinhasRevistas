/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.ModeloAmigo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Util.ConectaBanco;

/**
 *
 * @author Maycon Silva
 */
public class ControleAmigo {
    
    ConectaBanco conecta = new ConectaBanco();
    ModeloAmigo modelo = new ModeloAmigo();
    
    private String nomeAmigo, telefoneAmigo,localAmigo;
    
    
    
    public void SalvarAmigo(ModeloAmigo mod){
        //conecta.desconecta();
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("insert into tblAmigo (nome_tblAmigo,telefone_tblAmigo,localAmigo_tblAmigo) values (?,?,?)");
            pst.setString(1, mod.getNomeAmigo());
            pst.setString(2, mod.getTelefoneAmigo());
            pst.setString(3, mod.getLocalAmigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Amigos Cadastrado!");
        }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "Erro ao inserir amigo!\nERRO:" + ex); 
        }
        conecta.desconecta();
    }
    
    public void ExcluirAmigo(ModeloAmigo mod){
        conecta.desconecta();
        conecta.conexao();
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement("delete from tblAmigo where id_tblAmigo = ?");
            pst.setInt(1, mod.getIdAmigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Amigo Excluido!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o amigo!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void EditarAmigo(ModeloAmigo mod){
        conecta.desconecta();
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("update tblAmigo set nome_tblAmigo = ?,telefone_tblAmigo = ?,localAmigo_tblAmigo = ? where id_tblAmigo  =?");
            pst.setString(1, mod.getNomeAmigo());
            pst.setString(2, mod.getTelefoneAmigo());
            pst.setString(3, mod.getLocalAmigo());
            pst.setInt(4, mod.getIdAmigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Amigo atualizado com sucesso!","Editar Amigo",JOptionPane.INFORMATION_MESSAGE);
                   
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar amigo!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void CarregarAmigo(int idAmigo){
        conecta.conexao(); 
        conecta.executaSQL("SELECT *FROM tblAmigo where id_tblAmigo = '"+idAmigo+"'");
        try { 
            while(conecta.rs.next()){                
                nomeAmigo = conecta.rs.getString("nome_tblAmigo");
                telefoneAmigo = conecta.rs.getString("telefone_tblAmigo");
                localAmigo = conecta.rs.getString("localAmigo_tblAmigo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar id da coleção!\nERRO:"+ex);
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
     * @return the telefoneAmigo
     */
    public String getTelefoneAmigo() {
        return telefoneAmigo;
    }

    /**
     * @param telefoneAmigo the telefoneAmigo to set
     */
    public void setTelefoneAmigo(String telefoneAmigo) {
        this.telefoneAmigo = telefoneAmigo;
    }

    /**
     * @return the localAmigo
     */
    public String getLocalAmigo() {
        return localAmigo;
    }

    /**
     * @param localAmigo the localAmigo to set
     */
    public void setLocalAmigo(String localAmigo) {
        this.localAmigo = localAmigo;
    }

    
    
  
}
