/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante;

import com.restaurante.vista.VistaIniciarSesion;

/**
 *
 * @author FABAME
 */
public class Main {

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaIniciarSesion vista = new VistaIniciarSesion();
        vista.setVisible(true);
    }

}
