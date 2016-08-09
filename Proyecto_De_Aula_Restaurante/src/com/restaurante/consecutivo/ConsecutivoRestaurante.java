/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.consecutivo;

import com.restaurante.control.ControlUtilidades;
import javax.swing.JOptionPane;

/**
 *
 * @author FABAME
 */
public class ConsecutivoRestaurante {

    public ConsecutivoRestaurante() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(ControlUtilidades.numeroConsecutivo());
        JOptionPane.showMessageDialog(null, ControlUtilidades.numeroConsecutivo());
        ControlUtilidades.guardarConsecutivo(ControlUtilidades.numeroConsecutivo());
    }

}
