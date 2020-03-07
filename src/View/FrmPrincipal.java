/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Maycon Silva
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
        
        try {
            Image icon = Toolkit.getDefaultToolkit().getImage("src/Icons/logo.jpg");
            setIconImage(icon);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", 0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuColecao = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemAmigos = new javax.swing.JMenuItem();
        jMenuItemCaixa = new javax.swing.JMenuItem();
        jMenuItemRevistas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemEmprestimo = new javax.swing.JMenuItem();
        jMenuItemLivrosEmprestados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTROS DE LIVROS");
        setFocusable(false);

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuColecao.setText("CADASTROS");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bookshelf.png"))); // NOI18N
        jMenuItem1.setText("Coleção");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuColecao.add(jMenuItem1);

        jMenuItemAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/account-plus.png"))); // NOI18N
        jMenuItemAmigos.setText("Amigos");
        jMenuItemAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemAmigosMouseClicked(evt);
            }
        });
        jMenuItemAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAmigosActionPerformed(evt);
            }
        });
        jMenuColecao.add(jMenuItemAmigos);

        jMenuItemCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/package-variant.png"))); // NOI18N
        jMenuItemCaixa.setText("Caixa");
        jMenuItemCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCaixaActionPerformed(evt);
            }
        });
        jMenuColecao.add(jMenuItemCaixa);

        jMenuItemRevistas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/book-open-page-variant.png"))); // NOI18N
        jMenuItemRevistas.setText("Revistas");
        jMenuItemRevistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRevistasActionPerformed(evt);
            }
        });
        jMenuColecao.add(jMenuItemRevistas);

        jMenuBar1.add(jMenuColecao);

        jMenu2.setText("MOVIMENTOS");

        jMenuItemEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/book-information-variant.png"))); // NOI18N
        jMenuItemEmprestimo.setText("Emprestimo");
        jMenuItemEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmprestimoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemEmprestimo);

        jMenuItemLivrosEmprestados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/book-search.png"))); // NOI18N
        jMenuItemLivrosEmprestados.setText("Livros Emprestados");
        jMenuItemLivrosEmprestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLivrosEmprestadosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemLivrosEmprestados);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmColecao form = null;
        form = new FrmColecao();
        form.setVisible(true);
        jDesktopPanePrincipal.add(form);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemAmigosMouseClicked
        
    }//GEN-LAST:event_jMenuItemAmigosMouseClicked

    private void jMenuItemAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAmigosActionPerformed
        FrmAmigo form = null;
        form = new FrmAmigo();
        form.setVisible(true);
        jDesktopPanePrincipal.add(form);
    }//GEN-LAST:event_jMenuItemAmigosActionPerformed

    private void jMenuItemCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCaixaActionPerformed
        FrmCaixa form = null;
        form = new FrmCaixa();
        form.setVisible(true);
        jDesktopPanePrincipal.add(form);
    }//GEN-LAST:event_jMenuItemCaixaActionPerformed

    private void jMenuItemRevistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRevistasActionPerformed
        FrmRevista form = null;
        form = new FrmRevista();
        form.setVisible(true);
        jDesktopPanePrincipal.add(form);
    }//GEN-LAST:event_jMenuItemRevistasActionPerformed

    private void jMenuItemEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmprestimoActionPerformed
        FrmEmprestimo form = null;
        form = new FrmEmprestimo();
        form.setVisible(true);
        jDesktopPanePrincipal.add(form);
    }//GEN-LAST:event_jMenuItemEmprestimoActionPerformed

    private void jMenuItemLivrosEmprestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLivrosEmprestadosActionPerformed
       FrmEmprestados form = null;
        form = new FrmEmprestados();
        form.setVisible(true);
        jDesktopPanePrincipal.add(form);
    }//GEN-LAST:event_jMenuItemLivrosEmprestadosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuColecao;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAmigos;
    private javax.swing.JMenuItem jMenuItemCaixa;
    private javax.swing.JMenuItem jMenuItemEmprestimo;
    private javax.swing.JMenuItem jMenuItemLivrosEmprestados;
    private javax.swing.JMenuItem jMenuItemRevistas;
    // End of variables declaration//GEN-END:variables
}
