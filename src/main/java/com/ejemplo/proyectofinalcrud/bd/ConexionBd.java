package com.ejemplo.proyectofinalcrud.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBd {

    private final String url = "localhost:3306";

    private final String database = "sistema_ejemplo";

    private final String user = "root";

    private final String password = "51st3ma$2020.";

    public Connection getConection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error al encontrar el driver : " + e.getMessage());
        }
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + url + "/" + database, user, password);
            System.out.println("Conexion Abierta : " + (!con.isClosed()));
            return con;
        } catch (SQLException e) {
            System.err.println("Error al conectar a la BD : " + e.getMessage());
            return null;
        }
    }

    public void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexion : " + e.getMessage());
        }
    }
}
