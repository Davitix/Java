/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia;

import java.util.Scanner;

public class Ejercicio14_conversor {

    public static void main(String[] args) {
        
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
          introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
         función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
          una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
          (void).*/
        
        Scanner leer = new Scanner(System.in);
        int n, op;
        
        System.out.print("Escriba una cantida de Euros a convertir: ");
        n = leer.nextInt();
        do {
            System.out.println("Escriba una opción: \n1.Dólares\n2.Yenes\n3.Libras\n4.Salir");
            op = leer.nextInt();
            
            switch (op) {
                case 1:
                    dolares(n);
                    break;
                case 2:
                    yenes(n);
                    break;
                case 3:
                    libras(n);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("La opción digitada no es válida");
            }
        } while (op != 4);
    }

    public static void dolares(int n) {
        System.out.println("Su dinero en dólaes es: " + n*0.86);
    }

    public static void yenes(int n) {
        System.out.println("Su dinero en dólaes es: " + n*1.28611);
    }

    public static void libras(int n) {
        System.out.println("Su dinero en dólaes es: " + n*129.852);
    }
}
