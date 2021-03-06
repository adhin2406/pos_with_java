package dashboard;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuBar;

public class FormDashboardAdmin extends javax.swing.JFrame {

    /**
     * Creates new form dashboardAdmin
     */
    public FormDashboardAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Selamat = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MenuMaster = new javax.swing.JMenu();
        FormPengguna = new javax.swing.JMenuItem();
        FormPemasok = new javax.swing.JMenuItem();
        FormPasok = new javax.swing.JMenuItem();
        FormBarang = new javax.swing.JMenuItem();
        TombolLogout = new javax.swing.JMenu();
        Logoutbtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Selamat.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        Selamat.setText("Welcome To Aplikasi Point of Sales");

        MenuMaster.setText("Data Master");

        FormPengguna.setText("Form Pengguna");
        FormPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormPenggunaActionPerformed(evt);
            }
        });
        MenuMaster.add(FormPengguna);

        FormPemasok.setText("Form Pemasok");
        FormPemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormPemasokActionPerformed(evt);
            }
        });
        MenuMaster.add(FormPemasok);

        FormPasok.setText("Form Pasok");
        FormPasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormPasokActionPerformed(evt);
            }
        });
        MenuMaster.add(FormPasok);

        FormBarang.setText("Form Barang");
        FormBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormBarangActionPerformed(evt);
            }
        });
        MenuMaster.add(FormBarang);

        MenuBar.add(MenuMaster);

        TombolLogout.setText("Logout");

        Logoutbtn.setText("Logout");
        Logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutbtnActionPerformed(evt);
            }
        });
        TombolLogout.add(Logoutbtn);

        MenuBar.add(TombolLogout);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(Selamat)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Selamat, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormPenggunaActionPerformed
      dashboard.FormPengguna z;
        try {
            z = new dashboard.FormPengguna();
            z.setVisible(true);
//            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormDashboardAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_FormPenggunaActionPerformed

    private void FormBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormBarangActionPerformed
        dashboard.FormBarang z;
        try {
            z = new dashboard.FormBarang();
            z.setVisible(true);
//            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormDashboardAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_FormBarangActionPerformed

    private void FormPasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormPasokActionPerformed
        dashboard.FormPasok z;
        try {
            z = new dashboard.FormPasok();
            z.setVisible(true);
//            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormDashboardAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FormPasokActionPerformed

    private void FormPemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormPemasokActionPerformed
        dashboard.FormPemasok z;
        try {
            z = new dashboard.FormPemasok();
            z.setVisible(true);
//            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormDashboardAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_FormPemasokActionPerformed

    private void LogoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_LogoutbtnActionPerformed

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
            java.util.logging.Logger.getLogger(FormDashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDashboardAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem FormBarang;
    private javax.swing.JMenuItem FormPasok;
    private javax.swing.JMenuItem FormPemasok;
    private javax.swing.JMenuItem FormPengguna;
    private javax.swing.JMenuItem Logoutbtn;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuMaster;
    private javax.swing.JLabel Selamat;
    private javax.swing.JMenu TombolLogout;
    // End of variables declaration//GEN-END:variables
}
