/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alquiler;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ServicioAlquiler {

    Scanner leer = new Scanner(System.in);

    public Alquiler crearAlquiler() {
        Alquiler alquiler = new Alquiler();

        System.out.print("Ingrese el título de la película alquilada: ");
        alquiler.setTitulo(leer.nextLine());

        System.out.print("Ingrese la fecha de inicio del alquiler (mm/dd/aaaa): ");
        alquiler.setFechaInicio(new Date(leer.nextLine()));

        System.out.print("Ingrese la fecha de fin del alquiler: (mm/dd/aaaa): ");
        alquiler.setFechaFin(new Date(leer.nextLine()));

        System.out.print("El precio del alquiler es: ");
        alquiler.setPrecio(alquiler.getFechaInicio(), alquiler.getFechaFin());
        System.out.println(alquiler.getPrecio());

        return alquiler;
    }

    public void listarAlquileres(Alquiler[] alquiler, int ctd) {
        if (ctd < 1) {
            System.out.println("Hasta el momento no hay películas en el sistema: ");
        } else {
            for (int i = 0; i < ctd; i++) {
                System.out.println((i + 1) + ". " + alquiler[i].getTitulo());
            }
        }
    }

    public boolean buscarAlquiler(Alquiler[] alquiler, int ctd) {
        System.out.print("Escriba un criterio para buscar la película: ");
        Date criterio = new Date(leer.nextLine());
        boolean busqueda = false;
        for (int i = 0; i < ctd; i++) {
            if (alquiler[i].getFechaInicio().equals(criterio)) {
                busqueda = true;
            }
        }
        return busqueda;
    }

    public double ingresoTotal(Alquiler[] alquiler, int ctd) {
        double ganancia = 0;
        for (int i = 0; i < ctd; i++) {
            ganancia += alquiler[i].getPrecio();
        }
        return ganancia;
    }

}
