package Servicios;

import Entidad.*;
import java.util.ArrayList;
import java.util.Random;

public class Simulador {

    final String[][] salaCine = new String[8][6];
    ArrayList<Alumno> alumnos = new ArrayList();
    String[] nombres = {"David", "Stephany", "Alexis", "Natalia", "Ricardo"};
    String[] apellidos = {"Chaparro", "Durán", "Espitia", "Espinoza", "Nuñez"};

    //crear Alumno de la simulación, y llenar sillas
    public void crearAlumnos() {
        Random rdn = new Random();
        for (int i = 0; i < 10; i++) {
            int a = rdn.nextInt(5);
            int b = rdn.nextInt(5);
            int DNI = (int)(Math.random()*Math.pow(10,9));
            alumnos.add(new Alumno(nombres[a]+" "+apellidos[b], DNI, 0));
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
    public boolean mostrarAlumnos() {
        if (alumnos.size() > 0) {
            for (int i = 0; i < alumnos.size(); i++) {
                System.out.println((i + 1) + ". " + alumnos.get(i));
            }
            return true;
        } else {
            System.out.println("\nAún no hay personas registradas en el sistema");
            return false;
        }
    }

    //llenar un lugar de la sala
    public void llenarAleatorioSillas(Espectador persona, Pelicula peli) {
        Random random = new Random();
        int i, j;
        boolean ubicado = false;
        if (persona.getEdad() >= peli.getEdadMin() && persona.getDineroDisponible() >= student.getPrecioEntrada()) {
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
    
    public static void valoresDiferentes(ArrayList alumnos) {
        boolean diferentes = false;
        int diferencias;
        while (!diferentes) {
            diferencias = 0;
            for (int i = 0; i < alumnos.length; i++) {
                for (int j = 0; j < alumnos.length; j++) {
                    if (i != j && alumnos[i] == alumnos[j]) {
                        alumnos.get(i) = new Random().nextInt(alumnos.length);
                    } else {
                        diferencias++;
                    }
                }
                if (diferencias == vector.length) {
                    diferentes = true;
                }
            }
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


        //pelicula de prueba
        //student.setPeliculaReproduccion(new Pelicula("bambie", 190, "Crish", 13));

        crearAlumnos();

        /*for (int i = 0; i < clientes.size(); i++) {
            llenarAleatorioSillas(clientes.get(i), student.getPeliculaReproduccion());
        }*/
        mostrarAlumnos();

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
