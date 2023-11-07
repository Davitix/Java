package Servicios;

import Entidad.*;
import java.util.ArrayList;
import java.util.Random;

public class SalaServicio {

    final String[][] salaCine = new String[8][6];
    ArrayList<Espectador> clientes = new ArrayList();
    Cine cine = new Cine();

    //crear Cine de la simulación, y llenar sillas
    public void crearCine() {
        cine.setPrecioEntrada(15.000);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                salaCine[i][j] = " ";
            }
        }
    }

    /*public void llenarSala(Espectador persona, Pelicula peli) {
        boolean ocupado = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                if (salaCine[i][j].equalsIgnoreCase(" ")) {
                    llenarAleatorioSillas(persona, peli);
                }
                break;
            }
        }
    }*/
    //mostrar sala con filas en número y columnas en letra
    public void mostrarSala() {
        for (int i = salaCine.length - 1; i >= 0; i--) {
            for (int j = 0; j < salaCine[i].length; j++) {
                System.out.print("[" + (i + 1) + ((char) ('A' + j)) + " " + salaCine[i][j] + "]");
            }
            System.out.println();
        }
    }

    //llenar un lugar de la sala
    public void llenarAleatorioSillas(Espectador persona, Pelicula peli) {
        Random random = new Random();
        int i, j;
        boolean ubicado = false;
        if (persona.getEdad() >= peli.getEdadMin() && persona.getDineroDisponible() >= cine.getPrecioEntrada()) {
            do {
                i = random.nextInt(8);
                j = random.nextInt(6);
                if (salaCine[i][j].equalsIgnoreCase(" ")) {
                    salaCine[i][j] = "X";
                    ubicado = true;
                } else {
                    System.out.println("Se buscara otro asiento, el asiento " + (i + 1) + ((char) ('A' + j)) + " esta ocupado");
                }
            } while (!ubicado);
        } else {
            System.out.println("Sorry vuelve luego con mas plata o mas edad");
        }
    }

    // Menu de simulacion
    public void menu() {
        System.out.println("Menú de opciones\n"
                + "1. Crear cine\n"
                + "2. Mostrar ciudades\n"
                + "3. Agregar ciudad\n"
                + "4. Eliminar ciudad\n"
                + "5. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    // Menu de simulacion que ejecuta cada metodo de la clase
    public void simulacion() {

        int opc;

        //clientes de prueba
        clientes.add(new Espectador("Alvaro", 35, 25.500));
        clientes.add(new Espectador("Alvaro", 35, 25.500));
        clientes.add(new Espectador("Alvaro", 35, 25.500));
        clientes.add(new Espectador("Alvaro", 35, 25.500));
        clientes.add(new Espectador("Alvaro", 35, 25.500));
        clientes.add(new Espectador("Alvaro", 35, 25.500));

        //pelicula de prueba
        cine.setPeliculaReproduccion(new Pelicula("bambie", 190, "Crish", 13));

        crearCine();

        for (int i = 0; i < clientes.size(); i++) {
            llenarAleatorioSillas(clientes.get(i), cine.getPeliculaReproduccion());
        }
        mostrarSala();

        /*do {
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
        } while (opc != 5);*/
    }
}
