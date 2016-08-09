/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author FABAME
 */
public class ControlArchivo implements Serializable {

    private static final String ruta = "../Proyecto_De_Aula_Restaurante/src/com/restaurante/archivos/";

    public ControlArchivo() {

    }

    public static void guardarArchivo(List listado, String archivo) throws IOException {
        ObjectOutput output = null;
        try {
            File file = new File(ruta, archivo);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.exists()) {
                output = new ObjectOutputStream(new FileOutputStream(file));
                output.writeObject(listado);
            }
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public static List leerArchivo(String archivo) throws IOException, ClassNotFoundException {
        List<Object> listado = null;
        ObjectInputStream input = null;
        try {
            File file = new File(ruta, archivo);
            if (file.exists()) {
                input = new ObjectInputStream(new FileInputStream(file));
                listado = (List<Object>) input.readObject();
            }
        } finally {
            if (input != null) {
                input.close();
            }

        }
        return listado;
    }

    public static void escribirObjeto(Object objeto, String archivo) throws IOException {
        ObjectOutput output = null;
        try {
            File file = new File(ruta, archivo);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.exists()) {
                output = new ObjectOutputStream(new FileOutputStream(file));
                output.writeObject(objeto);
            }
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public static Object leerObjeto(String archivo) throws IOException, ClassNotFoundException {
        Object objeto = null;
        ObjectInputStream input = null;
        try {
            File file = new File(ruta, archivo);
            if (file.exists()) {
                input = new ObjectInputStream(new FileInputStream(file));
                objeto = input.readObject();
            }

        } finally {
            if (input != null) {
                input.close();
            }
        }
        return objeto;
    }
}
