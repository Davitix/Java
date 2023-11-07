/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopoo_3;

import Entidad.*;
import Servicio.*;
import java.util.*;

/**
 *
 * @author david
 */
public class Menu {
    
    public static void menu(){
        System.out.println("Menú de opciones\n"
                + "1. Crear Rutina\n"
                + "2. Registrar cliente\n"
                + "3. Listar todas las rutinas disponibles\n"
                + "4. Listar todos los clientes\n"
                + "5. Actualizar una rutina\n"
                + "6. Actualizar un registro de cliente\n"
                + "7. Eliminar rutina\n"
                + "8. Eliminar cliente\n"
                + "9. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    public static void opciones(int opc, ServicioCliente svc, ServicioRutina svr, List<Cliente> clientes, List<Rutina> rutinas) {

        Scanner leer = new Scanner(System.in);

        int i = 0, j = 0;

        while (opc != 9) {
            switch (opc) {
                case 1:
                    rutinas.add(svr.crearRutina(rutinas));
                    break;
                case 2:
                    if (rutinas.size() > 0) {
                        clientes.add(svc.registroCliente(clientes, rutinas));
                    } else {
                        System.out.println("\nAntes de crear un cliente, por favor cree una rutina a la cuál afiliarlo");
                    }
                    break;
                case 3:
                    svr.obtenerRutina(rutinas);
                    break;
                case 4:
                    svc.obtenerCliente(clientes);
                    break;
                case 5:
                    svr.actualizarRutina(rutinas);
                    break;
                case 6:
                    svc.actualizarCliente(clientes, rutinas);
                    break;
                case 7:
                    svr.eliminarRutina(rutinas);
                    break;
                case 8:
                    svc.eliminarCliente(clientes);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, escriba una opción de selección válida.");
                    break;
            }
            System.out.println();
            menu();
            opc = Integer.parseInt(leer.nextLine());
        }
    }
}
