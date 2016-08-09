/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.control;

import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author FABAME
 */
public interface Controlador<T> {

    public void escribir();

    public void cargarDatos();

    public void registrar(T objeto);

    public T consultar(String parametro);

    public void listar(JTable tabla);

    public List<T> listar();

    public void modificar(T objeto);

    public void eliminar(String parametro);

}
