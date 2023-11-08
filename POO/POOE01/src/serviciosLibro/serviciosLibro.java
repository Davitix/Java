/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosLibro;
import Entidad.*;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class serviciosLibro {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        
        System.out.print("Ingrese el ISBN: ");
        String ISBN = leer.next();
        
        System.out.print("Ingrese el titulo: ");
        String titulo = leer.next();
        
        System.out.print("Ingrese el autor: ");
        String autor = leer.next();
        
        System.out.print("Ingrese el número de páginas: ");
        int n = leer.nextInt();
        
        return new Libro(ISBN, titulo, autor, n);
    }
    
}
