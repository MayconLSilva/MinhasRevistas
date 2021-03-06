/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ModeloColecao;
import Model.ModeloTabela;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import Util.ConectaBanco;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Maycon Silva
 */
public class FrmConsultaEmprestimo extends javax.swing.JDialog {
    
    ConectaBanco conn = new ConectaBanco();
    private String idCodigo, nomeAmigo,dataDev,dataRetirada,livroEmpre;
    
    PreparedStatement pst;
    ResultSet rs;
    Connection conecta;

    /**
     * Creates new form FrmConsultaColecao
     */
    public FrmConsultaEmprestimo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(200,150);
        
        //Inicio código fonte inativa botões
        jButtonOK.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableColecao = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldFiltroPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox<>();
        jButtonOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigoClicado = new javax.swing.JTextField();
        jTextFieldColecaoClicada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA DE EMPRESTIMO");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableColecao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableColecao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableColecaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableColecao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonPesquisar.setText("PESQUISAR");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS" }));

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFiltroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jButtonOK)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFiltroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOK))
                .addContainerGap())
        );

        jLabel1.setText("Código");

        jTextFieldCodigoClicado.setEnabled(false);

        jTextFieldColecaoClicada.setEnabled(false);

        jLabel2.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCodigoClicado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldColecaoClicada, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoClicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldColecaoClicada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
         dispose();
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jTableColecaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableColecaoMouseClicked
        int linha_selecionada = jTableColecao.getSelectedRow();
        idCodigo = (jTableColecao.getValueAt(linha_selecionada, 0).toString());
        dataRetirada= (jTableColecao.getValueAt(linha_selecionada, 1).toString());
        dataDev = (jTableColecao.getValueAt(linha_selecionada, 2).toString());
        nomeAmigo = (jTableColecao.getValueAt(linha_selecionada, 3).toString());
        livroEmpre = (jTableColecao.getValueAt(linha_selecionada, 4).toString());
                
        //String UnidadeID = "" + jTableColecao.getValueAt(jTableColecao.getSelectedRow(), 0);
        jTextFieldCodigoClicado.setText(idCodigo);
        
        //String SiglaUnidade = "" + jTableColecao.getValueAt(jTableColecao.getSelectedRow(), 1);
        jTextFieldColecaoClicada.setText(nomeAmigo);
        
        jButtonOK.setEnabled(true);
    }//GEN-LAST:event_jTableColecaoMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
       jTextFieldCodigoClicado.setText("");
       jTextFieldColecaoClicada.setText("");
       
       if(jComboBoxTipoPesquisa.getSelectedItem().equals("TODOS")){           
           preencherTabelaColecao("select *from tblEmprestimo");
       }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

   public void preencherTabelaColecao(String sql){
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[]{"ID","DATA RETIRADA","DATA DEV.","NOME","LIVRO","STATUS"};
        conn.conexao();
        conn.executaSQL(sql);
        try{
            conn.rs.next();
            do{
                //Inicio do código fonte verifica se o livro tá emprestado o livre
                String statusLivro = null;
                try{
                    String dataDevolucaoBanco= conn.rs.getString("dataDevolucao_tblEmprestimo");                
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date hoje = new Date();
                    String dataAtual = sdf.format(hoje);
                    Date date1 = sdf.parse(dataDevolucaoBanco);
                    Date date2 = sdf.parse(dataAtual);
                    if(date1.compareTo(date2)<0){
                        System.out.println("ver");
                        statusLivro ="LIVRE";
                    }else{
                        statusLivro ="EMPRESTADO";
                    }
                    //Fim do código fonte verifica se o livro tá emprestado o livre
                }catch(ParseException ex){
                    ex.printStackTrace();
                }
                dados.add(new Object[]{ conn.rs.getString("id_tblEmprestimo") ,conn.rs.getString("dataEmprestimo_tblEmprestimo"),conn.rs.getString("dataDevolucao_tblEmprestimo"),conn.rs.getString("nomeAmigo_tblEmprestimo"),conn.rs.getString("livro_tblEmprestimo"),statusLivro});
                
            }while (conn.rs.next());
        }catch (SQLException ex){
            //JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\nERRO:" + ex);
         //catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Emprestimo não encontrado");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableColecao.setModel(modelo);
        jTableColecao.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableColecao.getColumnModel().getColumn(0).setResizable(false);
        jTableColecao.getColumnModel().getColumn(1).setPreferredWidth(90);
        jTableColecao.getColumnModel().getColumn(1).setResizable(false);
        jTableColecao.getColumnModel().getColumn(2).setPreferredWidth(90);
        jTableColecao.getColumnModel().getColumn(2).setResizable(false);
        jTableColecao.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTableColecao.getColumnModel().getColumn(3).setResizable(false);
        jTableColecao.getColumnModel().getColumn(4).setPreferredWidth(220);
        jTableColecao.getColumnModel().getColumn(4).setResizable(false);
        jTableColecao.getColumnModel().getColumn(5).setPreferredWidth(90);
        jTableColecao.getColumnModel().getColumn(5).setResizable(false);
        jTableColecao.getTableHeader().setReorderingAllowed(false);
        jTableColecao.setAutoResizeMode(jTableColecao.AUTO_RESIZE_OFF);
        jTableColecao.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    
    
    
    
       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmConsultaEmprestimo dialog = new FrmConsultaEmprestimo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox<String> jComboBoxTipoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableColecao;
    private javax.swing.JTextField jTextFieldCodigoClicado;
    private javax.swing.JTextField jTextFieldColecaoClicada;
    private javax.swing.JTextField jTextFieldFiltroPesquisa;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the idCodigo
     */
    public String getIdCodigo() {
        return idCodigo;
    }

    /**
     * @param idCodigo the idCodigo to set
     */
    public void setIdCodigo(String idCodigo) {
        this.idCodigo = idCodigo;
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
     * @return the dataDev
     */
    public String getDataDev() {
        return dataDev;
    }

    /**
     * @param dataDev the dataDev to set
     */
    public void setDataDev(String dataDev) {
        this.dataDev = dataDev;
    }

    /**
     * @return the dataRetirada
     */
    public String getDataRetirada() {
        return dataRetirada;
    }

    /**
     * @param dataRetirada the dataRetirada to set
     */
    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    /**
     * @return the livroEmpre
     */
    public String getLivroEmpre() {
        return livroEmpre;
    }

    /**
     * @param livroEmpre the livroEmpre to set
     */
    public void setLivroEmpre(String livroEmpre) {
        this.livroEmpre = livroEmpre;
    }
}
