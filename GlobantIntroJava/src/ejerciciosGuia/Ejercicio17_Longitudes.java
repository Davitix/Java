package ejerciciosGuia;

import java.util.*;

public class Ejercicio17_Longitudes {

    public static void main(String[] args) {
        
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
          de 2 dígitos, etcétera (hasta 5 dígitos).*/
        
        Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.print("Escriba la cantidad de números: ");
        n = leer.nextInt();
        
        int[] vector = new int[n];
        int[] cifras = new int[5];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 12000);
            System.out.println(vector[i]);
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                if (vector[i]/((int) (Math.pow(10, j+1)))==0) {
                    cifras[j]++;
                    break;
                }
            }
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Para " + (i+1) + " digitos: " + cifras[i]);
        }
    }
}
