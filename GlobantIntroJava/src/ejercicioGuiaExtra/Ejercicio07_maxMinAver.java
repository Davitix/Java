package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio07_maxMinAver {

    /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
      promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
      números serán introducidos por el usuario. Realice dos versiones del programa, una
      usando el bucle “while” y otra con el bucle “do - while”.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nNum, num = 0, mayor = 0, menor;
        float average = 0;

        System.out.print("Escriba el número de valores: ");
        nNum = leer.nextInt();

        int A[] = new int[nNum];

        /*while (num < nNum) {
            System.out.print("Escriba el valor del número " + (num+1) + ": ");
            A[num] = leer.nextInt();
            if (A[num] > 0) {
                num++;
            } else {
                System.out.print("Ese no es un número positivo. ");
            }
        }*/
        do{
            System.out.print("Escriba el valor del número " + (num+1) + ": ");
            A[num] = leer.nextInt();
            if (A[num] > 0) {
                num++;
            } else {
                System.out.print("Ese no es un número positivo. ");
            }
        } while  (num < nNum); 
        
        menor = A[0];
        for (int i = 0; i < nNum; i++) {
            if (A[i] > 0) {
                if (A[i] < menor) {
                    menor = A[i];
                }
                if (A[i] > mayor) {
                    mayor = A[i];
                }
                average += A[i];
            }
        }
        System.out.println();
        System.out.println("El menor valor es " + menor + ", el mayor " + mayor + ", y el promedio " + (average / nNum) + ".");
    }

}
