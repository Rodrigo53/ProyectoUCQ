
package proyecto_ucq;
public class Principal_Admin extends javax.swing.JFrame {
    public Principal_Admin() {
        this.setTitle("Principal Administrador");
        this.setLocation(0,0);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb_nombre_coordinador = new javax.swing.JLabel();
        btn_salir2 = new javax.swing.JButton();
        btn_cerrar_sesion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Mn_docentes = new javax.swing.JMenu();
        Mn_abc_docentes = new javax.swing.JMenuItem();
        Mn_Coordinadores = new javax.swing.JMenu();
        Mn_Asig_doc = new javax.swing.JMenuItem();
        Mn_Asig_alumn = new javax.swing.JMenuItem();
        Mn_Reportes = new javax.swing.JMenu();
        Mn_reporte_Alumno = new javax.swing.JMenuItem();
        Mn_abc_Docente = new javax.swing.JMenuItem();
        Mn_reporte_Aulas = new javax.swing.JMenuItem();
        Mn_reporte_Grupos = new javax.swing.JMenuItem();
        Mn_reporte_Alimnos = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Bienvenido Administrador:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        lb_nombre_coordinador.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lb_nombre_coordinador.setText("Nombre");

        btn_salir2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_salir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exclamation.png"))); // NOI18N
        btn_salir2.setText("Salir");
        btn_salir2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir2.setBorderPainted(false);
        btn_salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir2ActionPerformed(evt);
            }
        });

        btn_cerrar_sesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disconnect.png"))); // NOI18N
        btn_cerrar_sesion.setText("Cerrar Sesión");
        btn_cerrar_sesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cerrar_sesion.setBorderPainted(false);
        btn_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar_sesionActionPerformed(evt);
            }
        });

        Mn_docentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group.png"))); // NOI18N
        Mn_docentes.setText("ABC Usuarios");
        Mn_docentes.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        Mn_abc_docentes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mn_abc_docentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group.png"))); // NOI18N
        Mn_abc_docentes.setText("ABC Usuarios");
        Mn_abc_docentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mn_abc_docentesActionPerformed(evt);
            }
        });
        Mn_docentes.add(Mn_abc_docentes);

        jMenuBar1.add(Mn_docentes);

        Mn_Coordinadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coordinadores.png"))); // NOI18N
        Mn_Coordinadores.setText("ABC Materias");
        Mn_Coordinadores.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        Mn_Asig_doc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mn_Asig_doc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_add.png"))); // NOI18N
        Mn_Asig_doc.setText("Asignación Horarios Docentes");
        Mn_Asig_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mn_Asig_docActionPerformed(evt);
            }
        });
        Mn_Coordinadores.add(Mn_Asig_doc);

        Mn_Asig_alumn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mn_Asig_alumn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_add.png"))); // NOI18N
        Mn_Asig_alumn.setText("Asignación Horarios Alumnos");
        Mn_Asig_alumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mn_Asig_alumnActionPerformed(evt);
            }
        });
        Mn_Coordinadores.add(Mn_Asig_alumn);

        jMenuBar1.add(Mn_Coordinadores);

        Mn_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report_word.png"))); // NOI18N
        Mn_Reportes.setText("Reportes");
        Mn_Reportes.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        Mn_reporte_Alumno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mn_reporte_Alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report_user.png"))); // NOI18N
        Mn_reporte_Alumno.setText("Reporte por Alumno");
        Mn_reporte_Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mn_reporte_AlumnoActionPerformed(evt);
            }
        });
        Mn_Reportes.add(Mn_reporte_Alumno);

        Mn_abc_Docente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mn_abc_Docente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report_add.png"))); // NOI18N
        Mn_abc_Docente.setText("Reporte por Docente");
        Mn_abc_Docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mn_abc_DocenteActionPerformed(evt);
            }
        });
        Mn_Reportes.add(Mn_abc_Docente);

        Mn_reporte_Aulas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mn_reporte_Aulas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/report_users.png"))); // NOI18N
        Mn_reporte_Aulas.setText("Reporte por Aulas");
        Mn_reporte_Aulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mn_reporte_AulasActionPerformed(evt);
            }
        });
        Mn_Reportes.add(Mn_reporte_Aulas);

        Mn_reporte_Grupos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mn_reporte_Grupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group.png"))); // NOI18N
        Mn_reporte_Grupos.setText("Reporte por Grupos");
        Mn_reporte_Grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mn_reporte_GruposActionPerformed(evt);
            }
        });
        Mn_Reportes.add(Mn_reporte_Grupos);

        Mn_reporte_Alimnos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mn_reporte_Alimnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_key.png"))); // NOI18N
        Mn_reporte_Alimnos.setText("Reporte de Alumnos");
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
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_nombre_coordinador, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lb_nombre_coordinador)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cerrar_sesion)
                    .addComponent(btn_salir2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salir2ActionPerformed

    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        Login obj = new Login();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

    private void Mn_abc_docentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mn_abc_docentesActionPerformed
        // TODO add your handling code here:
        ABC_Usuarios obj = new ABC_Usuarios();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Mn_abc_docentesActionPerformed

    private void Mn_Asig_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mn_Asig_docActionPerformed
        // TODO add your handling code here:
          alta_MateriasDocentes obj = new alta_MateriasDocentes();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Mn_Asig_docActionPerformed

    private void Mn_reporte_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mn_reporte_AlumnoActionPerformed
        Principal_Alumno obj = new Principal_Alumno();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Mn_reporte_AlumnoActionPerformed

    private void Mn_abc_DocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mn_abc_DocenteActionPerformed
        Horario_docente_coordinador obj = new Horario_docente_coordinador();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Mn_abc_DocenteActionPerformed

    private void Mn_reporte_AulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mn_reporte_AulasActionPerformed
        Horario_Grupo_Coordinador  obj = new Horario_Grupo_Coordinador();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Mn_reporte_AulasActionPerformed

    private void Mn_reporte_GruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mn_reporte_GruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mn_reporte_GruposActionPerformed

    private void Mn_reporte_AlimnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mn_reporte_AlimnosActionPerformed
      Listas obj = new Listas();
        obj.setVisible(true);
        dispose();
               
    }//GEN-LAST:event_Mn_reporte_AlimnosActionPerformed

    private void Mn_Asig_alumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mn_Asig_alumnActionPerformed
        alta_MateriasAlumnos obj = new alta_MateriasAlumnos();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Mn_Asig_alumnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set thTxt_nombres look and feel */
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
            java.util.logging.Logger.getLogger(Principal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Mn_Asig_alumn;
    private javax.swing.JMenuItem Mn_Asig_doc;
    private javax.swing.JMenu Mn_Coordinadores;
    private javax.swing.JMenu Mn_Reportes;
    private javax.swing.JMenuItem Mn_abc_Docente;
    private javax.swing.JMenuItem Mn_abc_docentes;
    private javax.swing.JMenu Mn_docentes;
    private javax.swing.JMenuItem Mn_reporte_Alimnos;
    private javax.swing.JMenuItem Mn_reporte_Alumno;
    private javax.swing.JMenuItem Mn_reporte_Aulas;
    private javax.swing.JMenuItem Mn_reporte_Grupos;
    private javax.swing.JButton btn_cerrar_sesion;
    private javax.swing.JButton btn_salir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    public static javax.swing.JLabel lb_nombre_coordinador;
    // End of variables declaration//GEN-END:variables
}
