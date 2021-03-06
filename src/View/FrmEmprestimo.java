/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ControleEmprestimo;
import Model.ModeloEmprestimo;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import Util.ConectaBanco;

/**
 *
 * @author Maycon Silva
 */
public class FrmEmprestimo extends javax.swing.JInternalFrame {
    
    ModeloEmprestimo mod = new ModeloEmprestimo();
    ControleEmprestimo control = new ControleEmprestimo();
    ConectaBanco conecta = new ConectaBanco();
        
    private int flag;
    private String returnStatusLivro;

    /**
     * Creates new form FrmColecao
     */
    public FrmEmprestimo() {
        initComponents();
        
        this.setLocation(450,100);
        
        //Método não encerrar a tela sem fechar
        setClosable(true);
        
        //Inicio do código fonte inativa todos menus
        jMenuNovo.setEnabled(true);
        jMenuSalvar.setEnabled(false);
        jMenuEditar.setEnabled(false);
        jMenuExluir.setEnabled(false);
        jMenuCancelar.setEnabled(false);
        jButtonBuscar.setEnabled(true);
        jButtonPesquisarAmigo.setEnabled(false);
        jButtonPesquisarLivro.setEnabled(false);
        
        jTextFieldCodigo.setEnabled(false);
        jTextFieldNomeAmigo.setEnabled(false); 
        jTextFieldLivro.setEnabled(false);  
        jFormattedTextFieldDataRetirada.setEnabled(false);  
        jFormattedTextFieldDataDevolucao.setEnabled(false);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNomeAmigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonPesquisarAmigo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldLivro = new javax.swing.JTextField();
        jButtonPesquisarLivro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldDataRetirada = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldDataDevolucao = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuNovo = new javax.swing.JMenu();
        jMenuSalvar = new javax.swing.JMenu();
        jMenuEditar = new javax.swing.JMenu();
        jMenuExluir = new javax.swing.JMenu();
        jMenuCancelar = new javax.swing.JMenu();

        setIconifiable(true);
        setTitle("EMPRESTIMOS");

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jButtonBuscar.setText("PESQUISAR");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonPesquisarAmigo.setText("PESQUISAR");
        jButtonPesquisarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarAmigoActionPerformed(evt);
            }
        });

        jLabel5.setText("Livro/Revistas:");

        jButtonPesquisarLivro.setText("PESQUISAR");
        jButtonPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarLivroActionPerformed(evt);
            }
        });

        jLabel6.setText("Data Retirada:");

        jFormattedTextFieldDataRetirada.setText("  /  /");

        jLabel7.setText("Data Devolução:");

        jFormattedTextFieldDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##/##/####"))));
        jFormattedTextFieldDataDevolucao.setText("  /  /    ");

        jMenuNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/folder-plus.png"))); // NOI18N
        jMenuNovo.setText("NOVO");
        jMenuNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuNovoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuNovo);

        jMenuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/content-save.png"))); // NOI18N
        jMenuSalvar.setText("SALVAR");
        jMenuSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalvarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalvar);

        jMenuEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/folder-edit.png"))); // NOI18N
        jMenuEditar.setText("EDITAR");
        jMenuEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEditarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuEditar);

        jMenuExluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/trash-can.png"))); // NOI18N
        jMenuExluir.setText("EXCLUIR");
        jMenuExluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuExluirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuExluir);

        jMenuCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eraser.png"))); // NOI18N
        jMenuCancelar.setText("CANCELAR");
        jMenuCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCancelarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCancelar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscar))
                            .addComponent(jLabel2))
                        .addContainerGap(229, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldLivro)
                            .addComponent(jTextFieldNomeAmigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPesquisarAmigo)
                            .addComponent(jButtonPesquisarLivro))
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jFormattedTextFieldDataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jFormattedTextFieldDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 178, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarAmigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisarLivro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalvarMouseClicked
        if(jMenuSalvar.isEnabled()){
            //IF SALVAR
            if(flag == 1){
                mod.setNomeAmigoEmprestado(jTextFieldNomeAmigo.getText());
                mod.setLivroEmprestado(jTextFieldLivro.getText());
                mod.setDataEmprestimo(jFormattedTextFieldDataRetirada.getText());
                mod.setDataDevolucao(jFormattedTextFieldDataDevolucao.getText());
                if (jTextFieldNomeAmigo.getText().toString().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Por favor preencha o amigo!!");
                } else {
                    if (returnStatusLivro.equals("EMPRESTADO")) {
                        int input = JOptionPane.showConfirmDialog(null, "Livro já eprestado, continuar?", "Selecione uma opção...",
                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
                        // 0=yes, 1=no, 2=cancel
                        System.out.println(input);
                        if (input == 0) {
                            control.SalvarEmprestimo(mod);
                            finalizarSalvar();
                        } else if (input == 1) {
                            JOptionPane.showMessageDialog(rootPane, "Operação não salva!!");
                            cancelamentoSalvar();
                        } else if (input == 2) {
                            JOptionPane.showMessageDialog(rootPane, "Operação Cancelada e não salva!!");
                            cancelamentoSalvar();
                        }
                    } else {
                        control.SalvarEmprestimo(mod);
                        finalizarSalvar();
                    }
                } 
                
            }
            //ELSE EDITAR
            else{
                mod.setNomeAmigoEmprestado(jTextFieldNomeAmigo.getText());
                mod.setLivroEmprestado(jTextFieldLivro.getText());
                mod.setDataEmprestimo(jFormattedTextFieldDataRetirada.getText());
                mod.setDataDevolucao(jFormattedTextFieldDataDevolucao.getText());                
                mod.setIdEmprestimo(Integer.parseInt(jTextFieldCodigo.getText()));
                control.EditarEmprestimo(mod);
                
                //Método ativa os menus
                jMenuNovo.setEnabled(true);
                jMenuSalvar.setEnabled(false);
                jMenuEditar.setEnabled(true);
                jMenuExluir.setEnabled(true);
                jMenuCancelar.setEnabled(false);
                jButtonBuscar.setEnabled(false);
                jButtonPesquisarAmigo.setEnabled(false);
                jButtonPesquisarLivro.setEnabled(false);
                
                jTextFieldCodigo.setEnabled(true);
                jTextFieldNomeAmigo.setEnabled(false); 
                jFormattedTextFieldDataRetirada.setEnabled(false);
                jFormattedTextFieldDataDevolucao.setEnabled(false); 
            }            
        }                
        
    }//GEN-LAST:event_jMenuSalvarMouseClicked

    private void jMenuNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuNovoMouseClicked
        if(jMenuNovo.isEnabled()){
            flag = 1;
            
            //Método ativa os menus
            jMenuNovo.setEnabled(false);
            jMenuSalvar.setEnabled(true);
            jMenuEditar.setEnabled(false);
            jMenuExluir.setEnabled(false);
            jMenuCancelar.setEnabled(true);
            jButtonBuscar.setEnabled(false);
            jButtonPesquisarAmigo.setEnabled(true);
            jButtonPesquisarLivro.setEnabled(true);

            jTextFieldCodigo.setEnabled(false);
            jTextFieldNomeAmigo.setEnabled(false); 
            jTextFieldLivro.setEnabled(false);  
            jFormattedTextFieldDataRetirada.setEnabled(true);  
            jFormattedTextFieldDataDevolucao.setEnabled(true); 
            
            
            
            jTextFieldCodigo.setText("");
            jTextFieldNomeAmigo.setText(""); 
            jTextFieldLivro.setText("");  
            jFormattedTextFieldDataRetirada.setText("");   
            jFormattedTextFieldDataDevolucao.setText(""); 
            
            DataHoje();
        }        
    }//GEN-LAST:event_jMenuNovoMouseClicked

    private void jMenuEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEditarMouseClicked
        if(jMenuEditar.isEnabled()){
            flag = 2;
            
            //Método ativa os menus
            jMenuNovo.setEnabled(false);
            jMenuSalvar.setEnabled(true);
            jMenuEditar.setEnabled(false);
            jMenuExluir.setEnabled(false);
            jMenuCancelar.setEnabled(true);
            jButtonBuscar.setEnabled(false);
            jButtonPesquisarAmigo.setEnabled(true);
            jButtonPesquisarLivro.setEnabled(true);

            jTextFieldCodigo.setEnabled(false);
            jTextFieldNomeAmigo.setEnabled(false); 
            jTextFieldLivro.setEnabled(false);  
            jFormattedTextFieldDataRetirada.setEnabled(true);  
            jFormattedTextFieldDataDevolucao.setEnabled(true);           
        }
    }//GEN-LAST:event_jMenuEditarMouseClicked

    private void jMenuCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCancelarMouseClicked
        if (jMenuCancelar.isEnabled()) {
            //Método ativa os menus
            jMenuNovo.setEnabled(true);
            jMenuSalvar.setEnabled(false);
            jMenuEditar.setEnabled(false);
            jMenuExluir.setEnabled(false);
            jMenuCancelar.setEnabled(false);
            jButtonBuscar.setEnabled(true);
            jButtonPesquisarAmigo.setEnabled(false);
            jButtonPesquisarLivro.setEnabled(false);

            jTextFieldCodigo.setEnabled(true);
            jTextFieldNomeAmigo.setEnabled(false); 
            jTextFieldLivro.setEnabled(false);  
            jFormattedTextFieldDataRetirada.setEnabled(false);  
            jFormattedTextFieldDataDevolucao.setEnabled(false);
            
            jTextFieldCodigo.setText("");
            jTextFieldNomeAmigo.setText(""); 
            jTextFieldLivro.setText("");  
            jFormattedTextFieldDataRetirada.setText("");   
            jFormattedTextFieldDataDevolucao.setText(""); 
        }           
    }//GEN-LAST:event_jMenuCancelarMouseClicked

    private void jMenuExluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExluirMouseClicked
        if(jMenuExluir.isEnabled()){
            if(!jTextFieldCodigo.equals("")){
                mod.setIdEmprestimo(Integer.parseInt(jTextFieldCodigo.getText()));
                control.ExcluirEmprestimo(mod);
                                
                //Método ativa os menus
                jMenuNovo.setEnabled(true);
                jMenuSalvar.setEnabled(false);
                jMenuEditar.setEnabled(false);
                jMenuExluir.setEnabled(false);
                jMenuCancelar.setEnabled(false);
                jButtonBuscar.setEnabled(true);
                jButtonPesquisarAmigo.setEnabled(false);
                jButtonPesquisarLivro.setEnabled(false);

                jTextFieldCodigo.setEnabled(true);
                jTextFieldNomeAmigo.setEnabled(false); 
                jTextFieldLivro.setEnabled(false);  
                jFormattedTextFieldDataRetirada.setEnabled(false);  
                jFormattedTextFieldDataDevolucao.setEnabled(false);          
                
                jTextFieldCodigo.setText("");
                jTextFieldNomeAmigo.setText(""); 
                jTextFieldLivro.setText("");  
                jFormattedTextFieldDataRetirada.setText("");   
                jFormattedTextFieldDataDevolucao.setText(""); 
            }
        }
                
    }//GEN-LAST:event_jMenuExluirMouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if(jTextFieldCodigo.getText().equals("")){
            FrmConsultaEmprestimo frmContulta = new FrmConsultaEmprestimo(null, true);
            frmContulta.setVisible(true);          
            
            String idEmprestimo = frmContulta.getIdCodigo();
            String nomeAmigo = frmContulta.getNomeAmigo();
            String livro = frmContulta.getLivroEmpre();
            String dataRetirada = frmContulta.getDataRetirada();
            String dataEntrega = frmContulta.getDataDev();
            
            jTextFieldCodigo.setText(idEmprestimo);
            jTextFieldNomeAmigo.setText(nomeAmigo);
            jTextFieldLivro.setText(livro);  
            jFormattedTextFieldDataRetirada.setText(dataRetirada);
            jFormattedTextFieldDataDevolucao.setText(dataEntrega);
            
            jMenuNovo.setEnabled(true);
            jMenuSalvar.setEnabled(false);
            jMenuEditar.setEnabled(true);
            jMenuExluir.setEnabled(true);
            jMenuCancelar.setEnabled(true);
            jButtonBuscar.setEnabled(false);
            jButtonPesquisarAmigo.setEnabled(false);
            jButtonPesquisarLivro.setEnabled(false);

            jTextFieldCodigo.setEnabled(false);
            jTextFieldNomeAmigo.setEnabled(false);
            jTextFieldLivro.setEnabled(false);
            jFormattedTextFieldDataRetirada.setEnabled(false);
            jFormattedTextFieldDataDevolucao.setEnabled(false); 
            
        }else{
            
//            control.CarregarEmprestimo(Integer.parseInt(jTextFieldCodigo.getText().toString()));          
//            String nomeAmigo = control.getNomeAmigo(); 
//            String livro = control.getLivroEmprestimo();
//            String dataRetirada = control.getDataEmprestimo();
//            String dataDevolucao = control.getDataDevolucao();
//            jTextFieldNomeAmigo.setText(nomeAmigo);
//            jTextFieldLivro.setText(livro);  
//            jFormattedTextFieldDataRetirada.setText(dataRetirada);
//            jFormattedTextFieldDataDevolucao.setText(dataDevolucao);  
//            
//            jMenuNovo.setEnabled(true);
//            jMenuSalvar.setEnabled(false);
//            jMenuEditar.setEnabled(true);
//            jMenuExluir.setEnabled(true);
//            jMenuCancelar.setEnabled(true);
//            jButtonBuscar.setEnabled(true);
//            jButtonPesquisarAmigo.setEnabled(false);
//            jButtonPesquisarLivro.setEnabled(false);
//
//            jTextFieldCodigo.setEnabled(false);
//            jTextFieldNomeAmigo.setEnabled(false);
//            jTextFieldLivro.setEnabled(false);
//            jFormattedTextFieldDataRetirada.setEnabled(false);
//            jFormattedTextFieldDataDevolucao.setEnabled(false);
            
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonPesquisarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarAmigoActionPerformed
        FrmConsultaAmigo frmContulta = new FrmConsultaAmigo(null, true);
        frmContulta.setVisible(true);
        String nomeAmigo = frmContulta.getNomeAmigo();
        jTextFieldNomeAmigo.setText(nomeAmigo);
    }//GEN-LAST:event_jButtonPesquisarAmigoActionPerformed

    private void jButtonPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarLivroActionPerformed
        FrmConsultaRevista frmContulta = new FrmConsultaRevista(null, true);
        frmContulta.setVisible(true);
        String colecao = frmContulta.getColecao();
        returnStatusLivro = frmContulta.getStatusLivro();
        
        jTextFieldLivro.setText(colecao);
    }//GEN-LAST:event_jButtonPesquisarLivroActionPerformed

       public void DataHoje(){
       //Método que pega a data do sistema
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hoje = new Date();
        jFormattedTextFieldDataRetirada.setText(df.format(hoje));
        
   }
       
       public void buscarUltimaInsercao(){
        String nomeAmigo = jTextFieldNomeAmigo.getText().toString();
        String livro = jTextFieldLivro.getText().toString();
        String dataRet = jFormattedTextFieldDataRetirada.getText().toString();
        
        
        conecta.conexao(); 
        //conecta.executaSQL("SELECT max(id_tblEmprestimo) as numeroPego FROM tblEmprestimo where nomeAmigo_tblEmprestimo = 'João Paulo' and livro_tblEmprestimo = 'Magali' and dataEmprestimo_tblEmprestimo = '05/03/2020'");
        conecta.executaSQL("SELECT max(id_tblEmprestimo) as numeroPego FROM tblEmprestimo where nomeAmigo_tblEmprestimo = '"+nomeAmigo+"' and livro_tblEmprestimo = '"+livro+"' and dataEmprestimo_tblEmprestimo = '"+dataRet+"'");
       
        try { 
            while(conecta.rs.next()){
                String idPego = conecta.rs.getString("numeroPego");
                System.out.println(idPego);
                jTextFieldCodigo.setText(idPego);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar id da coleção!\nERRO:"+ex);
        }
    }
       
       public void cancelamentoSalvar(){
           jMenuNovo.setEnabled(true);
            jMenuSalvar.setEnabled(false);
            jMenuEditar.setEnabled(false);
            jMenuExluir.setEnabled(false);
            jMenuCancelar.setEnabled(false);
            jButtonBuscar.setEnabled(true);
            jButtonPesquisarAmigo.setEnabled(false);
            jButtonPesquisarLivro.setEnabled(false);

            jTextFieldCodigo.setEnabled(true);
            jTextFieldNomeAmigo.setEnabled(false); 
            jTextFieldLivro.setEnabled(false);  
            jFormattedTextFieldDataRetirada.setEnabled(false);  
            jFormattedTextFieldDataDevolucao.setEnabled(false);
            
            jTextFieldCodigo.setText("");
            jTextFieldNomeAmigo.setText(""); 
            jTextFieldLivro.setText("");  
            jFormattedTextFieldDataRetirada.setText("");   
            jFormattedTextFieldDataDevolucao.setText("");
       }
       
       public void finalizarSalvar(){
           //Método ativa os menus
                jMenuNovo.setEnabled(true);
                jMenuSalvar.setEnabled(false);
                jMenuEditar.setEnabled(true);
                jMenuExluir.setEnabled(true);
                jMenuCancelar.setEnabled(false);
                jButtonBuscar.setEnabled(false);
                jButtonPesquisarAmigo.setEnabled(false);
                jButtonPesquisarLivro.setEnabled(false);
                
                jTextFieldCodigo.setEnabled(false);
                jTextFieldNomeAmigo.setEnabled(false);
                jFormattedTextFieldDataRetirada.setEnabled(false);
                jFormattedTextFieldDataDevolucao.setEnabled(false); 
                
                buscarUltimaInsercao();
       }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonPesquisarAmigo;
    private javax.swing.JButton jButtonPesquisarLivro;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataDevolucao;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataRetirada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCancelar;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuExluir;
    private javax.swing.JMenu jMenuNovo;
    private javax.swing.JMenu jMenuSalvar;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldLivro;
    private javax.swing.JTextField jTextFieldNomeAmigo;
    // End of variables declaration//GEN-END:variables
}
