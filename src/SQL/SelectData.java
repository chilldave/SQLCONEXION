/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import Main.MeConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CarlosUMG
 */
public class SelectData {

    // metodos o funciones 
    public static List<String[]> obtenerunselect() {
        //Vamos a guardar todos los datos en este array list

        List<String[]> resultados = new ArrayList<>();
        //Hacemos una conexion a la base de datos 
        Connection connection = MeConnection.conexion();

        if (connection != null) {
            try {
                Statement statement = connection.createStatement();
                String query = "SELECT * FROM ITEMS";
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {

                    int id = resultSet.getInt("ID_PRODUCT");
                    String columna2 = resultSet.getString("NAME");
                    String columna3 = resultSet.getString("DESCRIPTION");
                    float columna4 = resultSet.getFloat("PRICE");
                    int columna5 = resultSet.getInt("STOCK");
                    String columna6 = resultSet.getString("EXPIRATION_DATE");

                    String[] fila = {String.valueOf(id),
                        columna2,
                        columna3,
                        String.valueOf(columna4),
                        String.valueOf(columna5),
                        columna6};
                    resultados.add(fila);

                }

                resultSet.close();
                statement.close();
            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null,"Error en la consulta ","Error",JOptionPane.ERROR_MESSAGE);
                System.err.println("Error en la consulta: " + e.getMessage());
                
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }

        return resultados;
    }
}
