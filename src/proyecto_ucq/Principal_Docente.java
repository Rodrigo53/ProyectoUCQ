package proyecto_ucq;
public class Principal_Docente extends javax.swing.JFrame {

    public Principal_Docente() {
        this.setTitle("Principal Docente");
        this.setLocation(0,0);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_cerrar_sesion = new javax.swing.JButton();
        Lb_Nombre_maestro = new javax.swing.JLabel();
        btn_salir1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Mn_Coordinadores = new javax.swing.JMenu();
        Mn_Asig_doc = new javax.swing.JMenuItem();
        Mn_Reportes = new javax.swing.JMenu();
        Mn_abc_Docente = new javax.swing.JMenuItem();
        Mn_reporte_Alimnos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Bienvenido Docente:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        btn_cerrar_sesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disconnect.png"))); // NOI18N
        btn_cerrar_sesion.setText("Cerrar Sesión");
        btn_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar_sesionActionPerformed(evt);
            }
        });

        Lb_Nombre_maestro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Lb_Nombre_maestro.setText("Nombre");

        btn_salir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exclamation.png"))); // NOI18N
        btn_salir1.setText("Salir");
        btn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir1ActionPerformed(evt);
            }
        });

        Mn_Coordinadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coordinadores.png"))); // NOI18N
        Mn_Coordinadores.setText("Materias");
        Mn_Coordinadores.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        Mn_Asig_doc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mn_Asig_doc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vector-calendar-icon_34677.png"))); // NOI18N
        Mn_Asig_doc.setText("Carga de Disponibilidad");
        Mn_Asig_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mn_Asig_docActionPerformed(evt);
            }
        });
        Mn_Coordinadores.add(Mn_Asig_doc);

        jMenuBar1.add(Mn_Coordinadores);

        Mn_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report_word.png"))); // NOI18N
        Mn_Reportes.setText("Reportes");
        Mn_Reportes.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        Mn_abc_Docente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mn_abc_Docente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report_add.png"))); // NOI18N
        Mn_abc_Docente.setText("Reporte por Docente");
        Mn_abc_Docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mn_abc_DocenteActionPerformed(evt);
            }
        });
        Mn_Reportes.add(Mn_abc_Docente);

        Mn_reporte_Alimnos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mn_reporte_Alimnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_key.png"))); // NOI18N
        Mn_reporte_Alimnos.setText("Lista de Alumnos");
        Mn_reporte_Alimnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mn_reporte_AlimnosActionPerformed(evt);
            }
        });
        Mn_Reportes.add(Mn_reporte_Alimnos);

        jMenuBar1.add(Mn_Reportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lb_Nombre_maestro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Lb_Nombre_maestro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cerrar_sesion)
                    .addComponent(btn_salir1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        
     /*   Login.txt_usuario = "";
        Login.ps*/
        Login obj = new Login();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

    private void btn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salir1ActionPerformed

    private void Mn_Asig_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mn_Asig_docActionPerformed
        // TODO add your handling code here:
        VistaDocentes obj = new VistaDocentes();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Mn_Asig_docActionPerformed

    private void Mn_abc_DocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mn_abc_DocenteActionPerformed
        Horario_docente_coordinador obj = new Horario_docente_coordinador();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Mn_abc_DocenteActionPerformed

    private void Mn_reporte_AlimnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mn_reporte_AlimnosActionPerformed
 Listas obj = new Listas();
        obj.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Mn_reporte_AlimnosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Docente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Lb_Nombre_maestro;
    private javax.swing.JMenuItem Mn_Asig_doc;
    private javax.swing.JMenu Mn_Coordinadores;
    private javax.swing.JMenu Mn_Reportes;
    private javax.swing.JMenuItem Mn_abc_Docente;
    private javax.swing.JMenuItem Mn_reporte_Alimnos;
    private javax.swing.JButton btn_cerrar_sesion;
    private javax.swing.JButton btn_salir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
