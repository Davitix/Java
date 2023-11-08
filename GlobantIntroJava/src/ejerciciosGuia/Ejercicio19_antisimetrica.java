package ejerciciosGuia;

import java.util.*;

public class Ejercicio19_antisimetrica {

    public static void main(String[] args) {

        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
          una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
          de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
          denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
        
        /*Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.print("Escriba la cantidad de números: ");
        n = leer.nextInt();*/
        int[][] A = {{0,-2,4},{2,0,2},{-4,-2,0}};
        boolean antiSim = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j]!=-A[j][i]) {
                    antiSim = false;
                    break;
                }
            }
        }
        
        /*for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(A[i]));
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + A[j][i] + "] ");
            }
            System.out.println();
        }*/
        
        if(antiSim) {
            System.out.println("La matriz es antisimétrica");
        } else{
            System.out.println("La matriz NO es antisimétrica");
        }
    }
}