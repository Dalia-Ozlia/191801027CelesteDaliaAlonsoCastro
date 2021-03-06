/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DaoOzliaMae.DaoEmpleado;
import DaoOzliaMae.DaoHerramienta;
import DaoOzliaMae.DaoMantenimiento;
import DaoOzliaMae.DaoRefaccion;
import Empleado.Empleado;
import Herramienta.Herramienta;
import Mantenimiento.Mantenimiento;
import Refaccion.Refaccion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author celes
 */
public class Actualizar extends javax.swing.JFrame {

    /**
     * Creates new form Actualizar
     */
    public int operacion;
    
    public Actualizar() {
        initComponents();
    }

    public void etiquetaID(int operacion){
        switch (operacion){
            case 5:
                LabelIDSolicitud.setText("No. de control:");
                LabelNuevoSolicitud.setText("Nuevo nombre:");
                break;
            case 6:
                LabelIDSolicitud.setText("No. de control:");
                LabelNuevoSolicitud.setText("Tipo de empleado:");
                break;
            case 7:
                LabelIDSolicitud.setText("No. de control:");
                LabelNuevoSolicitud.setText("Nueva contraseña:");
                break;
            case 8:
                LabelIDSolicitud.setText("ID de herramienta:");
                LabelNuevoSolicitud.setText("Nuevo No. Serie:");
                break;
            case 9:
                LabelIDSolicitud.setText("ID de herramienta:");
                LabelNuevoSolicitud.setText("Nueva marca:");
                break;
            case 10:
                LabelIDSolicitud.setText("ID de herramienta:");
                LabelNuevoSolicitud.setText("Nuevo torque:");
                break;
            case 11:
                LabelIDSolicitud.setText("ID de herramienta:");
                LabelNuevoSolicitud.setText("Nueva ubicación:");
                break;
            case 12:
                LabelIDSolicitud.setText("ID mantenimiento:");
                LabelNuevoSolicitud.setText("Nuevo ID herramienta:");
                break;
            case 13:
                LabelIDSolicitud.setText("ID mantenimiento:");
                LabelNuevoSolicitud.setText("Nuevo comentario:");
                break;
            case 14:
                LabelIDSolicitud.setText("ID mantenimiento:");
                LabelNuevoSolicitud.setText("Nuevo recibe-cliente:");
                break;
            case 15:
                LabelIDSolicitud.setText("ID de refacción:");
                LabelNuevoSolicitud.setText("Nueva descripción:");
                break;
            case 16:
                LabelIDSolicitud.setText("ID de refacción:");
                LabelNuevoSolicitud.setText("Nueva marca:");
                break;
            case 17:
                LabelIDSolicitud.setText("ID de refacción:");
                LabelNuevoSolicitud.setText("Nuevo costo:");
                break;
            case 18:
                LabelIDSolicitud.setText("ID de refacción:");
                LabelNuevoSolicitud.setText("Nuevo Centro de costos:");
                break;
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

        jLabel1 = new javax.swing.JLabel();
        LabelNuevoSolicitud = new javax.swing.JLabel();
        TextIDIngreso = new javax.swing.JTextField();
        TextCambioNuevo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        LabelIDSolicitud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Actualizar");

        LabelNuevoSolicitud.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        LabelNuevoSolicitud.setText("Nuevos");

        jButton1.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        LabelIDSolicitud.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        LabelIDSolicitud.setText("IDS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(LabelIDSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(LabelNuevoSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextIDIngreso)
                    .addComponent(TextCambioNuevo))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 328, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextIDIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelIDSolicitud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNuevoSolicitud)
                    .addComponent(TextCambioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ingresoID = Integer.valueOf(TextIDIngreso.getText());
        
        Empleado empleado = new Empleado(ingresoID);
        Herramienta herramienta = new Herramienta(ingresoID);
        Mantenimiento mantenimiento = new Mantenimiento(ingresoID);
        Refaccion refaccion = new Refaccion(ingresoID);
        
        switch (operacion){
            case 5:
                String nombre = TextCambioNuevo.getText();

                empleado.setNombre(nombre);
                try {
                    DaoEmpleado.actualizar(empleado, 1);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 6:
                String empTipo = TextCambioNuevo.getText();

                empleado.setEmpTipo(empTipo);
            
                try {
                    DaoEmpleado.actualizar(empleado, 2);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 7:
                String password = TextCambioNuevo.getText();

                empleado.setPassword(password);
            
                try {
                    DaoEmpleado.actualizar(empleado, 3);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 8:
                int noSerie = Integer.valueOf(TextCambioNuevo.getText());
                
                herramienta.setNoSerie(noSerie);
            
                try {
                    DaoHerramienta.actualizar(herramienta, 1);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 9:
                String marca = TextCambioNuevo.getText();
                
                herramienta.setMarca(marca);
            
                try {
                    DaoHerramienta.actualizar(herramienta, 2);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 10:
                int torque = Integer.valueOf(TextCambioNuevo.getText());
                
                herramienta.setTorque(torque);
            
                try {
                    DaoHerramienta.actualizar(herramienta, 3);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 11:
                String ubicacion = TextCambioNuevo.getText();
                
                herramienta.setUbicacion(ubicacion);
            
                try {
                    DaoHerramienta.actualizar(herramienta, 4);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 12:
                int herrID = Integer.valueOf(TextCambioNuevo.getText());
                mantenimiento.setHerrID(herrID);
            
                try {
                    DaoMantenimiento.actualizar(mantenimiento, 2);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 13:
                String comentario = TextCambioNuevo.getText();
                mantenimiento.setComentario(comentario);
            
                try {
                    DaoMantenimiento.actualizar(mantenimiento, 3);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 14:
                String recibe = TextCambioNuevo.getText();
                mantenimiento.setRecibe(recibe);
            
                try {
                    DaoMantenimiento.actualizar(mantenimiento, 4);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 15:
                String descripcion = TextCambioNuevo.getText();
                refaccion.setDescripcion(descripcion);
            
                try {
                    DaoRefaccion.actualizar(refaccion, 1);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 16:
                String marcaRef = TextCambioNuevo.getText();
                refaccion.setMarca(marcaRef);
            
                try {
                    DaoRefaccion.actualizar(refaccion, 2);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 17:
                float costo = Float.parseFloat(TextCambioNuevo.getText());
                refaccion.setCosto(costo);
            
                try {
                    DaoRefaccion.actualizar(refaccion, 3);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 18:
                int cc = Integer.valueOf(TextCambioNuevo.getText());
                refaccion.setCc(cc);
            
                try {
                    DaoRefaccion.actualizar(refaccion, 4);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
        
        ActualizacionCorrecta actualizacionCorrecta = new ActualizacionCorrecta();
        actualizacionCorrecta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuOzLia ozLia = new MenuOzLia();
        ozLia.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelIDSolicitud;
    private javax.swing.JLabel LabelNuevoSolicitud;
    private javax.swing.JTextField TextCambioNuevo;
    private javax.swing.JTextField TextIDIngreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
