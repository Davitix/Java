package Servicio;

import Entidad.Libro;
import java.util.*;

/**
 *
 * @author david
 */
public class ServicioLibreria {

    Scanner leer = new Scanner(System.in);
    Set<Libro> libreria = new HashSet();

    // Metodo que recibe la raza de libreria y lo agrega al final de la lista
    public void crearCantante() {

        Libro book = new Libro();
        System.out.print("Escriba el titulo del libro: ");
        book.setTitulo(leer.nextLine());
        System.out.print("Escriba el autor del libro: ");
        book.setAutor(leer.nextLine());
        System.out.print("Escriba el número de ejemplares existentes del libro: ");
        book.setNumeroEjemplares(Integer.parseInt(leer.nextLine()));
        System.out.print("Escriba el número de ejemplares prestados del libro: ");
        book.setEjemplaresPrestados(Integer.parseInt(leer.nextLine()));
        libreria.add(book);
    }

    // for simple para imprimir libreria enumerados
    public boolean mostrarLibros() {
        if (libreria.size() > 0) {
            int i = 1;
            for (Libro lib : libreria) {
                System.out.println((i++) + ". " + lib);
            }
            return true;
        } else {
            System.out.println("\nAún no hay libros registrados en el sistema");
            return false;
        }
    }

//for con iteración, los imprime uno a uno
/*public void mostrarLibros(){libreria.forEach((aux) -> {System.out.println(aux);});
    }*/
    public boolean prestarLibro() {
        boolean existencia = false;
        if (mostrarLibros()) {
            System.out.println("Escriba el nombre del libro que desea solicituar en préstamo: ");
            String pedir = leer.nextLine();
            for (Libro lib : libreria) {
                if (lib.getTitulo().equalsIgnoreCase(pedir)) {
                    if (lib.getEjemplaresPrestados() < lib.getNumeroEjemplares()) {
                        lib.setEjemplaresPrestados(lib.getEjemplaresPrestados() + 1);
                        existencia = true;
                    } else {
                        System.out.println("No hay más ejemplares para este título");
                    }
                }
            }
        }
        return existencia;
    }

    public boolean devolverLibro() {
        boolean existencia = false;
        if (mostrarLibros()) {
            System.out.println("Escriba el nombre del libro que desea devolver: ");
            String regresar = leer.nextLine();
            for (Libro lib : libreria) {
                if (lib.getTitulo().equalsIgnoreCase(regresar)) {
                    if (lib.getEjemplaresPrestados() > 0) {
                        lib.setEjemplaresPrestados(lib.getEjemplaresPrestados() - 1);
                        existencia = true;
                    } else {
                        System.out.println("Esa unidad no hace parte de nuestra colección");
                    }
                }

            }
        }
        return existencia;
    }

    public void menu() {
        System.out.println("Menú de opciones\n"
                + "1. Mostrar Libros\n"
                + "2. Préstamo de Libro\n"
                + "3. Devolución de Libro\n"
                + "4. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    // Menu de opciones que ejecuta cada metodo de la clase
    public void opciones() {

        int opc;

        libreria.add(new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 15, 10));
        libreria.add(new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 15, 10));
        libreria.add(new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 15, 10));
        libreria.add(new Libro("Drácula", "Bram Stoher", 12, 5));
        libreria.add(new Libro("La Divina Comedia", "Dante Alighieri", 20, 18));

        do {
            menu();
            opc = Integer.parseInt(leer.nextLine());
            switch (opc) {
                case 1:
                    mostrarLibros();
                    break;
                case 2:
                    if(prestarLibro()){
                        System.out.println("TRANSACCIÓN EXITOSA");
                    }else{
                        System.out.println("No es posible hacer el préstamo. TRANSACCIÓN RECHAZADA");
                    };
                    break;
                case 3:
                    if(devolverLibro()){
                        System.out.println("TRANSACCIÓN EXITOSA");
                    }else{
                        System.out.println("No es posible hacer la devolución. TRANSACCIÓN RECHAZADA");
                    };
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, escriba una opción de selección válida.");
                    break;
            }
            System.out.println();
        } while (opc != 4);
    }
}
