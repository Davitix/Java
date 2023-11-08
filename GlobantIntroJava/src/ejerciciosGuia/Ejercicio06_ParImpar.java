/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia;

import java.util.Scanner;

public class Ejercicio06_ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Crear un programa que dado un numero determine si es par o impar.*/
        
        Scanner leer = new Scanner(System.in);
        int n1;
        
        System.out.print("Escriba un número: ");
        
        n1 = leer.nextInt();
        
        if (n1%2==0) {
            System.out.print("Su número es un número par.");
        } else {
            System.out.print("Su número es un número impar.");
        }
       
    }
    
}
