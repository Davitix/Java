/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.*;

/**
 *
 * @author david
 */
public class ServicioAhorcado {

    Random rdm = new Random();
    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {
        Ahorcado ahorcado = new Ahorcado();
        
        ahorcado.setPalabra(rdm.nextInt(ahorcado.getPalabras().length));
        System.out.print("Inserte el número de intentos que quiere para el juego: ");
        ahorcado.setIntentos(leer.nextInt());
        ahorcado.setLetrasEncontradas(0);

        return ahorcado;
    }

    public int longitud(Ahorcado ah) {
        return ah.getPalabra().length();
    }

    public void buscar(Ahorcado ah, String letra) {

        //Validacion de que se encuentra en la palabra
        if (ah.getPalabra().toLowerCase().contains(letra)) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("Lo sentimos, la letra no se encuentra en la palabra.");
        }
    }

    public boolean encontradas(Ahorcado ah, String letra) {
        int encontradas = 0;
        if (ah.getPalabra().toLowerCase().contains(letra)) {
            System.out.print("La letra se encuentra en la palabra en las posiciones: ");
            for (int i = 0; i < (ah.getPalabra().length()); i++) {
                if (ah.getPalabra().substring(i, (i + 1)).equalsIgnoreCase(letra)) {
                    encontradas++;
                    System.out.print((i+1) + " ");
                }
            }
            ah.setLetrasEncontradas(ah.getLetrasEncontradas() + encontradas);
            System.out.println("\nNúmero de letras: Encontradas = " + ah.getLetrasEncontradas() + ", Faltantes = " + (longitud(ah) - ah.getLetrasEncontradas()));
            return true;
        } else {
            return false;
        }
    }

    public void intentos(Ahorcado ah) {
        System.out.println("Le quedan " + ah.getIntentos() + " oportunidades.");
        if (ah.getIntentos()== 0){
            System.out.println("DERROTA");
        }
    }

    public void juego(Ahorcado ah) {

        do {
            //Ingresa la letra
            System.out.print("\nIngrese una letra: ");
            String letra = leer.next();

            //Validacion de una sola letra
            while (letra.length() > 1) {
                System.out.print("La letra no puede ser de más de un caracter. Por favor, escriba una letra a buscar: ");
                letra = leer.next();
            }

            buscar(ah, letra);
            if (!encontradas(ah, letra)) {
                ah.setIntentos(ah.getIntentos() - 1);
            }
            intentos(ah);

        } while (ah.getIntentos() > 0 && ah.getLetrasEncontradas() < longitud(ah));

    }
}
