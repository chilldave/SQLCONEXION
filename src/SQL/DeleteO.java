/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import GUI.Grafica;
import Main.MeConnection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class DeleteO {

    public void deleteRow(String value1) {
        
        int answer = 0;
        Connection connection = MeConnection.conexion();
        int des = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the data...", "Registro", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(des == JOptionPane.YES_NO_OPTION){
        if (connection != null) {
            try {

                String SQL = "DELETE FROM ITEMS WHERE ID_PRODUCT='" + value1 + "'";
                PreparedStatement elim1 = connection.prepareStatement(SQL);
                answer = elim1.executeUpdate();
                if (answer > 0 ) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente...");
                } 
                
                elim1.close();
            } catch (SQLException e) {
                System.out.println("Error al eliminar los datos en la base de datos: " + e.getMessage());
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }

    }
    }

}
