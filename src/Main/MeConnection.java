/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author CarlosUMG
 */
public class MeConnection {

    //Metodos o funciones 
    public static Connection conexion() {
        // crea un objeto tipo Connection donde se guardara la conexion a la DB
        Connection connection = null;
        // probamos si los datos son correctos
        try {
            // Cambia estos valores por los adecuados para tu instalación
            String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "C##TEST1";
            String password = "1234asdf";

            // Cargar el controlador JDBC
            Class.forName("oracle.jdbc.OracleDriver");

            // Establecer la conexión
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            if (connection != null) {
                System.out.println("Conexion exitosa a la base de datos.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        // si todo sale bien tendremos una conexion exito y nos retornara 
        return connection;
    }
}
