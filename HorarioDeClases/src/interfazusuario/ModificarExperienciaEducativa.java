/**
 *Esta clase contiene los metodos para modificar una Experiencia Educativa mediante una interfaz de usuario
 *
 * @author Luis Angel Barrientos Perez
 * @author Carlos Antonio Gallegos Palencia
 * @author Jaime Antonio Hernandez Cabrera
 * @author Gabriel Reyes Cruz
 * @author Jose Angel Rincon Martinez
 * @version 0.1
 */
package interfazusuario;

import horarioclases.Archivo;
import horarioclases.Horario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ModificarExperienciaEducativa extends javax.swing.JInternalFrame {

    private String horaModificada;
    private String materiaModificada;

    public ModificarExperienciaEducativa() {
        initComponents();

        //Metodo para quitar bordes en el JInternalFrame
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        actualizarTabla();
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
        jLabel4 = new javax.swing.JLabel();
        boxViernes = new javax.swing.JCheckBox();
        boxMiercoles = new javax.swing.JCheckBox();
        botonModificar = new javax.swing.JButton();
        boxJueves = new javax.swing.JCheckBox();
        campoHora = new javax.swing.JTextField();
        boxMartes = new javax.swing.JCheckBox();
        botonGuardar = new javax.swing.JButton();
        boxLunes = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        boxTodosLosDias = new javax.swing.JCheckBox();
        campoEE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHorario = new javax.swing.JTable();
        campoSalon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1020, 580));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Experiencia Educativa");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Salon");

        boxViernes.setBackground(new java.awt.Color(255, 255, 255));
        boxViernes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boxViernes.setText("Viernes");
        boxViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxViernesActionPerformed(evt);
            }
        });

        boxMiercoles.setBackground(new java.awt.Color(255, 255, 255));
        boxMiercoles.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boxMiercoles.setText("Miercoles");
        boxMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMiercolesActionPerformed(evt);
            }
        });

        botonModificar.setBackground(new java.awt.Color(24, 82, 157));
        botonModificar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonModificar.setText("Modificar");
        botonModificar.setBorder(null);
        botonModificar.setBorderPainted(false);
        botonModificar.setRequestFocusEnabled(false);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        boxJueves.setBackground(new java.awt.Color(255, 255, 255));
        boxJueves.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boxJueves.setText("Jueves");
        boxJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxJuevesActionPerformed(evt);
            }
        });

        campoHora.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        campoHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoHoraKeyTyped(evt);
            }
        });

        boxMartes.setBackground(new java.awt.Color(255, 255, 255));
        boxMartes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boxMartes.setText("Martes");
        boxMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMartesActionPerformed(evt);
            }
        });

        botonGuardar.setBackground(new java.awt.Color(24, 82, 157));
        botonGuardar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(null);
        botonGuardar.setBorderPainted(false);
        botonGuardar.setRequestFocusEnabled(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        boxLunes.setBackground(new java.awt.Color(255, 255, 255));
        boxLunes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boxLunes.setText("Lunes");
        boxLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxLunesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Hora");

        boxTodosLosDias.setBackground(new java.awt.Color(255, 255, 255));
        boxTodosLosDias.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boxTodosLosDias.setText("Todos los días");
        boxTodosLosDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTodosLosDiasActionPerformed(evt);
            }
        });

        campoEE.setEditable(false);
        campoEE.setBackground(new java.awt.Color(255, 255, 255));
        campoEE.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        campoEE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoEEKeyTyped(evt);
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
        tablaHorario.setAlignmentX(0.0F);
        tablaHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaHorario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaHorario);

        campoSalon.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        campoSalon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSalonKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione un elemento del horario para modificarlo");

        jLabel5.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel5.setText("MODIFICAR EXPERIENCIA EDUCATIVA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(boxLunes)
                                .addGap(10, 10, 10)
                                .addComponent(boxMartes)
                                .addGap(10, 10, 10)
                                .addComponent(boxMiercoles)
                                .addGap(10, 10, 10)
                                .addComponent(boxJueves)
                                .addGap(10, 10, 10)
                                .addComponent(boxViernes))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(boxTodosLosDias))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(campoEE, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(campoEE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(6, 6, 6)
                                    .addComponent(campoSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 46, 46)
                        .addComponent(boxTodosLosDias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxLunes)
                            .addComponent(boxMartes)
                            .addComponent(boxMiercoles)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boxJueves)
                                .addComponent(boxViernes)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxViernesActionPerformed

        if (!boxViernes.isSelected()) {
            boxTodosLosDias.setSelected(false);
        } else {
            if (boxLunes.isSelected() && boxMartes.isSelected() && boxMiercoles.isSelected() && boxJueves.isSelected()) {
                boxTodosLosDias.setSelected(true);
            }
        }
    }//GEN-LAST:event_boxViernesActionPerformed

    private void boxMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMiercolesActionPerformed

        if (!boxMiercoles.isSelected()) {
            boxTodosLosDias.setSelected(false);
        } else {
            if (boxLunes.isSelected() && boxMartes.isSelected() && boxViernes.isSelected() && boxJueves.isSelected()) {
                boxTodosLosDias.setSelected(true);
            }
        }
    }//GEN-LAST:event_boxMiercolesActionPerformed

    /**
     * El metodo botonModificarActionPerformed permite cargar los datos de la
     * Experiencia Educativa en la hora seleccionada por el usuario para su
     * modificacion
     *
     * @param evt
     * @version 0.1
     */
    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        DefaultTableModel formatoHorario = (DefaultTableModel) tablaHorario.getModel();

        int fila = tablaHorario.getSelectedRow();
        int columna = tablaHorario.getSelectedColumn();

        if (fila >= 0 && columna >= 0) {
            String elementoSeleccionado = String.valueOf(formatoHorario.getValueAt(fila, columna));
            if (!(elementoSeleccionado.equals(" "))) {
                Archivo archivo = new Archivo();
                columna = 0;
                String filaObtenida = archivo.buscarRegistro(String.valueOf(formatoHorario.getValueAt(fila, columna)), "Horario.txt", 1);
                horaModificada = filaObtenida;
                setHoraModificada(filaObtenida);
                llenarCampo(filaObtenida, elementoSeleccionado);
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una casilla con inforrmacion a modificar", "Casilla vacia", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error, seleccione una casilla", "Seleccion de casilla", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void boxJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxJuevesActionPerformed

        if (!boxJueves.isSelected()) {
            boxTodosLosDias.setSelected(false);
        } else {
            if (boxLunes.isSelected() && boxMartes.isSelected() && boxMiercoles.isSelected() && boxViernes.isSelected()) {
                boxTodosLosDias.setSelected(true);
            }
        }
    }//GEN-LAST:event_boxJuevesActionPerformed

    private void campoHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoHoraKeyTyped

        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_campoHoraKeyTyped

    private void boxMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMartesActionPerformed

        if (!boxMartes.isSelected()) {
            boxTodosLosDias.setSelected(false);
        } else {
            if (boxLunes.isSelected() && boxViernes.isSelected() && boxMiercoles.isSelected() && boxJueves.isSelected()) {
                boxTodosLosDias.setSelected(true);
            }
        }
    }//GEN-LAST:event_boxMartesActionPerformed

    /**
     * El metodo botonGuardarActionPerformed permite guardar la informacion
     * modificada de la Experiencia Educativa en el horario
     *
     * @param evt
     * @version 0.1
     */
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        borrarDato();
        if (!campoEE.getText().equals("")) {
            if (!campoHora.getText().equals("")) {
                if (!campoSalon.getText().equals("")) {
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
                                String horarioCompleto = horario.crearFormatoRegistro(campoEE.getText(), campoHora.getText(), boxSeleccionados, campoSalon.getText());
                                archivo.agregarRegistro("Horario.txt", horarioCompleto);
                                actualizarTabla();
                                vaciarCampos();
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
                    JOptionPane.showMessageDialog(this, "No se ha ingresado el número de Salón.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se ha  ingresado la hora de Clase.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha ingresado el nombre de la Experiencia Educativa.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void boxLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxLunesActionPerformed

        if (!boxLunes.isSelected()) {
            boxTodosLosDias.setSelected(false);
        } else {
            if (boxViernes.isSelected() && boxMartes.isSelected() && boxMiercoles.isSelected() && boxJueves.isSelected()) {
                boxTodosLosDias.setSelected(true);
            }
        }
    }//GEN-LAST:event_boxLunesActionPerformed

    private void boxTodosLosDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTodosLosDiasActionPerformed

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

    private void campoEEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEEKeyTyped

        char caracter = evt.getKeyChar();
        if (!Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_campoEEKeyTyped

    private void campoSalonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSalonKeyTyped

        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_campoSalonKeyTyped

    /**
     * El metodo actualizarTabla permite actualizar automaticamente los
     * registros de la tabla horario despues de modificar una clase seleccionada
     *
     * @version 0.1
     */
    private void actualizarTabla() {
        DefaultTableModel formatoHorario = (DefaultTableModel) tablaHorario.getModel();
        Archivo archivito = new Archivo();
        Horario horarioClases = new Horario();
        String horario[] = archivito.leerArchivo("Horario.txt");
        String experienciasEducativas[] = archivito.leerArchivo("ExperienciasEducativas.txt");
        formatoHorario.setRowCount(0);
        String horarioOrdenado[] = horarioClases.ordenarHorario(horario);
        for (int i = 0; i < horario.length; i++) {
            formatoHorario.addRow(horarioOrdenado[i].split("/"));
        }
    }

    /**
     * El metodo llenarCampo permite recibir los datos de la materia
     * seleccionada para que el usuario pueda modificarlos
     *
     * @param texto Este parametro recibe el horario en un formato
     * predeterminado
     * @param materiaBuscada Este parametro recibe la materia que el usuario
     * desea modificar
     * @version 0.1
     */
    private void llenarCampo(String texto, String materiaBuscada) {
        diaSeleccionado(0);
        String[] arreglo = texto.split("/");
        String salon = "", materia = "";
        campoHora.setText(arreglo[0].split(":")[0]);
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i].equalsIgnoreCase(materiaBuscada)) {
                salon = String.valueOf(arreglo[i].charAt(arreglo[i].length() - 2));
                diaSeleccionado(i);
                char caracter;
                if (materia.equals("")) {
                    for (int j = arreglo[i].length() - 4; j >= 0; j--) {
                        caracter = arreglo[i].charAt(j);
                        materia = caracter + materia;
                    }
                }
            }
        }
        campoEE.setText(materia);
        campoSalon.setText(salon);
        setMateriaModificada(materiaBuscada);
    }

    /**
     * El metodo diaSeleccionado permite saber en que dia se toma la clase
     *
     * @param dia Este parametro recibe un numero para indicar el dia en que
     * toma la Experiencia Educativa en el horario
     * @version 0.1
     */
    private void diaSeleccionado(int dia) {
        if (dia == 0) {
            boxLunes.setSelected(false);
            boxMartes.setSelected(false);
            boxMiercoles.setSelected(false);
            boxJueves.setSelected(false);
            boxViernes.setSelected(false);
        }
        if (dia == 1) {
            boxLunes.setSelected(true);
        }
        if (dia == 2) {
            boxMartes.setSelected(true);
        }
        if (dia == 3) {
            boxMiercoles.setSelected(true);
        }
        if (dia == 4) {
            boxJueves.setSelected(true);
        }
        if (dia == 5) {
            boxViernes.setSelected(true);
        }
    }

    private void vaciarCampos() {
        campoEE.setText("");
        campoHora.setText("");
        campoSalon.setText("");
        boxLunes.setSelected(false);
        boxMartes.setSelected(false);
        boxMiercoles.setSelected(false);
        boxJueves.setSelected(false);
        boxViernes.setSelected(false);
        boxTodosLosDias.setSelected(false);
    }

    /**
     * El metodo borrarDato permite borrar el registro seleccionado por el
     * usuario antes de modificar el horario
     *
     * @version 0.1
     */
    private void borrarDato() {
        Archivo archivo = new Archivo();
        String[] arregloHora = getHoraModificada().split("/");
        String horaNueva = arregloHora[0] + "/";
        boolean vacio = true; //Variable para verificar si una hora esta vacia
        for (int i = 1; i < arregloHora.length; i++) {
            if (arregloHora[i].equalsIgnoreCase(getMateriaModificada())) {
                horaNueva += " /";
            } else {
                horaNueva += arregloHora[i] + "/";
            }
        }
        for (int i = 1; i < horaNueva.split("/").length; i++) {
            if (!horaNueva.split("/")[i].equals(" ")) {
                vacio = false;
            }
        }
        archivo.modificarRegistro("Horario.txt", horaNueva, vacio);
    }

    public void setHoraModificada(String horaModificada) {
        this.horaModificada = horaModificada;
    }

    public String getHoraModificada() {
        return this.horaModificada;
    }

    public void setMateriaModificada(String materiaModificada) {
        this.materiaModificada = materiaModificada;
    }

    public String getMateriaModificada() {
        return this.materiaModificada;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JCheckBox boxJueves;
    private javax.swing.JCheckBox boxLunes;
    private javax.swing.JCheckBox boxMartes;
    private javax.swing.JCheckBox boxMiercoles;
    private javax.swing.JCheckBox boxTodosLosDias;
    private javax.swing.JCheckBox boxViernes;
    private javax.swing.JTextField campoEE;
    private javax.swing.JTextField campoHora;
    private javax.swing.JTextField campoSalon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHorario;
    // End of variables declaration//GEN-END:variables
}
