/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.vista;

import com.restaurante.control.ControlEmpleado;
import com.restaurante.control.Controlador;
import com.restaurante.modelo.Empleado;
import com.restaurante.utilidades.LimpiarComponentes;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author FABAME
 */
public class RegistrarEmpleado extends JInternalFrame {

    private Controlador<Empleado> controladorEmpleado = new ControlEmpleado();
    private Calendar fechaRegistro = new GregorianCalendar();

    public RegistrarEmpleado() {
        this.initComponents();
        this.textFechaRegistro.setText(this.fechaRegistro.getTime().toLocaleString());
        this.controladorEmpleado.cargarDatos();
    }

    private boolean validarCampos() {
        return this.textIdentificacion.getText().isEmpty() || this.textNombre.getText().isEmpty() || this.textApellido.getText().isEmpty() || this.textDireccion.getText().isEmpty() || this.textTelefono.getText().isEmpty() || this.textCorreoElectronico.getText().isEmpty() || this.textSueldo.getText().isEmpty();
    }

    private boolean validarSexo() {
        return this.comboBoxSexo.getSelectedIndex() == 0;
    }

    private void registrar() {
        if (this.validarCampos()) {
            JOptionPane.showMessageDialog(null, "No debe dejar campos vacíos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (this.validarSexo()) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado el sexo del empleado", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            Empleado empleado = new Empleado();
            empleado.setIdentificacion(this.textIdentificacion.getText());
            empleado.setNombre(this.textNombre.getText());
            empleado.setApellido(this.textApellido.getText());
            empleado.setSueldo(Integer.parseInt(this.textSueldo.getText()));
            empleado.setSexo(this.comboBoxSexo.getSelectedItem().toString());
            empleado.setFechaRegistro(this.fechaRegistro.getTime().toLocaleString());
            this.controladorEmpleado.registrar(empleado);
            this.limpiarCampos();
        }
    }

    private void limpiarCampos() {
        LimpiarComponentes.limpiarComponentes(this.panelDatos);
    }

    private void cancelar() {
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        labelFechaRegistro = new javax.swing.JLabel();
        labelIdentificacion = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelSueldo = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        textFechaRegistro = new javax.swing.JTextField();
        textIdentificacion = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textCorreoElectronico = new javax.swing.JTextField();
        textSueldo = new javax.swing.JTextField();
        comboBoxSexo = new javax.swing.JComboBox();
        buttonRegistrar = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Empleados");

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del empleado"));

        labelFechaRegistro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaRegistro.setText("Fecha Registro: ");

        labelIdentificacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelIdentificacion.setText("Identificación:");

        labelNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelNombre.setText("Nombre:");

        labelApellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelApellido.setText("Apellido:");

        labelDireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelDireccion.setText("Dirección:");

        labelTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTelefono.setText("Teléfono:");

        labelCorreo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelCorreo.setText("Correo Electrónico:");

        labelSueldo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelSueldo.setText("Sueldo:");

        labelSexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelSexo.setText("Sexo:");

        textIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIdentificacionKeyTyped(evt);
            }
        });

        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreKeyTyped(evt);
            }
        });

        textApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textApellidoKeyTyped(evt);
            }
        });

        textTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelefonoKeyTyped(evt);
            }
        });

        textSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSueldoKeyTyped(evt);
            }
        });

        comboBoxSexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Masculino", "Femenino" }));

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup()
                        .addComponent(labelSueldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(textSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup()
                        .addComponent(labelSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIdentificacion)
                            .addComponent(labelFechaRegistro)
                            .addComponent(labelNombre)
                            .addComponent(labelApellido)
                            .addComponent(labelDireccion)
                            .addComponent(labelTelefono)
                            .addComponent(labelCorreo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textApellido)
                            .addComponent(textNombre)
                            .addComponent(textIdentificacion)
                            .addComponent(textFechaRegistro)
                            .addComponent(textDireccion)
                            .addComponent(textTelefono)
                            .addComponent(textCorreoElectronico))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFechaRegistro)
                    .addComponent(textFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdentificacion)
                    .addComponent(textIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido)
                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefono)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorreo)
                    .addComponent(textCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSueldo)
                    .addComponent(textSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSexo)
                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
        );

        buttonRegistrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonRegistrar.setText("Registrar");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });

        buttonLimpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonLimpiar.setText("Limpiar");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        buttonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonRegistrar)
                        .addGap(46, 46, 46)
                        .addComponent(buttonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegistrar)
                    .addComponent(buttonLimpiar)
                    .addComponent(buttonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        this.registrar();
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.cancelar();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIdentificacionKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textIdentificacionKeyTyped

    private void textNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c != (char) KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textNombreKeyTyped

    private void textApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textApellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c != (char) KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textApellidoKeyTyped

    private void textSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSueldoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textSueldoKeyTyped

    private void textTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JComboBox comboBoxSexo;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFechaRegistro;
    private javax.swing.JLabel labelIdentificacion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelSueldo;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textCorreoElectronico;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textFechaRegistro;
    private javax.swing.JTextField textIdentificacion;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textSueldo;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
