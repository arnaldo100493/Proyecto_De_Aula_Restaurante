/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.jdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.MySQLDataException;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author FABAME
 */
public class MySQLConnection implements Serializable {

    private static transient Connection connection;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/restaurante";
    private static final String user = "root";
    private static final String password = "100493";

    public MySQLConnection() {
        connection = null;
    }

    public static boolean isConnected() {
        return connection != null;
    }

    public static Connection connect() {
        connection = null;
        try {
            Class.forName(driver);
            connection = (Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró el driver de conexión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (MySQLDataException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            return connection;
        }
    }

    public static void closeConnection() {
        try {
            if (isConnected()) {
                connection.close();
            }
        } catch (MySQLDataException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
