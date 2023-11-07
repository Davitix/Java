package Servicio;

import Entidad.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ServicioPersonas {

    Scanner leer = new Scanner(System.in);
    private List<Persona> personas = new ArrayList<>();

    public void crearSitios() {
        personas.add(new Empleado("Juan", "Gonzales", 10001, "Soltero", 2000, 2));
        personas.add(new Empleado("Pedro", "Rodriguez", 10002, "Unión Libre", 2021, 5));
        personas.add(new Estudiante("David", "Perez", 10003, "Casado", 1101));
        personas.add(new Estudiante("Maria", "Lopez", 10004, "Soltero", 1002));
        personas.add(new Profesor("Luna", "Machado", 10005, "Divorciado", "Filosofia"));
        personas.add(new Profesor("Jhon", "Martinez", 10006, "Unión Libre", "Física"));
        personas.add(new PersonalServicio("Clara", "Nieto", 10007, "Casado", "Salón Social"));
        personas.add(new PersonalServicio("Martín", "Torres", 10008, "Casado", "Salones de Clase"));
    }

    public void mostrarPersonas(List<Persona> personas, int a) {
        switch (a) {
            case 1:
                for (int i = 0; i < personas.size(); i++) {
                    System.out.println((i + 1) + ". " + personas.get(i));
                }
                break;
            case 2:
                for (int i = 0; i < personas.size(); i++) {
                    if (personas.get(i) instanceof Empleado) {
                        System.out.println((i + 1) + ". " + personas.get(i));
                    }
                }
                break;
            case 3:
                for (int i = 0; i < personas.size(); i++) {
                    if (personas.get(i) instanceof Estudiante) {
                        System.out.println((i + 1) + ". " + personas.get(i));
                    }
                }
                break;
            case 4:
                for (int i = 0; i < personas.size(); i++) {
                    if (personas.get(i) instanceof Profesor) {
                        System.out.println((i + 1) + ". " + personas.get(i));
                    }
                }
                break;
            case 5:
                for (int i = 0; i < personas.size(); i++) {
                    if (personas.get(i) instanceof PersonalServicio) {
                        System.out.println((i + 1) + ". " + personas.get(i));
                    }
                }
                break;
        }

    }

    public void menu() {
        System.out.println("Bienvenido al sistema de Gestión de Facultad");
        System.out.print("1. Cambiar estado civil\n" + "2. Reasignar empleado\n" + "3. Matricular estudiante\n"
                + "4. Cambiar departamento\n" + "5. Trasladar empleado\n" + "6. Salir\n" + "\nSu opción: ");

    }

    public void opciones() {
        int opc, seleccion;
        crearSitios();
        do {
            menu();
            opc = Integer.parseInt(leer.nextLine());
            System.out.println();
            switch (opc) {
                case 1: //Cambiar estado civil
                    mostrarPersonas(personas, opc);
                    System.out.print("Digite el número de la persona a la que se le cambiará el estado civil, o 0 para volver");
                    seleccion = Integer.valueOf(leer.nextLine())-1;
                    if (seleccion == -1) {
                        break;
                    }
                    while (seleccion < 0 || seleccion > personas.size()) {
                        System.out.println("El valor digitado no es una opción válida, por favor intente nuevamente");
                        seleccion = Integer.valueOf(leer.nextLine());
                    }
                    System.out.println("¿Cuál será el nuevo estado civil de la persona?");
                    personas.get(seleccion).setEstadoCivil(leer.nextLine());
                    break;
                case 2: //Reasignar despacho de empleado
                    System.out.println("\nListado de empleados: ");
                    mostrarPersonas(personas, opc);
                    System.out.print("Digite el número de empleado a reasignar, o 0 para volver");
                    seleccion = Integer.valueOf(leer.nextLine())-1;
                    if (seleccion == -1) {
                        break;
                    }
                    while (seleccion < 0 || seleccion > personas.size()) {
                        System.out.println("El valor digitado no es una opción válida, por favor intente nuevamente");
                        seleccion = Integer.valueOf(leer.nextLine());
                    }
                    System.out.println("¿A qué despacho será reasignado el empleado?");
                    Empleado empleado = (Empleado) personas.get(seleccion);
                    empleado.setNumeroDespacho(Integer.valueOf(leer.nextLine()));
                    personas.set(seleccion, empleado);
                    break;
                case 3: //Matricular estudiante a otro curso
                    System.out.println("\nListado de estudiantes: ");
                    mostrarPersonas(personas, opc);
                    System.out.print("Digite el número de estudiante a matricular, o 0 para volver");
                    seleccion = Integer.valueOf(leer.nextLine())-1;
                    if (seleccion == -1) {
                        break;
                    }
                    while (seleccion < 0 || seleccion > personas.size()) {
                        System.out.println("El valor digitado no es una opción válida, por favor intente nuevamente");
                        seleccion = Integer.valueOf(leer.nextLine());
                    }
                    System.out.println("¿Cuál será el nuevo curso del estudiante?");
                    Estudiante Eetudiante = (Estudiante) personas.get(seleccion);
                    Eetudiante.setCurso(Integer.valueOf(leer.nextLine()));
                    personas.set(seleccion, Eetudiante);
                    break;
                case 4: //Cambiar departamento de profesor
                    System.out.println("\nListado de profesores: ");
                    mostrarPersonas(personas, opc);
                    System.out.print("Digite el número de profesor a cambiar de departamento, o 0 para volver");
                    seleccion = Integer.valueOf(leer.nextLine())-1;
                    if (seleccion == -1) {
                        break;
                    }
                    while (seleccion < 0 || seleccion > personas.size()) {
                        System.out.println("El valor digitado no es una opción válida, por favor intente nuevamente");
                        seleccion = Integer.valueOf(leer.nextLine());
                    }
                    System.out.println("¿Cuál será el nuevo departamento del profesor");
                    Profesor profesor = (Profesor) personas.get(seleccion);
                    profesor.setDepartamento(leer.nextLine());
                    personas.set(seleccion, profesor);
                    break;
                case 5: //Traslado de sección a personal de servicio
                    System.out.println("\nListado de personal de servicio: ");
                    mostrarPersonas(personas, opc);
                    System.out.print("Digite el número de persona a trasladar, o 0 para volver");
                    seleccion = Integer.valueOf(leer.nextLine())-1;
                    if (seleccion == -1) {
                        break;
                    }
                    while (seleccion < 0 || seleccion > personas.size()) {
                        System.out.println("El valor digitado no es una opción válida, por favor intente nuevamente");
                        seleccion = Integer.valueOf(leer.nextLine());
                    }
                    System.out.println("¿A qué sección será trasladada?");
                    PersonalServicio ps = (PersonalServicio) personas.get(seleccion);
                    ps.setSeccion(leer.nextLine());
                    personas.set(seleccion, ps);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Escriba una opción válida.\n");
                    break;
            }

        } while (opc != 6);
    }
}
