/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Fenixs Technology
 */
public class Destinos {
    
    private int idDestinos;
    private String NombresDestinos;
    private String UbicacionDestinos;
    private String DescripccionDestinos;

    public Destinos(int idDestinos, String NombresDestinos, String UbicacionDestinos, String DescripccionDestinos) {
        this.idDestinos = idDestinos;
        this.NombresDestinos = NombresDestinos;
        this.UbicacionDestinos = UbicacionDestinos;
        this.DescripccionDestinos = DescripccionDestinos;
        
        
    }

    public Destinos(String NombresDestinos, String UbicacionDestinos, String DescripccionDestinos) {
        this.NombresDestinos = NombresDestinos;
        this.UbicacionDestinos = UbicacionDestinos;
        this.DescripccionDestinos = DescripccionDestinos;
    }

    public int getIdDestinos() {
        return idDestinos;
    }

    public void setIdDestinos(int idDestinos) {
        this.idDestinos = idDestinos;
    }

    public String getNombresDestinos() {
        return NombresDestinos;
    }

    public void setNombresDestinos(String NombresDestinos) {
        this.NombresDestinos = NombresDestinos;
    }

    public String getUbicacionDestinos() {
        return UbicacionDestinos;
    }

    public void setUbicacionDestinos(String UbicacionDestinos) {
        this.UbicacionDestinos = UbicacionDestinos;
    }

    public String getDescripccionDestinos() {
        return DescripccionDestinos;
    }

    public void setDescripccionDestinos(String DescripccionDestinos) {
        this.DescripccionDestinos = DescripccionDestinos;
    }
                    
                    
    
}
