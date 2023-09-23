/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import GUI.Grafica;
import Main.MeConnection;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosUMG
 */
public class InsertData {
    //evita sql inyeCTION 

    private final String SQL_Insert = "INSERT INTO ITEMS (ID_PRODUCT,NAME,DESCRIPTION,PRICE,STOCK,EXPIRATION_DATE) "
            + "                        values (?,?,?,?,?,?)";

    public int insertData(int id, String name, String des, float price, int stock, String expiration) {
        int res=0;
        Connection connection = MeConnection.conexion();
        if (connection != null) {
            try {
                
                PreparedStatement statement = connection.prepareStatement(SQL_Insert);
                statement.setInt(1, id);
//                System.out.println(statement.getMetaData());
                statement.setString(2, name);
                
                statement.setString(3, des);
                statement.setFloat(4, price);
                statement.setInt(5, stock);
                statement.setString(6, expiration);

                res = statement.executeUpdate();
                if(res>0){
//                    JOptionPane.showMessageDialog(null, "Registro agregado exitosamente...");
                }
                statement.close();
            } catch (SQLException e) {
                System.err.println("Error en la consulta, ID duplicado: " + e.getMessage());
                                JOptionPane.showMessageDialog(null,"Ya existe un producto con el mismo ID ","Error",JOptionPane.ERROR_MESSAGE);

            } finally {
                try {
                    
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());

                }
            }

        }
        return res;
    }

 }
