/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopoo_2;

import Entidad.*;
import Servicio.*;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class DesafioPOO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        ServicioPeliculas sp = new ServicioPeliculas();
        Pelicula[] peliculas = new Pelicula[5];

        ServicioAlquiler sa = new ServicioAlquiler();
        Alquiler[] alquileres = new Alquiler[3];

        menu();
        int opc = leer.nextInt();
        opciones(opc, sp, sa, peliculas, alquileres);

    }

    public static void menu() {
        System.out.println("1. Crear Película\n"
                + "2. Crear Alquiler\n"
                + "3. Listar todas las películas disponibles\n"
                + "4. Listar todas los alquileres\n"
                + "5. Buscar una película por título\n"
                + "6. Buscar una película por género\n"
                + "7. Buscar un alquiler por fecha\n"
                + "8. Calcular el ingreso total del servicion\n"
                + "9. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void opciones(int opc, ServicioPeliculas sp, ServicioAlquiler sa, Pelicula[] pelicula, Alquiler[] alquiler) {

        Scanner leer = new Scanner(System.in);

        int i = 0, j = 0;

        while (opc != 9) {
            switch (opc) {
                case 1:
                    pelicula[i] = sp.crearPeliculas();
                    if (i<pelicula.length){
                        i++;
                    }
                    break;
                case 2:
                    alquiler[j] = sa.crearAlquiler();
                    if (j<alquiler.length){
                        j++;
                    }
                    break;
                case 3:
                    sp.listarPeliculas(pelicula, i);
                    break;
                case 4:
                    sa.listarAlquileres(alquiler, j);
                    break;
                case 5:
                    if (sp.buscarPeliculas(pelicula, i)){
                        System.out.println("La película está en el listado.");
                    } else {
                        System.out.println("La película no existe.");
                    }
                    break;
                case 6:
                    if (sp.buscarGenero(pelicula, i)){
                    System.out.println("La película está en el listado.");
                    } else {
                        System.out.println("La película no existe.");
                    }
                    break;
                case 7:
                    if (sa.buscarAlquiler(alquiler, j)){
                    System.out.println("La película está en el listado.");
                    } else {
                        System.out.println("La película no existe.");
                    }
                    break;
                case 8:
                    System.out.println("El ingreso total es de: " + sa.ingresoTotal(alquiler, j));
                    break;
                case 9:
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, escriba una opción de selección válida.");
                    break;
            }
            System.out.println();
            menu();
            opc = leer.nextInt();
        }
    }
}
