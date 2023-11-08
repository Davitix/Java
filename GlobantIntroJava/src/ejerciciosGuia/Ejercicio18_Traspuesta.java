package ejerciciosGuia;

import java.util.*;

public class Ejercicio18_Traspuesta {

    public static void main(String[] args) {

        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
          traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
          obtiene cambiando sus filas por columnas (o viceversa).*/
        
        /*Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.print("Escriba la cantidad de números: ");
        n = leer.nextInt();*/
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                B[j][i] = A[i][j];
            }
        }

        for (int[] fila: A) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();
        for (int[] fila: B) {
            System.out.println(Arrays.toString(fila));
        }
        
    }
}
