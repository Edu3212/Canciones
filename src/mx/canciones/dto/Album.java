/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.canciones.dto;

/**
 *
 * @author DEMF
 */
public class Album {
    
    private String nombrealbum;
    private String fechalanzamiento;
    private String disquera;
    
    
    public String getNombre() {
        return nombrealbum;
    }

    public void setNombre(String nombre) {
        this.nombrealbum = nombre;
    }

    public String getFechalanzamiento() {
        return fechalanzamiento;
    }

    public void setFechalanzamiento(String fechalanzamiento) {
        this.fechalanzamiento = fechalanzamiento;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    @Override
    public String toString() {
        return "Album{" + "nombre del album=" + nombrealbum + ", fecha de lanzamiento de album=" + fechalanzamiento + ", Disquera=" + disquera + "}";
    }
   
}
   
 
    
    
    
