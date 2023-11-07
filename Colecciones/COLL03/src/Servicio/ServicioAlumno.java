package Servicio;

import Entidad.Alumno;
import java.util.*;

/**
 *
 * @author david
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in);
    List<Alumno> alumnos = new ArrayList<>();
    Iterator<Alumno> it = alumnos.iterator();

    // Metodo que recibe la raza de alumnos y lo agrega al final de la lista
    public void crearAlumno() {

        Alumno alumno = new Alumno();

        System.out.print("Escriba la nombre del perro: ");
        alumno.setNombre(leer.nextLine());
        System.out.print("Escriba la primera nota del alumno: ");
        alumno.setNotas(Integer.parseInt(leer.nextLine()));
        System.out.print("Escriba la segunda nota del alumno: ");
        alumno.setNotas(Integer.parseInt(leer.nextLine()));
        System.out.print("Escriba la tercera nota del alumno: ");
        alumno.setNotas(Integer.parseInt(leer.nextLine()));
        alumnos.add(alumno);

    }

    public void organizarAlumnos() {
        Collections.sort(alumnos, Comparadores.ordenarPorNombre);
    }

    // for simple para imprimir alumnos enumerados
    public void mostrarAlumnos() {
        organizarAlumnos();
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println((i + 1) + ". " + alumnos.get(i));
        }
    }

    //for con iteración, los imprime uno a uno
    /*public void mostrarAlumnos(){alumnos.forEach((aux) -> {System.out.println(aux);});
    }*/
    
    public void notaFinal(){
        System.out.print("Escriba el número de alumno que quiere consultar: ");
        List<Integer> aux = alumnos.get(Integer.parseInt(leer.nextLine())).getNotas();
        int notaFinal = 0;
        for (int i = 0; i < aux.size(); i++) {
            notaFinal += aux.get(i);
        }
        System.out.println("Su nota final es: " + notaFinal);
    }
    
    /*public void eliminarAlumno(String name) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equals(name)) {
                it.remove();
            }
        }
        organizarAlumnos();
    }*/
    public void menu() {
        System.out.println("Menú de opciones\n"
                + "1. Mostrar Alumnos\n"
                + "2. Guardar Alumno\n"
                //+ "3. Eliminar Alumno\n"
                //+ "4. Salir\n");
                + "3. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    // Menu de opciones que ejecuta cada metodo de la clase
    public void opciones() {

        int opc;
        do {
            menu();
            opc = Integer.parseInt(leer.nextLine());
            switch (opc) {
                case 1:
                    mostrarAlumnos();
                    break;
                case 2:
                    crearAlumno();
                    break;
                case 3:
                    notaFinal();
                    break;
                /*case 4:
                    System.out.println("Escriba el nombre del alumno que desea eliminar");
                    eliminarAlumno(leer.nextLine());
                    break;*/
                default:
                    System.out.println("\nOpción no válida. Por favor, escriba una opción de selección válida.");
                    break;
            }
            System.out.println();
            //Con eliminar
            //} while (opc != 5);

            //Sin eliminar
        } while (opc != 4);
    }

}
