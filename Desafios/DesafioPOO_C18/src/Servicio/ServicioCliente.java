/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.*;
import java.util.*;

/**
 *
 * @author david
 */
public class ServicioCliente {

    Scanner leer = new Scanner(System.in);
    ServicioRutina sr = new ServicioRutina();

    public Cliente registroCliente(List<Cliente> clientes, List<Rutina> rutinas) {

        Cliente client = new Cliente();
        client.setId(clientes.size()+1);
        System.out.print("Ingrese el nombre de cliente: ");
        client.setNombre(leer.nextLine());
        System.out.print("Ingrese la edad del cliente: ");
        client.setEdad(Integer.parseInt(leer.nextLine()));
        System.out.print("Ingrese la altura del cliente (metros): ");
        client.setAltura(Double.parseDouble(leer.nextLine()));
        System.out.print("Ingrese el peso del cliente (kg): ");
        client.setPeso(Double.parseDouble(leer.nextLine()));
        System.out.print("Ingrese el objetivo de la rutina: ");
        client.setIMC();
        client.setObjetivo(leer.nextLine());
        sr.obtenerRutina(rutinas);
        System.out.print("Ingrese la ID de la rutina en la que se quiere inscribir: ");
        int tempID = Integer.parseInt(leer.nextLine()) - 1;
        while (tempID < 0 || tempID >= rutinas.size()) {
            System.out.print("El ID ingresado no es válido. Por favor ingrese un ID válido para interacturar: ");
            tempID = Integer.parseInt(leer.nextLine()) - 1;
        }
        client.setRutina(rutinas.get(tempID));
        System.out.println("\nEl usuario " + client.getNombre().toUpperCase() + " ha sido inscrito exitosamente en la rutina "
                + rutinas.get(tempID).getNombre().toUpperCase());

        return client;
    }

    public void obtenerCliente(List<Cliente> clientes) {
        if (clientes.size() > 0) {
            System.out.println("Los clientes inscritos son: ");
            clientes.forEach((client) -> {
                System.out.println(client.toString());
            });
        } else {
            System.out.println("\nAún no hay clientes registrados en el sistema");
        }
    }

    public int conseguirId(List<Cliente> clientes) {
        obtenerCliente(clientes);
        System.out.print("Ingrese el ID con el que desea interactuar: ");
        int ids = Integer.parseInt(leer.nextLine());

        while (ids < 1 || ids > clientes.size()) {
            System.out.print("El ID ingresado no es válido. Por favor ingrese un ID válido para interacturar: ");
            ids = Integer.parseInt(leer.nextLine());
        }
        return ids;
    }

    public void actualizarCliente(List<Cliente> clientes, List<Rutina> rutinas) {
        
        if (clientes.size() > 0) {
            int ids = conseguirId(clientes) - 1, opc;
            Cliente act = clientes.get(ids);

            do {
                System.out.println("¿Qué desea modificar?");
                System.out.println("1. Nombre\n" + "2. Edad\n" + "3. Altura\n" + "4. Peso\n" + "5. Objetivo\n" + "6. Rutina\n"
                        + "7. Todo\n" + "8. Salir" + "\nDigite una opción: ");
                opc = Integer.parseInt(leer.nextLine());

                switch (opc) {
                    case 1:
                        System.out.print("Ingrese el nuevo nombre para el cliente: ");
                        act.setNombre(leer.nextLine());
                        break;
                    case 2:
                        System.out.print("Ingrese la nueva edad para el cliente: ");
                        act.setEdad(Integer.parseInt(leer.nextLine()));
                        break;
                    case 3:
                        System.out.print("Ingrese la nueva altura para el cliente (metros): ");
                        act.setAltura(Double.parseDouble(leer.nextLine()));
                        break;
                    case 4:
                        System.out.print("Ingrese el nuevo peso para el cliente (kg): ");
                        act.setPeso(Double.parseDouble(leer.nextLine()));
                        break;
                    case 5:
                        System.out.print("Ingrese el nuevo objetivo del cliente: ");
                        act.setObjetivo(leer.nextLine());
                        break;
                    case 6:
                        sr.obtenerRutina(rutinas);
                        System.out.print("Ingrese la ID de la rutina en la que se quiere inscribir: ");
                        act.setRutina(rutinas.get(Integer.parseInt(leer.nextLine())));
                    case 7:
                        System.out.print("Ingrese el nuevo nombre para el cliente: ");
                        act.setNombre(leer.nextLine());
                        System.out.print("Ingrese la nueva edad para el cliente: ");
                        act.setEdad(Integer.parseInt(leer.nextLine()));
                        System.out.print("Ingrese la nueva altura para el cliente (metros): ");
                        act.setAltura(Double.parseDouble(leer.nextLine()));
                        System.out.print("Ingrese el nuevo peso para el cliente (kg): ");
                        act.setPeso(Double.parseDouble(leer.nextLine()));
                        System.out.print("Ingrese el nuevo objetivo del cliente: ");
                        act.setObjetivo(leer.nextLine());
                        sr.obtenerRutina(rutinas);
                        System.out.print("Ingrese la ID de la rutina en la que se quiere inscribir: ");
                        act.setRutina(rutinas.get(Integer.parseInt(leer.nextLine())));
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("La opción ingresada no es válida. Por favor, ingrese una opción válida");
                }
            } while (opc != 8);
        } else {
            obtenerCliente(clientes);
        }
    }

    public void eliminarCliente(List<Cliente> clientes) {
        if (clientes.size() > 0) {
            int ids = conseguirId(clientes) - 1;
            System.out.println("¿Desea eliminar a " + clientes.get(ids).getNombre() + " del registro de clientes? S/N");
            String elim = leer.nextLine();
            if (elim.equalsIgnoreCase("s")) {
                clientes.remove(ids);
            }
            for (int i = 0; i < clientes.size(); i++) {
                clientes.get(i).setId(i+1);
            }
            System.out.println("El cliente ha sido eliminado con éxito");
        } else {
            obtenerCliente(clientes);
        }
    }

}
