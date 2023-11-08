/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia;

import java.util.Scanner;

public class Ejercicio07_eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
          pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.*/
        
        Scanner leer = new Scanner(System.in);
        String palabra;
        
        System.out.print("Escriba una palabra: ");
        
        palabra = leer.nextLine();
        
        if (palabra.equalsIgnoreCase("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
       
    }
    
}
