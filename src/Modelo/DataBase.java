/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.util.*;
/**
 *
 * @author xaviera
 */
public class DataBase {
 
    
    private final String URL= "jdbc:mysql://db4free.net:3306/dbxavi";
    private final String user= "xavi_pq@localhost";
    private final String password= "19deMayo";
    
    private Connection conexion;
    public Connection obtenerConexion(){
        return this.conexion;
    }
 
    public Connection getConnection(){
        return this.conexion;
        
    }
    public DataBase(){
    try {
          Class.forName("com.mysql.cj.jdbc.Driver");
    conexion=DriverManager.getConnection(URL, user, password);
        System.out.println("Conexión Establecida");
        
        }catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión");
            e.printStackTrace();
     }       
}
    
public int Actualizar(String consulta){
    try {
        Statement st=conexion.createStatement();
        return st.executeUpdate(consulta);
       }catch (SQLException e) {
           e.printStackTrace();
       }
    return 0;
    }

private List OrganizarDatos(ResultSet rs){
List filas=new ArrayList();
try{
    
    int numColumnas=rs.getMetaData().getColumnCount();
    while(rs.next()){
        Map<String, Object> renglon=new HashMap();
        for(int i=1; i<=numColumnas; i++){
            
            String nombreCampo=rs.getMetaData().getCatalogName(i);
            Object valor=rs.getObject(nombreCampo);
            
            renglon.put(nombreCampo, valor);
            
        }
        filas.add(renglon);
    }
}catch(SQLException e){
    e.printStackTrace();
}
return filas;

}

public List Listar(String consulta){
    ResultSet rs=null;
    List resultado=new ArrayList();
    try {
        Statement st=conexion.createStatement();
        rs=st.executeQuery(consulta);
        resultado=OrganizarDatos(rs);
        
    }catch (SQLException e){
        System.out.println("No se realizó la consulta");
        e.printStackTrace();
        
    }
    return resultado;
}

public void cerrarConexion(){
try{
    conexion.close();
    
}catch (SQLException e){
    e.printStackTrace();  
}
}
}
