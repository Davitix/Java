/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ServicioAlojamiento {

    Scanner leer = new Scanner(System.in);
    private List<Alojamiento> alojamientos = new ArrayList<>();

    public void crearSitios() {
        alojamientos.add(new Hotel4("Parisino", "Calle Paris", "Tercera", "Juan López", 100, 2, 5, "A", "Restaurante Parisino", 1000));
        alojamientos.add(new Hotel5("Madridiano", "Calle Berlin", "Primera", "David Guillermo", 300, 2, 5, "A", "Restaurante Parisino", 1000, 2, 1, 20));
        alojamientos.add(new Hotel4("Landino", "Calle Paris", "Tercera", "Juan López", 200, 2, 5, "A", "Restaurante Parisino", 1000));
        alojamientos.add(new Hotel5("Berliniano", "Calle Berlin", "Primera", "David Guillermo", 100, 2, 5, "A", "Restaurante Parisino", 1000, 2, 1, 20));
        alojamientos.add(new Hotel4("Marino", "Calle Paris", "Tercera", "Juan López", 300, 2, 5, "A", "Restaurante Parisino", 1000));
        alojamientos.add(new Hotel5("Caucasiano", "Calle Berlin", "Primera", "David Guillermo", 200, 2, 5, "A", "Restaurante Parisino", 1000, 2, 1, 20));
        alojamientos.add(new Camping("Bosque", "Bosque Ciudad", "Cuarta", "Juan López", true, 100, 10, 5, false));
        alojamientos.add(new Camping("Río", "Río Alba", "Quinta", "Juan López", true, 300, 10, 5, true));
        alojamientos.add(new Camping("Paramo", "Páramo Paz", "Sexta", "Juan López", true, 200, 10, 5, true));
        alojamientos.add(new Residencia("Luz", "Calle Iluminada", "Siete", "Juan López", true, 300, 10, true, true));
        alojamientos.add(new Residencia("Color", "Calle Colorida", "Ocho", "Juan López", true, 200, 10, false, true));
        alojamientos.add(new Residencia("Estrella", "Calle Estelar", "Nueve", "Juan López", true, 100, 10, false, true));
    }

    public void mostrarAlojamientos(List<Alojamiento> alojamiento) {
        for (int i = 0; i < alojamiento.size(); i++) {
            System.out.println((i + 1) + ". " + alojamiento.get(i));
        }
    }

    public void precioHoteles(List<Alojamiento> alojamientos) {
        List<Hotel> hoteles = new ArrayList<>();
        for (int i = 0; i < alojamientos.size(); i++) {
            if (alojamientos.get(i) instanceof Hotel) {
                alojamientos.get(i).precioHabitacion();
                hoteles.add((Hotel) alojamientos.get(i));
            }
        }
        Collections.sort(hoteles, Comparadores.ordenarPorPrecio);
        for (int i = 0; i < hoteles.size(); i++) {
            System.out.println((i + 1) + ". " + hoteles.get(i));
        }
    }

    public void mostrarExtraHoteleros(List<Alojamiento> alojamientos) {
        int j = 0;
        for (int i = 0; i < alojamientos.size(); i++) {
            if (alojamientos.get(i) instanceof AlojamientoExtraHotelero) {
                System.out.println((j++ + 1) + ". " + alojamientos.get(i));
            }
        }
    }

    public void mostrarCampingsRestaurante(List<Alojamiento> alojamientos) {
        int j = 0;
        for (int i = 0; i < alojamientos.size(); i++) {
            if (alojamientos.get(i) instanceof Camping) {
                Camping camping = (Camping) alojamientos.get(i);
                if (camping.isRestaurante()) {
                    System.out.println((j++ + 1) + ". " + alojamientos.get(i));
                }
            }
        }
    }

    public void mostrarResidenciaDescuento(List<Alojamiento> alojamientos) {
        int j = 0;
        for (int i = 0; i < alojamientos.size(); i++) {
            if (alojamientos.get(i) instanceof Residencia) {
                Residencia residencia = (Residencia) alojamientos.get(i);
                if (residencia.isDiscount()) {
                    System.out.println((j++ + 1) + ". " + alojamientos.get(i));
                }
            }
        }
    }

    public void menu() {
        System.out.println("Bienvenido a la selección de alojamientos");
        System.out.print("1. Mostrar todos los alojamientos\n" + "2. Hoteles del más caro al más barato\n" + "3. Camping con restaurante\n"
                + "4. Residencias con Descuento\n" + "5. Salir\n" + "Su opción: ");
        
    }

    public void opciones() {
        int opc;
        crearSitios();
        do {
            menu();
            opc = Integer.parseInt(leer.nextLine());
            System.out.println();
            switch (opc) {
                case 1:
                    mostrarAlojamientos(alojamientos);
                    break;
                case 2:
                    precioHoteles(alojamientos);
                    break;
                case 3:
                    System.out.println("\nListado de campings que tienen restaurante: ");
                    mostrarCampingsRestaurante(alojamientos);
                    break;
                case 4:
                    System.out.println("\nListado de residencias que ofrecen descuento: ");
                    mostrarResidenciaDescuento(alojamientos);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Escriba una opción válida.\n");
                    break;
            }
            
            System.out.println("\nVolver al menú anterior: ");
            
        } while (opc != 5);
    }

}
