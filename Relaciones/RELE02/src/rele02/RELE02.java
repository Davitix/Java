package rele02;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevAgua;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class RELE02 {

    /**
     * Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben,
     * el juego se trata de un númerode jugadores, que, con un revolver de agua,
     * el cual posee una sola carga de agua, se dispara y se moja
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ruleta();
        for (int i = 0; i < 10; i++) {
        System.out.println(String.valueOf((char) ('A' + i)));
        }
    }

    public static void ruleta() {
        Scanner leer = new Scanner(System.in);
        RevAgua ra = new RevAgua();
        List<Jugador> jugadores = new ArrayList<>();
        Juego game = new Juego();

        System.out.print("Escriba el número de jugadores (Capacidad para 6 personas): ");
        int n = Integer.parseInt(leer.nextLine());
        if (n < 0 || n > 6) {
            n = 6;
        }

        for (int i = 0; i < n; i++) {
            jugadores.add(new Jugador((i + 1), "Jugador " + (i + 1), false));
        }

        game.llenarJuego(jugadores, ra);
        System.out.println(ra);
        while (!game.ronda()) {
        }
    }

}
