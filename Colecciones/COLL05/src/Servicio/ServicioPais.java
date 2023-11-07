package Servicio;

import java.util.*;

import Entidad.Pais;

public class ServicioPais {

    Scanner leer = new Scanner(System.in);

    TreeSet<Pais> paisList = new TreeSet(Comparadores.ordenarPorNombre);

    public void crearPais() {

        Pais pais = new Pais();

        System.out.println("Ingresa el nombre del país");
        pais.setName(leer.next());

        System.out.println("Ingresa el continente del país");
        pais.setContinente(leer.next());

        paisList.add(pais);
    }

    public void mostrarPaises() {
        for (Pais pais : paisList) {
            System.out.println(pais);
        }
    }

    public void eliminarPais() {
        System.out.println("Ingresa el nombre del país a eleiminar");
        String opcion = leer.nextLine();

        paisList.removeIf(pais -> pais.getName().equalsIgnoreCase(opcion));

        System.out.println("Ahora la lista es: ");
        System.out.println(paisList);
    }

    public void menu() {
        System.out.println("Menú de opciones\n"
                + "1. Crear Pais\n"
                + "2. Mostrar Pais\n"
                + "3. Eliminar Pais\n"
                + "4. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    public void opciones() {

        paisList.add(new Pais("Colombia", "America"));
        paisList.add(new Pais("Alemania", "Europa"));
        paisList.add(new Pais("Canada", "America norte"));

        int opc;
        String another;
        do {
            menu();
            opc = Integer.parseInt(leer.nextLine());
            switch (opc) {
                case 1:
                    do {
                        crearPais();
                        System.out.print("Desea registrar otro país: " + "\nYes (Y) / No (N):");
                        another = leer.nextLine();
                    } while (another.equalsIgnoreCase("y"));
                    break;
                case 2:
                    mostrarPaises();
                    break;
                case 3:
                    eliminarPais();
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, escriba una opción de selección válida.");
                    break;
            }
            System.out.println();
        } while (opc != 4);
    }

}
