package com.example.demo.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorBaseDatos {
    private static final String URL_BASE_DATOS = "jdbc:mysql://rubensarco.ed.urltemporal.com:2083/cpsess4823461644/3rdparty/phpMyAdmin/index.php?route=/database/structure&db=bksmfoby_porta?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "bksmfoby";
    private static final String CONTRASEÑA = "qsN66FN8l#[Ms0";

    public static Connection obtenerConexion() throws SQLException {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL_BASE_DATOS, USUARIO, CONTRASEÑA);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            throw e;
        }
        return conexion;
    }
}
