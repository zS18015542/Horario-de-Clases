/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazDeUsuario;

import horariodeclases.Archivo;
import horariodeclases.Horario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
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
        actualizarTabla();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
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
        botonAgregar = new javax.swing.JButton();
        campoHora = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEE = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1020, 580));

        boxViernes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boxViernes.setText("Viernes");
        boxViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxViernesActionPerformed(evt);
            }
        });

        botonAgregar.setBackground(new java.awt.Color(24, 82, 157));
        botonAgregar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setText("Agregar");
        botonAgregar.setBorder(null);
        botonAgregar.setBorderPainted(false);
        botonAgregar.setRequestFocusEnabled(false);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        campoHora.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        campoHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoHoraKeyTyped(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(24, 82, 157));
        botonCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorder(null);
        botonCancelar.setBorderPainted(false);
        botonCancelar.setRequestFocusEnabled(false);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Hora");

        campoEE.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        campoEE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoEEKeyTyped(evt);
            }
        });

        campoSalon.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        campoSalon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSalonKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Experiencia Educativa");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Salon");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Docente");

        campoDocente.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        campoDocente.setText(" ");
        campoDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoDocenteMouseClicked(evt);
            }
        });
        campoDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoDocenteKeyTyped(evt);
            }
        });

        boxMiercoles.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boxMiercoles.setText("Miercoles");
        boxMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMiercolesActionPerformed(evt);
            }
        });

        boxJueves.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boxJueves.setText("Jueves");
        boxJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxJuevesActionPerformed(evt);
            }
        });

        boxMartes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boxMartes.setText("Martes");
        boxMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMartesActionPerformed(evt);
            }
        });

        boxLunes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boxLunes.setText("Lunes");
        boxLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxLunesActionPerformed(evt);
            }
        });

        boxTodosLosDias.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boxTodosLosDias.setText("Todos los días");
        boxTodosLosDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTodosLosDiasActionPerformed(evt);
            }
        });

        tablaHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ));
        tablaHorario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaHorario);

        tablaEE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Experiencia Educativa", "Docente"
            }
        ));
        jScrollPane2.setViewportView(tablaEE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boxLunes)
                        .addGap(15, 15, 15)
                        .addComponent(boxMartes)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxTodosLosDias)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxMiercoles)
                                .addGap(15, 15, 15)
                                .addComponent(boxJueves)
                                .addGap(18, 18, 18)
                                .addComponent(boxViernes))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(campoEE, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)
                                .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(39, 39, 39)
                                .addComponent(campoSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51)
                                .addComponent(campoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(campoEE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(campoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(campoSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxTodosLosDias)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxLunes)
                            .addComponent(boxMartes)
                            .addComponent(boxMiercoles)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boxJueves)
                                .addComponent(boxViernes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        boxTodosLosDias.setSelected(false);
        boxLunes.setSelected(false);
        boxMartes.setSelected(false);
        boxMiercoles.setSelected(false);
        boxJueves.setSelected(false);
        boxViernes.setSelected(false);
        campoEE.setText("");
        campoDocente.setText("");
        campoHora.setText("");
        campoSalon.setText("");
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void boxMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMiercolesActionPerformed
        // TODO add your handling code here:
        if (!boxMiercoles.isSelected()) {
            boxTodosLosDias.setSelected(false);
        } else {
            if (boxLunes.isSelected() && boxMartes.isSelected() && boxViernes.isSelected() && boxJueves.isSelected()) {
                boxTodosLosDias.setSelected(true);
            }
        }
    }//GEN-LAST:event_boxMiercolesActionPerformed

    private void boxLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxLunesActionPerformed
        // TODO add your handling code here:
        if (!boxLunes.isSelected()) {
            boxTodosLosDias.setSelected(false);
        } else {
            if (boxViernes.isSelected() && boxMartes.isSelected() && boxMiercoles.isSelected() && boxJueves.isSelected()) {
                boxTodosLosDias.setSelected(true);
            }
        }
    }//GEN-LAST:event_boxLunesActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

        if (!campoEE.getText().equals("")) {
            if (!campoHora.getText().equals("")) {
                if (!campoSalon.getText().equals("")) {
                    if (!campoDocente.getText().equals("")) {
                        if (boxLunes.isSelected() || boxMartes.isSelected() || boxMiercoles.isSelected() || boxJueves.isSelected() || boxViernes.isSelected()) {
                            Archivo archivo = new Archivo();
                            String boxSeleccionados = "";
                            if (boxTodosLosDias.isSelected()) {
                                boxSeleccionados = "Lunes,Martes,Miercoles,Jueves,Viernes";
                            } else {
                                if (boxLunes.isSelected()) {
                                    boxSeleccionados += "Lunes";
                                }
                                if (boxMartes.isSelected()) {
                                    boxSeleccionados += ",Martes";
                                }
                                if (boxMiercoles.isSelected()) {
                                    boxSeleccionados += ",Miercoles";
                                }
                                if (boxJueves.isSelected()) {
                                    boxSeleccionados += ",Jueves";
                                }
                                if (boxViernes.isSelected()) {
                                    boxSeleccionados += ",Viernes";
                                }
                            }
                            int horaIngresada = Integer.parseInt(campoHora.getText());
                            final int HORAENTRADA = 8, HORASALIDA = 20;
                            if (horaIngresada >= HORAENTRADA && horaIngresada <= HORASALIDA) {
                                if (archivo.verificarHora(campoHora.getText(), boxSeleccionados)) {
                                    Horario horario = new Horario();
                                    archivo.modificarTexto("ExperienciasEducativas.txt", campoEE.getText() + "/" + campoDocente.getText());
                                    String horarioCompleto = horario.crearFormatoRegistro(campoEE.getText(), campoHora.getText(), boxSeleccionados, campoSalon.getText());
                                    archivo.modificarTexto("Horario.txt", horarioCompleto);
                                    actualizarTabla();
                                } else {
                                    JOptionPane.showMessageDialog(this, "La hora y día ingresados No se encuentran disponibles");
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Error, hora fuera de rango de clases (8 - 20 hrs)", "Hora ingresada", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguno de los Días.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "No se ha ingresado el nombre del Docente.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se ha ingresado el número de Salón.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se ha  ingresado la hora de Clase.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha ingresado el nombre de la Experiencia Educativa.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_botonAgregarActionPerformed

    private void actualizarTabla() {
        DefaultTableModel formatoHorario = (DefaultTableModel) tablaHorario.getModel();
        DefaultTableModel formatoEE = (DefaultTableModel) tablaEE.getModel();
        Archivo archivito = new Archivo();
        String horario[] = archivito.leerArchivo("Horario.txt");
        String experienciasEducativas[] = archivito.leerArchivo("ExperienciasEducativas.txt");
        formatoHorario.setRowCount(0);
        formatoEE.setRowCount(0);
        String horarioOrdenado[] = ordenarHorario(horario);
        for (int i = 0; i < horario.length; i++) {
            formatoHorario.addRow(horarioOrdenado[i].split("/"));
        }
        for (int i = 0; i < experienciasEducativas.length; i++) {
            formatoEE.addRow(experienciasEducativas[i].split("/"));
        }
    }

    private String[] ordenarHorario(String[] horario) {
        String horarioOrdenado[] = new String[horario.length];
        final int HORA_CLASE = 20;
        int posicion = 0;
        for (int i = 8; i <= HORA_CLASE; i++) {
            for (int j = 0; j < horario.length; j++) {
                int horaActual = Integer.parseInt(horario[j].split("/")[0].split(":")[0]);
                if (horaActual == i) {
                    horarioOrdenado[posicion] = horario[j];
                    posicion++;
                    break;
                }
            }
        }
        return horarioOrdenado;
    }

    private void boxTodosLosDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTodosLosDiasActionPerformed
        // TODO add your handling code here:
        if (boxTodosLosDias.isSelected()) {
            boxLunes.setSelected(true);
            boxMartes.setSelected(true);
            boxMiercoles.setSelected(true);
            boxJueves.setSelected(true);
            boxViernes.setSelected(true);
        } else {
            boxLunes.setSelected(false);
            boxMartes.setSelected(false);
            boxMiercoles.setSelected(false);
            boxJueves.setSelected(false);
            boxViernes.setSelected(false);
        }
    }//GEN-LAST:event_boxTodosLosDiasActionPerformed

    private void campoDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoDocenteMouseClicked
        // TODO add your handling code here:
        if (!campoEE.getText().equals("")) {
            String experienciaEducativa = campoEE.getText();
            Archivo archivo = new Archivo();
            String profesor = archivo.buscarRegistro(experienciaEducativa, "ExperienciasEducativas.txt");
            if (!profesor.equalsIgnoreCase("")) {
                campoDocente.setText(profesor.split("/")[1]);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error, ingrese una experiencia educativa primero", "Experiencia educativa", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_campoDocenteMouseClicked

    private void boxMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMartesActionPerformed
        // TODO add your handling code here:
        if (!boxMartes.isSelected()) {
            boxTodosLosDias.setSelected(false);
        } else {
            if (boxLunes.isSelected() && boxViernes.isSelected() && boxMiercoles.isSelected() && boxJueves.isSelected()) {
                boxTodosLosDias.setSelected(true);
            }
        }
    }//GEN-LAST:event_boxMartesActionPerformed

    private void boxJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxJuevesActionPerformed
        // TODO add your handling code here:
        if (!boxJueves.isSelected()) {
            boxTodosLosDias.setSelected(false);
        } else {
            if (boxLunes.isSelected() && boxMartes.isSelected() && boxMiercoles.isSelected() && boxViernes.isSelected()) {
                boxTodosLosDias.setSelected(true);
            }
        }
    }//GEN-LAST:event_boxJuevesActionPerformed

    private void boxViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxViernesActionPerformed
        // TODO add your handling code here:
        if (!boxViernes.isSelected()) {
            boxTodosLosDias.setSelected(false);
        } else {
            if (boxLunes.isSelected() && boxMartes.isSelected() && boxMiercoles.isSelected() && boxJueves.isSelected()) {
                boxTodosLosDias.setSelected(true);
            }
        }
    }//GEN-LAST:event_boxViernesActionPerformed

    private void campoHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoHoraKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_campoHoraKeyTyped

    private void campoSalonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSalonKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_campoSalonKeyTyped

    private void campoEEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEEKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (!Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_campoEEKeyTyped

    private void campoDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDocenteKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (!Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_campoDocenteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEE;
    private javax.swing.JTable tablaHorario;
    // End of variables declaration//GEN-END:variables
}
