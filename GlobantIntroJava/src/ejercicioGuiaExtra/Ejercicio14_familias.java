package ejercicioGuiaExtra;

import java.util.*;

/**
 *
 * @author david
 */
public class Ejercicio14_familias {
    
    /*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
      hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
      cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n, aver=0;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Escriba el número de familias: ");
        n = leer.nextInt();
        
        int A[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Escriba la cantidad de hijos de la familia " + (i+1) + ": ");
            A[i] = leer.nextInt();
            aver += A[i];
        }
        System.out.println("Las familias tienen un promedio de " + (aver/n) + " hijos.");
    }
}
