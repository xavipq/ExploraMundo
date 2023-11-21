/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Date;
/**
 *
 * @author xaviera
 */
public class Clientes {
    
    private int idCliente;
    private String sexo;
    private String nombres;
    private String Apellidos;
    private String email;
    private int edad;

    public Clientes(int idCliente, String sexo, String nombres, String Apellidos, String email, int edad) {
        this.idCliente = idCliente;
        this.sexo = sexo;
        this.nombres = nombres;
        this.Apellidos = Apellidos;
        this.email = email;
        this.edad = edad;
    }

    public Clientes(String sexo, String nombres, String Apellidos, String email, int edad) {
        this.sexo = sexo;
        this.nombres = nombres;
        this.Apellidos = Apellidos;
        this.email = email;
        this.edad = edad;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo= sexo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
