package ejercicioGuiaExtra;

import java.util.*;

/**
 *
 * @author david
 */
public class Ejercicio22_matriz {
    
    /*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
      muestre la suma de sus elementos.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        int m, n;
        Scanner leer = new Scanner(System.in);

        System.out.print("Escriba el tamaño de la matriz: ");
        m = leer.nextInt();
        n = leer.nextInt();
        
        int[][] A = new int[m][n];

        fill(A);
        print(A);
        System.out.println(suma(A));
    }

    public static void print(int[][] A) {

        for (int[] fila : A) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static int[][] fill(int[][] A) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = (int) (Math.random() * 10);
            }
        }
        return A;
    }
    
    public static int suma(int[][] A) {
        
        int suma=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                suma += A[i][j];
            }
        }
        return suma;
    }
    
}
