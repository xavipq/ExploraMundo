/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.*;
/**
 *
 * @author Xavi
 */
public class DAOPaquetes {
    
    public Paquetes Insertar(String Nombrespaquetes, String Descripcionpaquete, int IDdestino){
        String transaccion = "INSERT INTO Destinos (NombreDestinos, UbicacionDestinos, DescripcionDestinos)VALUES('"
                + Nombrespaquetes + "', '"
                + Descripcionpaquete + "', '"
                + IDdestino + "')" ;
         
         if (new DataBase().Actualizar(transaccion)> 0){
            return new Paquetes(Nombrespaquetes, Descripcionpaquete);
             
            }
         return null;
    }
public int Actualizar(int idDestinos, String NombreDestinos, String UbicacionDestinos,
            String DescripcionDestinos) {

String transaccion = "UPDATE Destinos SET NombreDestinos='"
                + NombreDestinos + "', UbicacionDestinos='"
                + UbicacionDestinos + "', DescripcionDestinos='"
                + DescripcionDestinos + "' WHERE idDestinos="
                +idDestinos ;

             return new DataBase().Actualizar(transaccion);
           
}            

public List obtenerDatos(){
    String transaccion = "Select * FROM Destinos";
    
List <Map> registros =new DataBase().Listar(transaccion);
List <Destinos> Destinos = new ArrayList();

for (Map registro: registros){
    Destinos aut = new Destinos ((int)registro.get("idDestinos"),
    (String) registro.get("NombreDestinos"),
    (String) registro.get("UbicacionDestinos"),
   (String) registro.get("DescripccionDestinos"));
    Destinos.add(aut);
} 
    return Destinos;
}

public int Eliminar(int id){
    String transaccion = "DELETE FROM Clientes WHERE idDestinos='"+ id + "'";
    
     return new DataBase().Actualizar(transaccion);
}
}
    