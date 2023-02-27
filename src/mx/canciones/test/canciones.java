/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.canciones.test;

import java.util.ArrayList;
import java.util.List;
import mx.canciones.dto.Album;
import  mx.canciones.dto.cancion;
import mx.canciones.dto.Artista;

public class canciones {

    private static cancion cancion11;

   
    
    public static void main(String[] args) {
        
        List<cancion> cancionesfavs = new ArrayList<>();
       cancionesfavs.add(cancion11);
        
        Album album1 = new Album();
        album1. setNombre("Califonication");
        album1.setFechalanzamiento("8/06/1999");
        album1.setDisquera("Warner Records");
        
        Artista artista1= new Artista ();
        cancion cancion1 = new cancion();
        cancion1.setNombre("Calirfonication");
        cancion1.setFechaestreno("1999");
        cancion1.setGenero("Rock");
        artista1.setNombre("Red Hot Chili Peppers");
        artista1.setEdad("40 años");
        artista1.setNacionalidad("Estadounidense");
        cancion1.setCancion11(cancionesfavs);
        
        List<cancion> cancionesfavs2 = new ArrayList<>();
        cancionesfavs2.add(cancion11);
        
        Album album2 = new Album();
        album2. setNombre("Disc 1");
        album2.setFechalanzamiento("30/07/2018");
        album2.setDisquera("Alien Records");
        
        Artista artista2= new Artista ();
        cancion cancion2 = new cancion();
        cancion2.setNombre("Indio");
        cancion2.setFechaestreno("2018");
        cancion2.setGenero("Electronica");
        artista2.setNombre("Mandragora");
        artista2.setEdad("23 años");
        artista2.setNacionalidad("Mexicano");
        cancion1.setCancion11(cancionesfavs2);
        
       List<cancion> cancionesfavs3 = new ArrayList<>();
        cancionesfavs3.add(cancion11);
                
         Album album3 = new Album();
        album3. setNombre("Resistencia");
        album3.setFechalanzamiento("23/03/2019");
        album3.setDisquera("Bear Busby Productions");
        
        Artista artista3= new Artista ();
        cancion cancion3 = new cancion();
        cancion3.setNombre("Resistencia");
        cancion3.setFechaestreno("2019");
        cancion3.setGenero("Hip-hop");
        artista3.setNombre("Under Side 821");
        artista3.setEdad("30 años");
        artista3.setNacionalidad("Mexicana");
        cancion1.setCancion11(cancionesfavs3);
        
        System.out.println( album1  + "      " +  cancion1 + "      " + artista1 );
        
        System.out.println( album2  + "      " +  cancion2 + "      " + artista2 );
        
        System.out.println( album3  + "      " +  cancion3 + "      " + artista3 );
        
        
        
        
        
    
                
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
    }
    
}
