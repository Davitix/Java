/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ServicioPeliculas {

    Scanner leer = new Scanner(System.in);

    public Pelicula crearPeliculas() {
        Pelicula peli = new Pelicula();

        System.out.print("Ingrese el título de la película: ");
        peli.setTitulo(leer.nextLine());

        System.out.print("Ingrese el genero de la película: ");
        peli.setGenero(leer.nextLine());

        System.out.print("Ingrese el año de la película: ");
        peli.setAnio(leer.nextInt());

        System.out.print("Ingrese la duración (en minutos) de la película: ");
        peli.setDuracion(leer.nextInt());

        return peli;
    }

    public void listarPeliculas(Pelicula[] pelicula, int ctd) {
        if (ctd < 1) {
            System.out.println("Hasta el momento no hay películas en el sistema");
        } else {
            for (int i = 0; i < ctd; i++) {
                System.out.println((i + 1) + ". " + pelicula[i].getTitulo());
            }

        }
    }
    

    public boolean buscarPeliculas(Pelicula[] pelicula, int ctd) {
        System.out.print("Escriba un criterio para buscar la película: ");
        String criterio = leer.next();
        boolean busqueda = false;
        for (int i = 0; i < ctd; i++) {
            if (pelicula[i].getTitulo().contains(criterio)) {
                busqueda = true;
            }
        }
        return busqueda;
    }

    public boolean buscarGenero(Pelicula[] pelicula, int ctd) {
        System.out.print("Escriba un criterio de género para buscar: ");
        String criterio = leer.next();
        boolean busqueda = false;
        for (int i = 0; i < ctd; i++) {
            if (pelicula[i].getGenero().contains(criterio)) {
                busqueda = true;
            }
        }
        return busqueda;
    }

}
