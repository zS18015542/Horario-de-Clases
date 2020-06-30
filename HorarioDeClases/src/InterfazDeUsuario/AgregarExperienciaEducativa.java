/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazDeUsuario;

import horariodeclases.Archivo;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TheHu
 */
public class AgregarExperienciaEducativa extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarExperienciaEducativaPrueba
     */
    public AgregarExperienciaEducativa() {
       
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxViernes = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        campoHora = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoEE = new javax.swing.JTextField();
        campoSalon = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoDocente = new javax.swing.JTextField();
        boxMiercoles = new javax.swing.JCheckBox();
        boxJueves = new javax.swing.JCheckBox();
        boxMartes = new javax.swing.JCheckBox();
        boxLunes = new javax.swing.JCheckBox();
        boxTodosLosDias = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHorario = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1040, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxViernes.setText("Viernes");
        getContentPane().add(boxViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 424, -1, -1));

        campoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoraActionPerformed(evt);
            }
        });
        getContentPane().add(campoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 72, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 424, -1, -1));

        jLabel3.setText("Hora");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        campoEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEEActionPerformed(evt);
            }
        });
        getContentPane().add(campoEE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 168, 29));
        getContentPane().add(campoSalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 72, -1));

        jLabel1.setText("Experiencia Educativa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setText("Salon");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 122, -1, -1));

        jLabel2.setText("Docente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 181, -1, -1));

        campoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(campoDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 181, 63, -1));

        boxMiercoles.setText("Miercoles");
        boxMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMiercolesActionPerformed(evt);
            }
        });
        getContentPane().add(boxMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        boxJueves.setText("Jueves");
        getContentPane().add(boxJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        boxMartes.setText("Martes");
        getContentPane().add(boxMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        boxLunes.setText("Lunes");
        boxLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxLunesActionPerformed(evt);
            }
        });
        getContentPane().add(boxLunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        boxTodosLosDias.setText("Todos los días");
        getContentPane().add(boxTodosLosDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        tablaHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ));
        jScrollPane1.setViewportView(tablaHorario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 550, 123));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boxMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMiercolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxMiercolesActionPerformed

    private void boxLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxLunesActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_boxLunesActionPerformed

    private void campoHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHoraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        DefaultTableModel formatoHorario = (DefaultTableModel) tablaHorario.getModel();
   
        if (!campoEE.getText().equals("")) {
            if (!campoHora.getText().equals("")) {
                if (!campoSalon.getText().equals("")) {
                    if (!campoDocente.getText().equals("")) {
                       if (boxLunes.isSelected() || boxMartes.isSelected() || boxMiercoles.isSelected() || boxJueves.isSelected() || boxViernes.isSelected()) {
                             Archivo archivo = new Archivo();
                             String boxSeleccionados = "";
                             if (boxTodosLosDias.isSelected()) {
                               boxSeleccionados = "Lunes,Martes,Miercoles,Jueves,Viernes";
                           }
                             else{
                                 if (boxLunes.isSelected()) {
                                     boxSeleccionados = "Lunes";
                                 }
                                 if(boxMartes.isSelected()){
                                     boxSeleccionados = ",Martes";
                                 }
                                 if (boxMiercoles.isSelected()) {
                                     boxSeleccionados = ",Miercoles";
                                 }
                                 if (boxJueves.isSelected()) {
                                     boxSeleccionados = ",Jueves";
                                 }
                                 if (boxViernes.isSelected()) {
                                     boxSeleccionados = ", Viernes";
                                 }
                             }
                             //archivo.verificarHora(campoHora.getText(), )
                        }
                       else{
                           System.out.println("No se ha seleccionado ninguno de los Días.");
                       }
                    }
                    else{
                        System.out.println("No se ha ingresado el nombre del Docente.");
                    }    
                }
                else{
                    System.out.println("No se ha ingresado el número de Salón.");
                }
            }
            else{
                System.out.println("No se ha  ingresado la hora de Clase.");
            }
        }
        else{
            System.out.println("No se ha ingresado el nombre de la Experiencia Educativa.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEEActionPerformed

    private void campoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDocenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxJueves;
    private javax.swing.JCheckBox boxLunes;
    private javax.swing.JCheckBox boxMartes;
    private javax.swing.JCheckBox boxMiercoles;
    private javax.swing.JCheckBox boxTodosLosDias;
    private javax.swing.JCheckBox boxViernes;
    private javax.swing.JTextField campoDocente;
    private javax.swing.JTextField campoEE;
    private javax.swing.JTextField campoHora;
    private javax.swing.JTextField campoSalon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHorario;
    // End of variables declaration//GEN-END:variables
}
