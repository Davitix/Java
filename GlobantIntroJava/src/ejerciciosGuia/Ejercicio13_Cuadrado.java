/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia;

import java.util.Scanner;

public class Ejercicio13_Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
          cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:*/
        
        Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.print("Escriba un número de campos: ");
        n = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || i == n-1){
                    System.out.print("* ");
                } else if(j==0 || j==n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
