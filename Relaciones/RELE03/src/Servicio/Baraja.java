/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author david
 */
public class Baraja {

    private List<Carta> baraja = new ArrayList<>();

    public void baraja() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                Carta carta = new Carta();
                if (j != 8 && j != 9) {
                    carta.setNum(j);
                    switch (i) {
                        case 0:
                            carta.setPalo("Espadas");
                            break;
                        case 1:
                            carta.setPalo("Bastos");
                            break;
                        case 2:
                            carta.setPalo("Oros");
                            break;
                        case 3:
                            carta.setPalo("Copas");
                            break;
                    }
                    baraja.add(carta);
                }
            }
        }
    }
    
    public void barajar(){
        Collections.shuffle(baraja);
    }
    
    public List<Carta> getBaraja() {
        return baraja;
    }

    public void menu() {
        int a = 0;
        while (a != 7) {
            System.out.println("Que desea hacer:");
            System.out.println("1-Cuantas cartas quedan");
            System.out.println("2-Dame la siguiente carta");
            System.out.println("3-Cuales son las cartas que quedan?");
            System.out.println("4-Barajar cartas aun disponibles");
            System.out.println("5-Cuales son las cartas en la mesa");
            System.out.println("6-Quiero mas de una carta");
            System.out.println("7-Deseo salir");
            a = impr.nextInt();
            switch (a) {
                case 1:
                    cartasDisponibles();
                    break;

                case 2:
                    nextCarta();
                    break;
                case 3:
                    mostrarBaraja();
                    break;
                case 4:
                    barajar();
                    break;
                case 5:
                    monton();
                    break;
                case 6:
                    darCartas();
                    break;

                case 7:
                    a = 7;
                    break;
                default:
                    System.out.println("Ingrese un numero valido");
            }
        }
        System.out.println("Usted decidio salir, adios");
    }
}
