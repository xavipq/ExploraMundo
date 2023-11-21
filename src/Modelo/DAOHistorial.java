/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
/**
 *
 * @author xavi
 */
public class DAOHistorial {
   private Connection connection;

    public void agregarHistorial(Historial historial) {
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO historial (Id_historial, fecha, descripcion, Id_cliente) VALUES (?, ?, ?, ?)")) {
            statement.setInt(1, historial.getIdHistorial());
            statement.setDate(2, historial.getFecha());
            statement.setString(3, historial.getDescripcion());
            statement.setInt(4, historial.getIdCliente());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
                  }
    }
    public Historial obtenerHistorial(int idHistorial) {
       
        return null;
    }

    public List<Historial> obtenerTodosLosHistoriales() {
      
        return new ArrayList<>();
    }

    public void actualizarHistorial(Historial historial) {
      
    }

    public void eliminarHistorial(int idHistorial) {
    
}
}
