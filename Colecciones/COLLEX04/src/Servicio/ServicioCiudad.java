package Servicio;

import Entidad.Ciudad;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ServicioCiudad {
    
    Scanner leer = new Scanner(System.in);
    HashMap<Integer, Ciudad> ciudades = new HashMap();
    
    public void crearCiudad() {
        Ciudad city = new Ciudad();
        System.out.print("Escriba el codigo postal de la ciudad: ");
        city.setCodPostal(Integer.parseInt(leer.nextLine()));
        System.out.print("Escriba el nombre de la ciudad: ");
        city.setCiudad(leer.nextLine());
        ciudades.put(city.getCodPostal(), city);
    }

    // for simple para imprimir ciudades enumeradas
    public void mostrarCiudades() {
        if (ciudades.size() > 0) {
            for (Map.Entry<Integer, Ciudad> aux : ciudades.entrySet()) {
                Integer key = aux.getKey();
                Ciudad value = aux.getValue();
                System.out.println("Key: " + key + ", Ciudad: " + value);
            }
        } else {
            System.out.println("\nAún no hay ciudades registradas en el sistema");
        }
    }

    // for simple para buscar ciudades
    public void buscarCiudad() {
        if (ciudades.size() > 0) {
            System.out.print("Escriba el código postal de la ciudad que desea buscar: ");
            int codigo = Integer.parseInt(leer.nextLine());
            if (ciudades.containsKey(codigo)) {
                System.out.println("Key: " + codigo + ", Ciudad: " + ciudades.get(codigo));
            } else {
                System.out.println("Esta ciudad no se encuentra en el registro.");
            }
        } else {
            System.out.println("\nAún no hay ciudades registradas en el sistema");
        }
    }

    // eliminar ciudad por key
    public void eliminarCiudad() {
        if (ciudades.size() > 0) {
            mostrarCiudades();
            System.out.print("Escriba el código postal de la ciudad que desea buscar: ");
            int codigo = Integer.parseInt(leer.nextLine());
            if (ciudades.containsKey(codigo)) {
                ciudades.remove(codigo);
            } else {
                System.out.println("Esta ciudad no se encuentra en el registro.");
            }
        } else {
            System.out.println("\nAún no hay ciudades registradas en el sistema");
        }
    }
    
    // Menu de opciones
    public void menu() {
        System.out.println("Menú de opciones\n"
                + "1. Buscar ciudad\n"
                + "2. Mostrar ciudades\n"
                + "3. Agregar ciudad\n"
                + "4. Eliminar ciudad\n"
                + "5. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    // Menu de opciones que ejecuta cada metodo de la clase
    public void opciones() {

        int opc;
        
        //ciudades de prueba
        ciudades.put(1,new Ciudad(18100, "Armilla"));
        ciudades.put(2,new Ciudad(18016, "Armilla"));
        ciudades.put(3,new Ciudad(18194, "Armilla"));
        
        do {
            menu();
            opc = Integer.parseInt(leer.nextLine());
            switch (opc) {
                case 1:
                    buscarCiudad();
                    break;
                case 2:
                    mostrarCiudades();
                    break;
                case 3:
                    crearCiudad();
                    break;
                case 4:
                    eliminarCiudad();
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
