package Servicio;

import Mascotas.Perro;
import java.util.*;

/**
 *
 * @author david
 */
public class ServicioPerro {

    Scanner leer = new Scanner(System.in);
    List<Perro> perros = new ArrayList<>();
    Iterator<Perro> it = perros.iterator();

    // Metodo que recibe la raza de perros y lo agrega al final de la lista
    public void crearPerro() {

        Perro perrito = new Perro();

        System.out.print("Escriba la nombre del perro: ");
        perrito.setNombre(leer.nextLine());
        System.out.print("Escriba la raza del perro: ");
        perrito.setRaza(leer.nextLine());
        System.out.print("Escriba la edad del perro: ");
        perrito.setEdad(Integer.valueOf(leer.nextLine()));
        perros.add(perrito);

    }

    public void organizarPerros() {
        Collections.sort(perros, Comparadores.ordenarPorNombre);
    }

    public void mostrarPerro() {
        organizarPerros();
        it = perros.iterator();
        while (it.hasNext()) {
            Perro aux = it.next();
            System.out.println(aux);
        }
    }

    // for simple para imprimir perros enumerados
    /*public void mostrarPerro(){
        organizarPerros();
        for (int i = 0; i < perros.size(); i++) {
            System.out.println((i+1) +". " + perros.get(i));
        }
    }
    
    //for con iteración, los imprime uno a uno
    /*public void mostrarPerro(){perros.forEach((aux) -> {System.out.println(aux);});
    }*/
    public void eliminarPerro(String name) {
        while (it.hasNext()) {
            Perro aux = it.next();
            if (aux.getNombre().equals(name)) {
                it.remove();
            }
        }
        organizarPerros();
    }

    public void menu() {
        System.out.println("Menú de opciones\n"
                + "1. Mostrar Perros\n"
                + "2. Guardar Perro\n"
                + "3. Eliminar Perro\n"
                + "4. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    // Menu de opciones que ejecuta cada metodo de la clase
    public void opciones() {

        int opc;
        do {
            menu();
            opc = Integer.parseInt(leer.nextLine());
            System.out.println(opc);
            switch (opc) {
                case 1:
                    mostrarPerro();
                    break;
                case 2:
                    crearPerro();
                    break;
                case 3:
                    System.out.println("Escriba el nombre del perro que desea eliminar");
                    eliminarPerro(leer.nextLine());
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, escriba una opción de selección válida.");
                    break;
            }
            System.out.println();
        } while (opc != 4);
    }

}
