/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.*;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class serviciosCancion {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cancion crearCancion(){
        
        Cancion cancion = new Cancion();
        
        System.out.print("Ingrese el titulo de la canción: ");
        cancion.setTitulo(leer.nextLine());
        
        System.out.print("Ingrese el autor: ");
        cancion.setAutor(leer.nextLine());
        
        return cancion;
    }
    
}
