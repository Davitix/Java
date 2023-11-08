package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio06_estaturas {

    /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
      por debajo de 1.60 mts. y el promedio de estaturas en general.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numPerson, j = 0;
        float promedioMenos = 0, promedio = 0;

        System.out.print("Escriba el número de personas de la muestra: ");
        numPerson = leer.nextInt();

        float A[] = new float[numPerson];

        for (int i = 0; i < numPerson; i++) {
            System.out.print("Escriba la estatura de la persona " + (i + 1) + ": ");
            A[i] = leer.nextFloat();
        }

        System.out.println("\nLas estaturas de las personas en la muestra son: " + Arrays.toString(A));
        for (int i = 0; i < numPerson; i++) {
            promedio += A[i];
            if (A[i] < 1.6) {
                promedioMenos += A[i];
                j++;
            }
        }

        System.out.println("La estatura promedio de los que están por debajo de 1.60, es: " + (promedioMenos/j));
        System.out.println("La estatura promedio de todos es: " + (promedio/numPerson));
    }

}
