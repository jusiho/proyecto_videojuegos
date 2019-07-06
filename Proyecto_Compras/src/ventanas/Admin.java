
package ventanas;

import archivos_cuenta_usuario.CuentaUsuario;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Admin extends javax.swing.JFrame {

   
    public Admin() {
        initComponents();
        setSize(490,330);
        setResizable(false);
        setTitle("ADMINISTRADOR");
        setLocationRelativeTo(null);
        
         ImageIcon wallpaper =new ImageIcon("src/imagenes/ESTRELLAS.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(label_estrellas.getWidth(),
                label_estrellas.getHeight(), Image.SCALE_DEFAULT));
        label_estrellas.setIcon(icono);
        this.repaint();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btIngresar = new javax.swing.JButton();
        txtIdAdmin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassAdmin = new javax.swing.JPasswordField();
        label_estrellas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btIngresar.setText("INGRESAR");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btIngresar);
        btIngresar.setBounds(200, 220, 110, 40);
        getContentPane().add(txtIdAdmin);
        txtIdAdmin.setBounds(220, 100, 160, 30);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Usuario :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 110, 91, 14);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 150, 80, 14);
        getContentPane().add(txtPassAdmin);
        txtPassAdmin.setBounds(220, 140, 160, 30);
        getContentPane().add(label_estrellas);
        label_estrellas.setBounds(0, 0, 490, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
        String idAdmin=txtIdAdmin.getText();
        String passAdmin=txtPassAdmin.getText();
        if((idAdmin.compareTo("")==0)&&passAdmin.compareTo("")==0)
          { 
              JOptionPane.showMessageDialog(null,"no se a ingresado ningun dato ");
          }
        else
        {
         CuentaUsuario cuenta = new CuentaUsuario();
         String nombre = cuenta.llamarAdmin(idAdmin);
         String contra = cuenta.llamarPassAdmin(idAdmin);
         JOptionPane.showMessageDialog(null,"este es"+cuenta.llamarAdmin(idAdmin));
         if((contra.compareTo(passAdmin)==0)&&nombre.compareTo(idAdmin)==0)
         {
            JOptionPane.showMessageDialog(null," bienvenido prro");
            Interfaz_Admin interfazadmin = new Interfaz_Admin();
            interfazadmin.setVisible(true);
            this.dispose();
         
         }else
         {
             JOptionPane.showMessageDialog(null,"a ingresado mal");
         }
        }
    }//GEN-LAST:event_btIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_estrellas;
    private javax.swing.JTextField txtIdAdmin;
    private javax.swing.JPasswordField txtPassAdmin;
    // End of variables declaration//GEN-END:variables
}