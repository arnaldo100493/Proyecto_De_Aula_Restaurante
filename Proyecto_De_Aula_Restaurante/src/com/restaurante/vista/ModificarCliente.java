/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.vista;

import com.restaurante.control.ControlCliente;
import com.restaurante.control.Controlador;
import com.restaurante.modelo.Cliente;
import com.restaurante.utilidades.LimpiarComponentes;
import java.awt.event.KeyEvent;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author FABAME
 */
public class ModificarCliente extends JInternalFrame {
    
    private Controlador<Cliente> controladorCliente = new ControlCliente();
    private Cliente busquedaCliente = new Cliente();
    
    public ModificarCliente() {
        this.initComponents();
        this.controladorCliente.cargarDatos();
    }
    
    private void consultar() {
        if (this.textDigiteIdentificacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha escrito ninguna identificación", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            this.busquedaCliente = this.controladorCliente.consultar(this.textDigiteIdentificacion.getText());
            if (this.busquedaCliente != null) {
                this.textIdentificacion.setText(String.valueOf(this.busquedaCliente.getIdentificacion()));
                this.textNombre.setText(this.busquedaCliente.getNombre());
                this.textApellido.setText(this.busquedaCliente.getApellido());
                this.textDireccion.setText(this.busquedaCliente.getDireccion());
                this.textTelefono.setText(this.busquedaCliente.getTelefono());
                this.textCorreoElectronico.setText(this.busquedaCliente.getCorreoElectronico());
                this.comboBoxSexo.setSelectedItem(this.busquedaCliente.getSexo());
                this.textFechaRegistro.setText(this.busquedaCliente.getFechaRegistro());
            } else {
                this.limpiarCampos();
            }
        }
    }
    
    private void modificar() {
        if (this.textDigiteIdentificacion.getText().isEmpty() || this.textIdentificacion.getText().isEmpty() || this.textNombre.getText().isEmpty() || this.textApellido.getText().isEmpty() || this.textDireccion.getText().isEmpty() || this.textTelefono.getText().isEmpty() || this.textCorreoElectronico.getText().isEmpty() || this.comboBoxSexo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "No se ha consultado el cliente", "Advertencia", JOptionPane.WARNING_MESSAGE);
            this.limpiarCampos();
        } else {
            this.busquedaCliente = this.controladorCliente.consultar(this.textDigiteIdentificacion.getText());
            if (this.busquedaCliente != null) {
                this.busquedaCliente.setIdentificacion(this.textIdentificacion.getText());
                this.busquedaCliente.setNombre(this.textNombre.getText());
                this.busquedaCliente.setApellido(this.textApellido.getText());
                this.busquedaCliente.setDireccion(this.textDireccion.getText());
                this.busquedaCliente.setTelefono(this.textTelefono.getText());
                this.busquedaCliente.setCorreoElectronico(this.textCorreoElectronico.getText());
                this.busquedaCliente.setSexo(this.comboBoxSexo.getSelectedItem().toString());
                this.controladorCliente.modificar(this.busquedaCliente);
                this.limpiarCampos();
            } else {
                this.limpiarCampos();
            }
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
        labelDigiteIdentificacion = new javax.swing.JLabel();
        labelIdentificacion = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        labelFechaRegistro = new javax.swing.JLabel();
        textDigiteIdentificacion = new javax.swing.JTextField();
        textIdentificacion = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textCorreoElectronico = new javax.swing.JTextField();
        textFechaRegistro = new javax.swing.JTextField();
        comboBoxSexo = new javax.swing.JComboBox();
        buttonConsultar = new javax.swing.JButton();
        buttonConsultaCancelar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Clientes");

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        labelDigiteIdentificacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelDigiteIdentificacion.setText("Digíte Identificación:");

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

        labelSexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelSexo.setText("Sexo:");

        labelFechaRegistro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaRegistro.setText("Fecha Registro:");

        textDigiteIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDigiteIdentificacionKeyTyped(evt);
            }
        });

        textIdentificacion.setEditable(false);
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

        textFechaRegistro.setEditable(false);

        comboBoxSexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Masculino", "Femenino" }));

        buttonConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonConsultar.setText("Consultar");
        buttonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarActionPerformed(evt);
            }
        });

        buttonConsultaCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonConsultaCancelar.setText("Cancelar");
        buttonConsultaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultaCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(labelSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDigiteIdentificacion)
                                    .addComponent(labelNombre)
                                    .addComponent(labelApellido)
                                    .addComponent(labelDireccion)
                                    .addComponent(labelTelefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCorreo)
                                    .addComponent(labelIdentificacion)
                                    .addComponent(labelFechaRegistro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textDigiteIdentificacion)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(buttonConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(buttonConsultaCancelar))
                            .addComponent(textIdentificacion)
                            .addComponent(textNombre)
                            .addComponent(textApellido)
                            .addComponent(textDireccion)
                            .addComponent(textTelefono)
                            .addComponent(textFechaRegistro)
                            .addComponent(textCorreoElectronico))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDigiteIdentificacion)
                    .addComponent(textDigiteIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConsultar)
                    .addComponent(buttonConsultaCancelar))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdentificacion)
                    .addComponent(textIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelApellido)
                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDireccion)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTelefono)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(labelCorreo)
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFechaRegistro)
                            .addComponent(textFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSexo)
                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
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
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(buttonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonLimpiar)
                .addGap(32, 32, 32)
                .addComponent(buttonCancelar)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonModificar)
                    .addComponent(buttonLimpiar)
                    .addComponent(buttonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textDigiteIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDigiteIdentificacionKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textDigiteIdentificacionKeyTyped

    private void buttonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarActionPerformed
        this.consultar();
    }//GEN-LAST:event_buttonConsultarActionPerformed

    private void buttonConsultaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultaCancelarActionPerformed
        this.cancelar();
    }//GEN-LAST:event_buttonConsultaCancelarActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        this.modificar();
    }//GEN-LAST:event_buttonModificarActionPerformed

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

    private void textTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonConsultaCancelar;
    private javax.swing.JButton buttonConsultar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JComboBox comboBoxSexo;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDigiteIdentificacion;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFechaRegistro;
    private javax.swing.JLabel labelIdentificacion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textCorreoElectronico;
    private javax.swing.JTextField textDigiteIdentificacion;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textFechaRegistro;
    private javax.swing.JTextField textIdentificacion;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
