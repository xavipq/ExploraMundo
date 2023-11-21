/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
 import java.util.*;
import java.sql.Date;
/**
 *
 * @author Alex
 */
public class DAOReserva {
    
    public Reserva Insertar(int idCliente, java.sql.Date fechaReservas){
        String transaccion = "INSERT INTO Reserva ( String idCliente, Date fechaReservas) VALUES('"
                + fechaReservas + "', '"
                + idCliente + "', '";
        
        if(new DataBase().Actualizar(transaccion)> 0){
            return new Reserva( idCliente, fechaReservas);
        }
        
        return null;
        
   }
public int Eliminar(int id){
    String transaccion = "DELETE FROM Reserva WHERE idReserva='"+ id + "'";
    
    return new DataBase().Actualizar(transaccion);
}

public int Actualizar (String fechaReservas, int idReserva, int idCliente ){
    
    String transaccion= "UPDATE Reserva SET idReserva='"
                + idCliente+ "', fechaReserva='";

             return new DataBase().Actualizar(transaccion);
           
}
public List obtenerDatos(){
    String transaccion = "Select * FROM Reserva";
    
List <Map> registros =new DataBase().Listar(transaccion);
List <Reserva> reserva = new ArrayList();

for (Map registro: registros){
  Reserva aut = new Reserva((int)registro.get("idReserva"),
    (int) registro.get("idCliente"),
   (java.sql.Date) registro.get("fechaReservas"));
    reserva.add(aut);
} 
    return reserva;
}

public int Eliminar(String idReserva){
    String transaccion = "DELETE FROM Reserva WHERE idReserva='"+ idReserva + "'";
    
     return new DataBase().Actualizar(transaccion);

}
}


