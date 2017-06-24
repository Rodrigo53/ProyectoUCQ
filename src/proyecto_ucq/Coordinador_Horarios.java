
package proyecto_ucq;
public class Coordinador_Horarios extends javax.swing.JFrame {
    public Coordinador_Horarios() {
        this.setTitle("Principal Coordinador");
        this.setLocation(0,0);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_ConsultarDocentes = new javax.swing.JButton();
        btn_ConsultarGrupo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_regresa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Horarios");

        btn_ConsultarDocentes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ConsultarDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report_user.png"))); // NOI18N
        btn_ConsultarDocentes.setText("Consultar Docentes");
        btn_ConsultarDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarDocentesActionPerformed(evt);
            }
        });

        btn_ConsultarGrupo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ConsultarGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group.png"))); // NOI18N
        btn_ConsultarGrupo.setText("Consultar  Grupos");
        btn_ConsultarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarGrupoActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Coordinador:");

        btn_regresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_regresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/door_in.png"))); // NOI18N
        btn_regresa.setText("Regresar");
        btn_regresa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_regresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1)
                                .addGap(252, 252, 252))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel7))
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_ConsultarDocentes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ConsultarGrupo)
                        .addGap(79, 79, 79)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btn_regresa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ConsultarGrupo)
                    .addComponent(btn_ConsultarDocentes))
                .addGap(18, 18, 18)
                .addComponent(btn_regresa)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ConsultarDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarDocentesActionPerformed
        Horario_docente_coordinador obj = new Horario_docente_coordinador();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_ConsultarDocentesActionPerformed

    private void btn_ConsultarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarGrupoActionPerformed
       Horario_Grupo_Coordinador obj = new Horario_Grupo_Coordinador();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_ConsultarGrupoActionPerformed

    private void btn_regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresaActionPerformed
        Principal_Coordinador obj = new Principal_Coordinador();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_regresaActionPerformed

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
            java.util.logging.Logger.getLogger(Coordinador_Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coordinador_Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coordinador_Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coordinador_Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coordinador_Horarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ConsultarDocentes;
    private javax.swing.JButton btn_ConsultarGrupo;
    private javax.swing.JButton btn_regresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
