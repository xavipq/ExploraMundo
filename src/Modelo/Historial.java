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
public class Historial {
    
private int idHistorial;
    private Date fecha;
    private String descripcion;
    private int idCliente;

    public Historial(int idHistorial, Date fecha, String descripcion, int idCliente) {
        this.idHistorial = idHistorial;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.idCliente = idCliente;
    }

    public Historial(Date fecha, String descripcion, int idCliente) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.idCliente = idCliente;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    }

