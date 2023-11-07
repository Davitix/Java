/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopoo_3;

import Entidad.*;
import Servicio.*;
import static desafiopoo_3.Menu.*;
import java.util.*;

/**
 *
 * @author david
 */
public class DesafioPOO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        List<Cliente> clientes = new ArrayList<>();
        List<Rutina> rutinas = new ArrayList<>();
        ServicioCliente svc = new ServicioCliente();
        ServicioRutina svr = new ServicioRutina();

        menu();
        int opc = Integer.parseInt(leer.nextLine());

        opciones(opc, svc, svr, clientes, rutinas);
    }
}
