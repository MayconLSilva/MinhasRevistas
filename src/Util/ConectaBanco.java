/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Maycon Silva
 */
public class ConectaBanco {
    
    public Statement stm;
    public ResultSet rs;
    public Connection conn;
    private String driver = "org.sqlite.JDBC";
    
    public void conexao(){
            try {
                System.setProperty("jdbc.Drivers",driver);
                //Class.forName("org.sqlite.JDBC");
                conn=DriverManager.getConnection("jdbc:sqlite:MinhasRevistas.db");
                //JOptionPane.showMessageDialog(null, "Chamou");
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro de conexão!\n Erro:" + ex.getMessage());
            }
            
        }
    
    public void desconecta(){
        try{
            conn.close();
            //JOptionPane.showMessageDialog(null,"Desconectado com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao fechar a conexão!\n Erro:" + ex.getMessage());
        }
    }
    
    public void executaSQL(String sql){
       try {
            //stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            stm = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de ExecutaSQL!\n Erro:" + ex.getMessage());
        }
        
    }
    
}
