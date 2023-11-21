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
public class Reserva {
    private int idReserva;
    private int idCliente;
    private Date fechaReservas;

    public Reserva(int idReserva, int idCliente, Date fechaReservas) {
        this.idReserva = idReserva;
        this.idCliente = idCliente;
        this.fechaReservas = fechaReservas;
    }

    public Reserva(int idCliente, Date fechaReservas) {
        this.idCliente = idCliente;
        this.fechaReservas = fechaReservas;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaReservas() {
        return fechaReservas;
    }

    public void setFechaReservas(Date fechaReservas) {
        this.fechaReservas = fechaReservas;
    }

 

}
