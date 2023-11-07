package Entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class Juego {

    private List<Jugador> jugadores = new ArrayList<>();
    private RevAgua rev;
    int ronda = 1;
    int jugador = 0;

    public void llenarJuego(List<Jugador> players, RevAgua r) {
        this.jugadores = players;
        this.rev = r;
        rev.llenarRevolver();
    }

    public boolean ronda() {
        System.out.print("Ronda " + ronda + /*" - Ubicación " + rev.getPosActual() +*/ "... ");
        if (jugadores.get(jugador).disparo(rev)) {
            esperar(1);
            System.out.print(jugadores.get(jugador).getNombre() + " - ");
            esperar(3);
            System.out.println("MOJADO");
            System.out.println("FIN DEL JUEGO.");
            return true;
        } else {
            esperar(1);
            System.out.print(jugadores.get(jugador).getNombre() + " - ");
            esperar(3);
            System.out.println("SECO");
            ronda++;
            if (jugador < jugadores.size() - 1) {
                jugador++;
            } else {
                jugador = 0;
            }
            return false;
        }
    }

    public void esperar(int n) {
        //Ponemos a "Dormir" el programa durante los ms que queremos
        try {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e) {
        }
    }

}
