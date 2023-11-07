package Servicio;

import Entidad.Pelicula;
import java.util.*;

/**
 *
 * @author david
 */
public class ServicioPeliculas {

    Scanner leer = new Scanner(System.in);
    List<Pelicula> pelis = new ArrayList<>();

    // Metodo que recibe la raza de alumnos y lo agrega al final de la lista
    public void crearPeliculas() {

        Pelicula pelicula = new Pelicula();

        System.out.print("Escriba el titulo de la pelicula: ");
        pelicula.setTitulo(leer.nextLine());
        System.out.print("Escriba el director de la pelicula: ");
        pelicula.setDirector(leer.nextLine());
        System.out.print("Escriba la duración de la pelicula: ");
        pelicula.setDuracion(Integer.parseInt(leer.nextLine()));
        pelis.add(pelicula);
    }

    public void menuImpresion() {
        System.out.println("Menú de opciones\n"
                + "1. Mostrar duracion mayor a una hora\n"
                + "2. Mostrar de mayor a menor por duracion\n"
                + "3. Mostrar de menor a mayor por duracion\n"
                + "4. Mostrar alfabéticamente por título\n"
                + "5. Mostrar alfabéticamente por director\n"
                + "6. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    public void organizarPeliculas(int sort) {
        switch (sort) {
            case 2:
                Collections.sort(pelis, Comparadores.ordenarPorDuracionDesc);
                break;
            case 3:
                Collections.sort(pelis, Comparadores.ordenarPorDuracionAsc);
                break;
            case 4:
                Collections.sort(pelis, Comparadores.ordenarPorTitulo);
                break;
            case 5:
                Collections.sort(pelis, Comparadores.ordenarPorDirector);
                break;
            default:
                System.out.println("\nOpción no válida. Por favor, escriba una opción de selección válida.");
                break;
        }
    }

    // for simple para imprimir alumnos enumerados
    public void mostrarPeliculas() {
        int opci;
        do {
            menuImpresion();
            opci = Integer.parseInt(leer.nextLine());
            if (opci == 1) {
                for (Pelicula peli : pelis) {
                    if (peli.getDuracion() > 1) {
                        System.out.println(peli);
                    }
                }
            } else if (opci > 1 && opci <6) {
                organizarPeliculas(opci);
                for (int i = 0; i < pelis.size(); i++) {
                    System.out.println((i + 1) + ". " + pelis.get(i));
                }
            }
        } while (opci != 6);
        //pelis.forEach(System.out::println);
    }

//for con iteración, los imprime uno a uno
/*public void mostrarPeliculas(){alumnos.forEach((aux) -> {System.out.println(aux);});
    }*/
 /*public void eliminarPelicula(String name) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equals(name)) {
                it.remove();
            }
        }
        organizarPeliculas();
    }*/
    public void menu() {
        System.out.println("Menú de opciones\n"
                + "1. Mostrar Peliculas\n"
                + "2. Crear Peliculas\n"
                + "3. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    // Menu de opciones que ejecuta cada metodo de la clase
    public void opciones() {

        pelis.add(new Pelicula("Barbie", "Barbara", 2));
        pelis.add(new Pelicula("Spiderman", "Tooby", 1));
        pelis.add(new Pelicula("Avatar", "Avatares", 3));

        int opc;
        String another;
        do {
            menu();
            opc = Integer.parseInt(leer.nextLine());
            switch (opc) {
                case 1:
                    mostrarPeliculas();
                    break;
                case 2:
                    do {
                        crearPeliculas();
                        System.out.print("Desea registrar otra películas: " + "\nYes (Y) / No (N):");
                        another = leer.nextLine();
                    } while (another.equalsIgnoreCase("y"));
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, escriba una opción de selección válida.");
                    break;
            }
            System.out.println();
        } while (opc != 3);
    }

}
