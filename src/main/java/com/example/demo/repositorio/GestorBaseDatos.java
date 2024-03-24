package com.example.demo.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorBaseDatos {
    private static final String URL_BASE_DATOS = "jdbc:mysql://u20kyqkzdwdfgxk5:nn54qyw8QcGkgUE6g1r@bcm2qz5qslmt3l1njrya-mysql.services.clever-cloud.com:21380/bcm2qz5qslmt3l1njrya?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "u20kyqkzdwdfgxk5";
    private static final String CONTRASEÑA = "nn54qyw8QcGkgUE6g1r";

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
