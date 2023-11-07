package Entidad;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author david
 */
public class Alquiler {

    private String nombre;
    private int documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barcoOcupa;

    Scanner leer = new Scanner(System.in).reset();

    public boolean fechasValidas(LocalDate fechaAlq, LocalDate fechaDev) {
        if (fechaAlq.isAfter(fechaDev) || fechaAlq.equals(fechaDev)) {
            System.out.println("La fecha del Alquiler es anterior a la de devolución.");
            return false;
        } else {
            return true;
        }
    }

    public boolean precioAlquiler(Barco barco) {
        String opcion = null;
        boolean valido = false;
        do {
            System.out.print("Escriba la fecha del alquiler (yyyy/mm/dd): ");
            Date fecha = new Date(leer.nextLine());
            fechaAlquiler = LocalDate.of(fecha.getYear(), fecha.getMonth() + 1, fecha.getDate());
            System.out.print("Escriba la fecha de devolución (yyyy/mm/dd): ");
            fecha = new Date(leer.nextLine());
            fechaDevolucion = LocalDate.of(fecha.getYear(), fecha.getMonth() + 1, fecha.getDate());
            valido = fechasValidas(fechaAlquiler, fechaDevolucion);
            if (!valido) {
                System.out.println("A-Intentar con otra fecha / B - Salir");
                opcion = leer.nextLine();
            } 
        } while (!valido && !opcion.equalsIgnoreCase("B"));

        if (valido) {
            Period period = Period.between(fechaAlquiler, fechaDevolucion);
            System.out.println("El precio del alquiler es: " + period.getDays() * barco.modulo());
        }
        return valido;
    }

    public void mostrarBarcos(List<Barco> barcos) {
        for (int i = 0; i < barcos.size(); i++) {
            System.out.println((i + 1) + ". " + barcos.get(i));
        }
    }

    public void menu(List<Barco> barcos) {
        System.out.println("Seleccione el tipo de Barco que desea alquilar: ");
        mostrarBarcos(barcos);
        System.out.print("Barco número: ");
    }

    public void opciones(List<Barco> barcos) {
        String alquila;
        do {
            menu(barcos);
            int opc = Integer.parseInt(leer.nextLine()) - 1;
            while (opc > barcos.size()) {
                System.out.println("El número ingresado no corresponde a un registro de nuestros barcos.\n");
                menu(barcos);
                opc = Integer.parseInt(leer.nextLine()) - 1;
            }
            if (precioAlquiler(barcos.get(opc))) {
                System.out.println("Desea alquilarlo: Y-(Si) / N-(Mirar otro barco) / S-(Salir)");
            } else {
                System.out.println("N-(Mirar otro barco) / S-(Salir)");
            }
            alquila = leer.nextLine();
        } while (!alquila.equalsIgnoreCase("Y") && !alquila.equalsIgnoreCase("S"));

        if (alquila.equalsIgnoreCase("Y")) {
            System.out.println("Alquiler realizado!");
        }
    }
}
