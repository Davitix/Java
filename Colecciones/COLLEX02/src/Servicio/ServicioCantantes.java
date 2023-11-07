package Servicio;

import Entidad.CantanteFamoso;
import java.util.*;

/**
 *
 * @author david
 */
public class ServicioCantantes {

    Scanner leer = new Scanner(System.in);
    List<CantanteFamoso> cantantes = new ArrayList<>();

    // Metodo que recibe la raza de cantantes y lo agrega al final de la lista
    public void crearCantante() {

        CantanteFamoso cantante = new CantanteFamoso();
        System.out.print("Escriba el nombre del cantante: ");
        cantante.setNombre(leer.nextLine());
        System.out.print("Escriba el disco con más ventas del cantante: ");
        cantante.setDiscoConMasVentas(leer.nextLine());
        cantantes.add(cantante);
    }

    //Método con comparadores para organizar registros
    public boolean organizarCantantes() {
        if (cantantes.size() > 0) {
            Collections.sort(cantantes, Comparadores.ordenarPorNombre);
            return true;
        } else {
            System.out.println("\nAún no hay cantantes registrados en el sistema");
            return false;
        }
    }

    // for simple para imprimir cantantes enumerados
    public void mostrarCantantes() {
        if (organizarCantantes()) {
            for (int i = 0; i < cantantes.size(); i++) {
                System.out.println((i + 1) + ". " + cantantes.get(i));
            }
        }
    }

    //for con iteración, los imprime uno a uno
    /*public void mostrarCantantes(){cantantes.forEach((aux) -> {System.out.println(aux);});
    }*/
    
    //Constructor para modificar registros por id
    public void modificarCantante() {
        if (organizarCantantes()) {
            mostrarCantantes();
            System.out.print("Escriba el número del cantante que desea modificar: ");
            int opc, id = Integer.parseInt(leer.nextLine())-1;

            do {
                System.out.println("\n¿Qué desea modificar?");
                System.out.print("1. Nombre\n" + "2. Disco con más ventas\n" + "3. Todo\n" + "4. Salir" + "\nDigite una opción: ");
                opc = Integer.parseInt(leer.nextLine());

                switch (opc) {
                    case 1:
                        System.out.print("Ingrese el nuevo nombre para el cantante: ");
                        cantantes.get(id).setNombre(leer.nextLine());
                        break;
                    case 2:
                        System.out.print("Ingrese el nuevo disco para el cantante: ");
                        cantantes.get(id).setDiscoConMasVentas(leer.nextLine());
                        break;
                    case 3:
                        System.out.print("Ingrese el nuevo nombre para el cantante: ");
                        cantantes.get(id).setNombre(leer.nextLine());
                        System.out.print("Ingrese el nuevo disco para el cantante: ");
                        cantantes.get(id).setDiscoConMasVentas(leer.nextLine());
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("La opción ingresada no es válida. Por favor, ingrese una opción válida");
                }
            } while (opc != 4);
        }
    }

    //Constructor para eliminar registros por id
    public void eliminarCantante() {
        if (organizarCantantes()) {
            mostrarCantantes();
            System.out.print("Escriba el número del cantante que desea eliminar: ");
            int delete = Integer.parseInt(leer.nextLine())-1;
            cantantes.remove(delete);
            organizarCantantes();
        }
    }

    public void menu() {
        System.out.println("Menú de opciones\n"
                + "1. Mostrar Cantantes\n"
                + "2. Agregar Cantante\n"
                + "3. Modificar Cantante\n"
                + "4. Eliminar Cantante\n"
                + "5. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    // Menu de opciones que ejecuta cada metodo de la clase
    public void opciones() {
        
        int opc;
        String another;
        
        cantantes.add(new CantanteFamoso("José Andrea", "Mago de Oz"));
        cantantes.add(new CantanteFamoso("Zeta", "Hechizos, Pócimas y Brujerías"));
        cantantes.add(new CantanteFamoso("José Andrea 2", "El Lago"));
        
        do {
            menu();
            opc = Integer.parseInt(leer.nextLine());
            switch (opc) {
                case 1:
                    mostrarCantantes();
                    break;
                case 2:
                    do {
                        crearCantante();
                        System.out.print("Desea registrar otro país: " + "\nYes (Y) / No (N): ");
                        another = leer.nextLine();
                    } while (another.equalsIgnoreCase("y"));
                    break;
                case 3:
                    modificarCantante();
                    break;
                case 4:
                    eliminarCantante();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, escriba una opción de selección válida.");
                    break;
            }
            System.out.println();
        } while (opc != 5);
    }
}
