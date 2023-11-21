/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Xavi
 */
public class Paquetes {
    
    private int IDpaquetes;
    private String Nombrespaquetes;
    private String Descripcionpaquete;
    private int IDdestino;

    public Paquetes(int IDpaquetes, String Nombrespaquetes, String Descripcionpaquete, int IDdestino) {
        this.IDpaquetes = IDpaquetes;
        this.Nombrespaquetes = Nombrespaquetes;
        this.Descripcionpaquete = Descripcionpaquete;
        this.IDdestino = IDdestino;
    }

    public Paquetes(String Nombrespaquetes, String Descripcionpaquete) {
        this.Nombrespaquetes = Nombrespaquetes;
        this.Descripcionpaquete = Descripcionpaquete;
    }

    public int getIDpaquetes() {
        return IDpaquetes;
    }

    public void setIDpaquetes(int IDpaquetes) {
        this.IDpaquetes = IDpaquetes;
    }

    public String getNombrespaquetes() {
        return Nombrespaquetes;
    }

    public void setNombrespaquetes(String Nombrespaquetes) {
        this.Nombrespaquetes = Nombrespaquetes;
    }

    public String getDescripcionpaquete() {
        return Descripcionpaquete;
    }

    public void setDescripcionpaquete(String Descripcionpaquete) {
        this.Descripcionpaquete = Descripcionpaquete;
    }

    public int getIDdestino() {
        return IDdestino;
    }

    public void setIDdestino(int IDdestino) {
        this.IDdestino = IDdestino;
    }
}

   