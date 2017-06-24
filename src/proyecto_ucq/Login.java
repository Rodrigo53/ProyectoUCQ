package proyecto_ucq;

import claseConectar.conectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    conectar con;
    int contador =0;
    
    public Login() {

        initComponents();
        
         
    }
    //String TipoU,String Estatus
 public void   acceder(String User,String pass){
     con = new conectar();
     Connection cn = con.getConnection();
    
    String cap = "";
    String cap_A = "";
    String sql="SELECT * FROM tusuario WHERE Usuario='"+User+"' && Clave='"+pass+"'";

   System.out.println("Usuario"+sql);
    
   try  {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("RS:"+rs);
            while(rs.next())
            {
                cap=rs.getString("Tipo_Usuario");
                cap_A=rs.getString("Estatus");
            }if((cap.equals("ALUMNO")) && (cap_A.equals("ACTIVO"))){
               
                    Principal_Alumno al = new Principal_Alumno();
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    al.setVisible(true);
                    Principal_Alumno.lb_nal.setText(User);
                    dispose();
            } else if((cap.equals("COORDINADOR"))&& (cap_A.equals("ACTIVO"))){
                    Principal_Coordinador co = new Principal_Coordinador();
                    
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    co.setVisible(true);
                    dispose();
                    Principal_Coordinador.lb_nombre_coordinador.setText(User);
            }else if((cap.equals("DOCENTE"))&& (cap_A.equals("ACTIVO"))){
                    Principal_Docente doc = new Principal_Docente();
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    doc.setVisible(true);
                     Principal_Docente.Lb_Nombre_maestro.setText(User);
                    dispose();
            }else if((cap.equals("ADMINISTRADOR"))&& (cap_A.equals("ACTIVO"))){
                     Principal_Admin adm = new Principal_Admin();
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                     adm.setVisible(true);
                     Principal_Admin.lb_nombre_coordinador.setText(User);
                    dispose();   
            }                
            else if((!cap.equals("ADMINISTRADOR"))&&(!cap.equals("DOCENTE"))&&(!cap.equals("COORDINADOR"))&&(!cap.equals("ALUMNO"))&&!cap_A.equals("ACTIVO")){
                    JOptionPane.showMessageDialog(null,"Usuario Inactivo");
                    JOptionPane.showMessageDialog(null,"Usuario o Contraseña Incorrecta Intente Otra Vez");
                     contador++;
                        if(contador<3){
                            txt_usuario.setText("");
                             psw_Contraseña.setText("");
                         }else{
                              JOptionPane.showMessageDialog(null,"Acceso denegado");
                              System.exit(0);
                      }
            }
        }catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    con.Desconectar();  
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        psw_Contraseña = new javax.swing.JPasswordField();
        Btn_entrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña:");

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        psw_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psw_ContraseñaActionPerformed(evt);
            }
        });

        Btn_entrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        Btn_entrar.setText("Entrar");
        Btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_entrarActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exclamation.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(psw_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_entrar))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(psw_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btn_salir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void psw_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psw_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psw_ContraseñaActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void Btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_entrarActionPerformed
         
        String Usuario = txt_usuario.getText();
         String Contra = psw_Contraseña.getText();  
         acceder(Usuario, Contra);
    }//GEN-LAST:event_Btn_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_entrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField psw_Contraseña;
    public static javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables



    

}