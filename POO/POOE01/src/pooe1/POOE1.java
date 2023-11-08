/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe1;

import Entidad.Libro;
import serviciosLibro.serviciosLibro;

/**
 *
 * @author david
 */
public class POOE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        serviciosLibro serv = new serviciosLibro();
        Libro libro = serv.crearLibro();

        System.out.println("Los datos del libro son: ");
        System.out.println("ISBN: " + libro.getISBN() + ".\nTitulo: " + libro.getTitulo()+ ".\nAutor: " + libro.getAutor() + 
                ".\nCon un total de " + libro.getNumPags() + " páginas.");
    }
    
}
