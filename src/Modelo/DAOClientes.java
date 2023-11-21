/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
 import java.util.*;
/**
 *
 * @author xaviera
 */
public class DAOClientes {
    
    public Clientes Insertar(String sexo, String nombres, String apellidos,
            String email, int edad){
        String transaccion = "INSERT INTO Clientes (sexo,nombres,apellidos,email,edad) VALUES('"
                + nombres + "', '"
                + apellidos + "', '"
                + email + "', '"
                + sexo + "', '"
                + edad + "')" ;
        
        if (new DataBase().Actualizar(transaccion)> 0){
            return new Clientes(sexo, nombres, apellidos, email, edad);
            
        }
        return null;
    }

public int Actualizar(int id, String nombres, String apellidos,
            String email, String sexo, int edad) {

String transaccion = "UPDATE Clientes SET nombres='"
                + nombres + "', apellidos='"
                + apellidos + "', email='"
                + email + "',edad='"
                + edad + "',sexo='"
                + sexo + "' WHERE idCliente="
                +id ;

return new DataBase().Actualizar(transaccion);

}

public List obtenerDatos(){
    String transaccion = "Select * FROM Clientes";
    
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Clientes> clientes = new ArrayList();
    
    for (Map registro : registros){
        Clientes aut = new Clientes((int) registro.get("idCliente"),
        (String) registro.get("nombres"),
        (String) registro.get("apellidos"),
        (String) registro.get("email"),
        (String) registro.get("sexo"),
        (int) registro.get("edad"));
     clientes.add(aut);
   }
   return clientes;
}

public int Eliminar(int id){
    String transaccion = "DELETE FROM Clientes WHERE idCliente='"+ id + "'";
    
    return new DataBase().Actualizar(transaccion);
}
}