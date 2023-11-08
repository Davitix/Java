/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.*;
/*import javax.swing.*;*/

/**
 *
 * @author david
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n, b=0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Escriba un número de serie fibonacci para calcular: ");
        n = leer.nextInt();
        System.out.println("La serie fibonacci hasta f(" + n + ") es: "+ Arrays.toString(serieFibonacci(n)));
        
        /*String a;
        
        do{
        a = JOptionPane.showInputDialog("Escriba un número de serie fibonacci para calcular: ");
        
        if (a != null) {
            n = Integer.valueOf(a);
            JOptionPane.showMessageDialog(null, "La serie fibonacci hasta f("+n+") es: (" + serieFibonacci(n) + ")");
        } else {
            System.exit(0);
        }
        }while (b<1);*/
        
    }
    
    public static int[] serieFibonacci(int n){
        int a[] = new int[n+1];
        for (int i = 0; i <= n; i++) {
            a[i]=Fibonacci(i);
        }
        return a;
    }
    
    public static int Fibonacci(int n) {
        
        int suma;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            suma = Fibonacci(n - 2) + Fibonacci(n - 1);
        }
        return suma;
    }
    
}