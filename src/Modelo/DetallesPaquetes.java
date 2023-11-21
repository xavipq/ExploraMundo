/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author hp
 */
public class DetallesPaquetes {
    private int idDetallesPaquetes;
    private String Precio;
    private String Cantidad;
    private String IDReserva;
    private String IDPaquete;
            
    
     public DetallesPaquetes(int idDetallesPaquetes, String Precio, String Cantidad, String IDReserva, String IDPaquete) {
        this.idDetallesPaquetes = idDetallesPaquetes;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
     }

    public int getIdDetallesPaquetes() {
        return idDetallesPaquetes;
    }

    public void setIdDetallesPaquetes(int idDetallesPaquetes) {
        this.idDetallesPaquetes = idDetallesPaquetes;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getIDReserva() {
        return IDReserva;
    }

    public void setIDReserva(String IDReserva) {
        this.IDReserva = IDReserva;
    }

    public String getIDPaquete() {
        return IDPaquete;
    }

    public void setIDPaquete(String IDPaquete) {
        this.IDPaquete = IDPaquete;
    }
    
    
}