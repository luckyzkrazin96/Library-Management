/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cmjd107.librarymanagement.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class MainVIew extends javax.swing.JFrame {

    /**
     * Creates new form MainVIew
     */
    public MainVIew() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPnlSelection = new javax.swing.JPanel();
        lblMembers = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblBooks = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblBurrowBooks = new javax.swing.JLabel();
        lblReturnBooks = new javax.swing.JLabel();
        lblManageUser = new javax.swing.JLabel();
        jPnlLoadViews = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");

        jPnlSelection.setBackground(new java.awt.Color(51, 51, 255));
        jPnlSelection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMembers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMembers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMembers.setText("Members");
        lblMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMembersMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Library Management");

        lblBooks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBooks.setText("Books");
        lblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBooksMouseClicked(evt);
            }
        });

        lblCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategory.setText("Category");
        lblCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoryMouseClicked(evt);
            }
        });

        lblBurrowBooks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBurrowBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBurrowBooks.setText("Burrow Books");

        lblReturnBooks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblReturnBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReturnBooks.setText("Return Books");
        lblReturnBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReturnBooksMouseClicked(evt);
            }
        });

        lblManageUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblManageUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageUser.setText("Manage Users");
        lblManageUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManageUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPnlSelectionLayout = new javax.swing.GroupLayout(jPnlSelection);
        jPnlSelection.setLayout(jPnlSelectionLayout);
        jPnlSelectionLayout.setHorizontalGroup(
            jPnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlSelectionLayout.createSequentialGroup()
                .addGroup(jPnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPnlSelectionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBurrowBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblReturnBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblManageUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPnlSelectionLayout.setVerticalGroup(
            jPnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlSelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBurrowBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblReturnBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPnlLoadViews.setBackground(new java.awt.Color(204, 255, 255));
        jPnlLoadViews.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnlLoadViews.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnlSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnlLoadViews, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPnlLoadViews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMembersMouseClicked
        
        loadPanel(new MemberView());

    }//GEN-LAST:event_lblMembersMouseClicked

    private void lblCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoryMouseClicked
        
        loadPanel(new CategoryView());
    }//GEN-LAST:event_lblCategoryMouseClicked

    private void lblBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBooksMouseClicked
        loadPanel(new BookView());
    }//GEN-LAST:event_lblBooksMouseClicked

    private void lblReturnBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReturnBooksMouseClicked
        loadPanel(new BookReturnView());
    }//GEN-LAST:event_lblReturnBooksMouseClicked

    private void lblManageUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageUserMouseClicked
        loadPanel(new UserView());
    }//GEN-LAST:event_lblManageUserMouseClicked

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
            java.util.logging.Logger.getLogger(MainVIew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainVIew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainVIew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainVIew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainVIew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPnlLoadViews;
    private javax.swing.JPanel jPnlSelection;
    private javax.swing.JLabel lblBooks;
    private javax.swing.JLabel lblBurrowBooks;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblManageUser;
    private javax.swing.JLabel lblMembers;
    private javax.swing.JLabel lblReturnBooks;
    // End of variables declaration//GEN-END:variables

    public void loadPanel(JPanel panel) {
        jPnlLoadViews.removeAll();
        jPnlLoadViews.add(panel);
        jPnlLoadViews.revalidate();
        jPnlLoadViews.repaint();
    }
    
}
