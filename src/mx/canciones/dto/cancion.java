/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.canciones.dto;

import java.util.List;

/**
 *
 * @author DEMF
 */
public class cancion  {
    
     private String nombre;
    private String fechaestreno;
    private String genero;
    private List<cancion> cancion11;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaestreno() {
        return fechaestreno;
    }

    public void setFechaestreno(String fechaestreno) {
        this.fechaestreno = fechaestreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<cancion> getCancion11() {
        return cancion11;
    }

    public void setCancion11(List<cancion> cancion11) {
        this.cancion11 = cancion11;
    }

    @Override
    public String toString() {
        return "Cancion{" + "cancion"  + cancion11 + ", nombre=" + nombre + ", fechaestreno=" + fechaestreno + ", genero=" + genero + '}';
    }
    
   
}
