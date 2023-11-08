/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.*;

/**
 *
 * @author david
 */
public class Meses {
    
    Scanner leer = new Scanner(System.in);
    String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    Random aleatorio = new Random();
    String mesSecreto = mes[aleatorio.nextInt(12)];
    
    public Meses() {
    }

    public String[] getMes() {
        return mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
    
    public void adivinar(){
        System.out.println(mesSecreto);
        String intento;
        do{
            System.out.println("Para adivinar el mes escriba una opción: ");
            intento = leer.nextLine();
            if(!intento.equalsIgnoreCase(mesSecreto)){
                System.out.println("No ha adivinado, por favor intente nuevamente");
            } else {
                System.out.println("Acertaste. Has ganado!!");
            }
        } while (!intento.equalsIgnoreCase(mesSecreto));
    }
    
}