/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.canciones.dto;


public class Artista extends Album{
   
        
        
    private String nombrecancion;
    private String edad;
    private String nacionalidad;

    public String getNombre() {
        return nombrecancion;
    }

    public void setNombre(String nombre) {
        this.nombrecancion = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombrecancion + ", edad=" + edad + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
    
    
}
