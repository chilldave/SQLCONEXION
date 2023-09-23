/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import GUI.Grafica;
import Main.MeConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author CarlosUMG
 */
public class UpdateData {

//    String SQL_Update = "";
    public int UpdateInformacion(int id, String name, String des, float price, int stock, String exp) {
        //solicitamos la sentencia SQL UPDATE
        
        
        String SQL_Update = "UPDATE ITEMS SET NAME='" + name + 
                "',DESCRIPTION='" + des + 
                "', PRICE= '" + price + 
                "', STOCK= '" + stock + 
                "', EXPIRATION_DATE='" + exp + 
                "' WHERE  ID_PRODUCT='" + id + "'";
        int res = 0;

        Connection connection = MeConnection.conexion();
        if (connection != null) {
            try {
                PreparedStatement statement = connection.prepareStatement(SQL_Update);
                res = statement.executeUpdate();
//                System.out.println("This is a message " + res);
                
//                    JOptionPane.showMessageDialog(null, "Registro guardado...");
                    statement.close();
               
            } catch (SQLException e) {
                System.err.println("Error al guardar los datos en la db..." + e.getMessage());
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la db..." + e.getMessage());
                }
            }
        }

        return res;
    }

}
