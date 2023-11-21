/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.*;
/**
 *
 * @author hp
 */
public class DAODetallesPaquetes {
   
    public DetallesPaquetes Insertar(int DetallePaquetes, String Precio,
            String Cantidad, String IDReserva, String IDPaquete){
        String transaccion = "INSERT INTO DetallesPaquetes (DetallePaquetes,"
                + " Precio, Cantidad, IDReserva, IDPaquetes)VALUES('"
                + DetallePaquetes + "', '"
                + Precio + "', '"
                + IDReserva + "', '"
                + IDPaquete + "', '"
                + Cantidad + "')" ;
                
                 if (new DataBase().Actualizar(transaccion)> 0){   
            return new DetallesPaquetes (DetallePaquetes, Precio, 
                    Cantidad, IDReserva, IDPaquete);
             
    }
                 return null;
    }
    
    public int Actualizar(int DetallePaquetes,String Precio, String Cantidad, String IDReserva, String IDPaquetes){
       
        String transaccion = "UPDATE DetallePaquetes set Precios='"
                + Precio +  "',IDReserva='"
                + IDReserva + "',IDPaquetes='"
                + IDPaquetes + "',Cantidad='"
                + Cantidad ;
        
        return new DataBase().Actualizar(transaccion);
    }

    public int Eliminar (int id){
        String transaccion = "DELETE FEOM DetallesPaquetes WHERE idDetallesPaquetes='"+ id + "'";
        
        return new DataBase().Actualizar(transaccion);
    }
    
    public List obtenerDatos(){
    String transaccion = "Select * FROM DetallesPaquetes";
    
    List<Map> registros = new DataBase().Listar(transaccion);
    List<DetallesPaquetes> detallesPaquetes = new ArrayList();
    
    for (Map registro : registros){
        DetallesPaquetes aut = new DetallesPaquetes((int) registro.get("IDDetallesPaquetes"),
        (String) registro.get("Precio"),
        (String) registro.get("IDReserva"),
        (String) registro.get("IDPaquetes"),
        (String) registro.get("Cantidad"));
     detallesPaquetes.add(aut);
    
}
        return null;
    }
}
