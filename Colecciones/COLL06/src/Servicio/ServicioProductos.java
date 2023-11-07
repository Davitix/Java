package Servicio;

import Entidad.Producto;
import java.util.*;

/**
 *
 * @author david
 */
public class ServicioProductos {

    Scanner leer = new Scanner(System.in);
    HashMap<Integer, Producto> products = new HashMap();
    Integer id = 1;

    // Metodo que recibe la raza de alumnos y lo agrega al final de la lista
    public void crearProductos() {

        Producto prod = new Producto();

        System.out.print("Escriba el nombre del producto: ");
        prod.setNombre(leer.nextLine());
        System.out.print("Escriba el precio del producto: ");
        prod.setPrecio(Double.parseDouble(leer.nextLine()));
        products.put(id++, prod);
    }

    // for avanzado para imprimir alumnos enumerados
    public void mostrarProductos() {
        for (Map.Entry<Integer, Producto> mapa : products.entrySet()) {
            Integer key = mapa.getKey();
            Producto value = mapa.getValue();
            System.out.println("K: " + key + ". V: " + value);
        }
    }

    // for avanzado para imprimir alumnos enumerados
    public void modificarProductos() {
        System.out.print("Escriba la llave de producto que desea modificar: ");
        Integer key = Integer.parseInt(leer.nextLine());

        Producto prod = new Producto();
        System.out.print("Escriba el nuevo nombre del producto: ");
        prod.setNombre(leer.nextLine());
        System.out.print("Escriba el nuevo precio del producto: ");
        prod.setPrecio(Double.parseDouble(leer.nextLine()));

        products.replace(key, prod);
    }

    // método para eliminar productos por llave de HashMap
    public void eliminarProductos() {
        System.out.print("Escriba la llave de producto que desea eliminar: ");
        Integer key = Integer.parseInt(leer.nextLine());
        products.remove(key);
    }

    public void menu() {
        System.out.println("Menú de opciones\n"
                + "1. Mostrar Productos\n"
                + "2. Crear Producto\n"
                + "3. Modificar Producto\n"
                + "4. Eliminar Producto\n"
                + "5. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    // Menu de opciones que ejecuta cada metodo de la clase
    public void opciones() {

        products.put(id++, new Producto("Menta", 2.99));
        products.put(id++, new Producto("Papa", 5.99));
        products.put(id++, new Producto("Carne", 9.99));

        int opc;
        String another;
        do {
            menu();
            opc = Integer.parseInt(leer.nextLine());
            switch (opc) {
                case 1:
                    mostrarProductos();
                    break;
                case 2:
                    do {
                        crearProductos();
                        System.out.print("Desea registrar otra películas: " + "\nYes (Y) / No (N): ");
                        another = leer.nextLine();
                    } while (another.equalsIgnoreCase("y"));
                    break;
                case 3:
                    modificarProductos();
                    break;
                case 4:
                    eliminarProductos();
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
