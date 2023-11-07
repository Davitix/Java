/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rutina;
import java.util.*;

/**
 *
 * @author david
 */
public class ServicioRutina {

    Scanner leer = new Scanner(System.in);

    public Rutina crearRutina(List<Rutina> rutinas) {

        Rutina rtn = new Rutina();
        rtn.setId(rutinas.size()+1);
        System.out.print("Ingrese el nombre de la rutina: ");
        rtn.setNombre(leer.nextLine());
        System.out.print("Ingrese la dificultad de la rutina: ");
        rtn.setNivelDificultad(leer.nextLine());
        System.out.print("Ingrese una descripción para la rutina: ");
        rtn.setDescripcion(leer.nextLine());
        System.out.print("Ingrese la duración  de la rutina (en semanas): ");
        rtn.setDuracion(Integer.parseInt(leer.nextLine()));
        System.out.println("\nLa rutina " + rtn.getNombre().toUpperCase() + " ha sido registrada con éxito.");
        return rtn;

    }

    public void obtenerRutina(List<Rutina> rutinas) {
        if (rutinas.size() > 0) {
            System.out.println("Las rutinas disponibles son: ");
            rutinas.forEach((rutina) -> {
                System.out.println(rutina.toString());
            });
        } else {
            System.out.println("\nAún no hay rutinas en el sistema");
        }
    }

    public int conseguirId(List<Rutina> rutinas) {
        obtenerRutina(rutinas);
        System.out.print("Ingrese el ID con el que desea interactuar: ");
        int ids = Integer.parseInt(leer.nextLine());

        while (ids < 1 || ids > rutinas.size()) {
            System.out.print("El ID ingresado no es válido. Por favor ingrese un ID válido para interacturar: ");
            ids = Integer.parseInt(leer.nextLine());
        }
        return ids;
    }

    public void actualizarRutina(List<Rutina> rutinas) {

        if (rutinas.size() > 0) {
            int ids = conseguirId(rutinas) - 1, opc;
            Rutina rtn = rutinas.get(ids);

            do {
                System.out.println("¿Qué desea modificar?");
                System.out.println("1. Nombre\n" + "2. Dificultad\n" + "3. Descripcion\n" + "4. Duracion\n"
                        + "5. Todo\n" + "6. Salir" + "\nDigite una opción: ");
                opc = Integer.parseInt(leer.nextLine());

                switch (opc) {
                    case 1:
                        System.out.print("Ingrese el nuevo nombre");
                        rtn.setNombre(leer.nextLine());
                        break;
                    case 2:
                        System.out.print("Ingrese nueva dificultad");
                        rtn.setNivelDificultad(leer.nextLine());
                        break;
                    case 3:
                        System.out.print("Ingrese la nueva descripcion");
                        rtn.setDescripcion(leer.nextLine());
                        break;
                    case 4:
                        System.out.print("Ingrese nueva duracion");
                        rtn.setDuracion(Integer.parseInt(leer.nextLine()));
                        break;
                    case 5:
                        System.out.print("Ingrese el nombre de la rutina: ");
                        rtn.setNombre(leer.nextLine());
                        System.out.print("Ingrese la dificultad de la rutina: ");
                        rtn.setNivelDificultad(leer.nextLine());
                        System.out.print("Ingrese una descripción para la rutina: ");
                        rtn.setDescripcion(leer.nextLine());
                        System.out.print("Ingrese la duración  de la rutina (en semanas)");
                        rtn.setDuracion(Integer.parseInt(leer.nextLine()));
                    case 6:
                        break;
                    default:
                        System.out.println("La opción ingresada no es válida. Por favor, ingrese una opción válida");
                }
            } while (opc != 6);
        } else {
            obtenerRutina(rutinas);
        }
    }

    public void eliminarRutina(List<Rutina> rutinas) {
        if (rutinas.size() > 0) {
            int ids = conseguirId(rutinas) - 1;
            System.out.println("¿Desea eliminar la rutina de " + rutinas.get(ids).getNombre() + " ? S/N");
            String elim = leer.nextLine();
            if (elim.equalsIgnoreCase("s")) {
                rutinas.remove(ids);
            }
            System.out.println("La rutina ha sido eliminada con éxito");
            for (int i = 0; i < rutinas.size(); i++) {
                rutinas.get(i).setId(i+1);
            }
        } else {
            obtenerRutina(rutinas);
        }
    }
}
