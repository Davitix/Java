package ejerciciosGuia;

import java.util.*;

public class Ejercicio20_cuadradoMagico {

    public static void main(String[] args) {

        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
          suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
          permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
          El programa deberá comprobar que los números introducidos son correctos, es decir,
          están entre el 1 y el 9.*/
        //Scanner leer = new Scanner(System.in);
        int n, a = 1, b;

        //System.out.print("Escriba la cantidad de números: ");
        n = 3;
        int[][] A = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[] suma = new int[(2 * n) + 2];
        //int[][] A = new int[n][n];
        boolean magic = true;

        // Valida numeros
        do {
            b = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (A[i][j] == a) {
                        a++;
                        continue;
                    } else {
                        b++;
                    }
                }
            }
            if (b == (n * n) + 1) {
                magic = false;
            }
        } while (a < 9 && b < 9);

        // Válida filas
        if (magic) {
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    suma[i] += A[i][j];
                }
            }
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    suma[A.length + i] += A[j][i];
                }
            }

            // Válida diagonal
            for (int i = 0; i < n; i++) {
                suma[(2 * n)] += A[i][i];
                suma[(2 * n) + 1] += A[i][n - 1 - i];
            }

            for (int i = 0; i < ((2 * n) + 1); i++) {
                if (suma[i] != suma[i + 1]) {
                    magic = false;
                    break;
                }
            }
        }

        //System.out.println(Arrays.toString(suma));

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(A[i]));
        }

        if (magic) {
            System.out.println("Es un cuadrado mágico");
        } else {
            System.out.println("No es un cuadrado mágico");
        }
    }
}
