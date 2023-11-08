package ejerciciosGuia;

import java.util.*;

public class Ejercicio21_matrizInscrita {

    public static void main(String[] args) {

        /*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
          3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
          dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
          que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
          menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
          columna de la matriz M en la cual empieza el primer elemento de la submatriz P.*/
        //Scanner leer = new Scanner(System.in);
        int n;
        boolean iguales = false;

        //System.out.print("Escriba la cantidad de números: ");
        //n = 3;
        int[][] A = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10}, {11, 12, 13, 21, 41, 22, 67, 20, 10, 61}, {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
        {41, 87, 24, 56, 97, 74, 87, 42, 64, 35}, {32, 76, 79, 1, 36, 5, 67, 96, 12, 11}, {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
        {67, 78, 87, 46, 14, 22, 26, 42, 56, 78}, {98, 45, 34, 23, 32, 56, 74, 16, 19, 18}, {24, 67, 97, 46, 87, 13, 67, 89, 95, 24},
        {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int[][] B = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};

        //int[][] A = new int[n][n];
        //int[][] B = new int[n][n];
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = 0; j < A[i].length - 2; j++) {
                if (A[i][j] == B[0][0]) {
                    n = 0;
                    for (int k = 0; k < B.length; k++) {
                        for (int l = 0; l < B[0].length; l++) {
                            if (A[i + k][j + l] == B[k][l]) {
                                n++;
                                //System.out.println(i + " " + j + " " + n);
                            } else {
                                break;
                            }
                        }
                    }
                    if (n == 9) {
                        iguales = true;
                        break;
                    }
                }
                if(iguales){
                    break;
                }
            }
        }

        print(A);
        print(B);

        if (iguales) {
            System.out.println("La matriz B ESTÁ INSCRITA en la matriz A");
        } else {
            System.out.println("La matriz B NO ESTÁ INSCRITA en la matriz A");
        }
    }

    public static void print(int[][] A) {

        for (int[] fila : A) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
