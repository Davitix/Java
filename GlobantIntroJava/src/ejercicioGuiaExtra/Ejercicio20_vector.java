package ejercicioGuiaExtra;

import java.util.*;

/**
 *
 * @author david
 */
public class Ejercicio20_vector {
    
    /*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
      parámetro. Después haremos otra función o procedimiento que imprima el vector.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Escriba el tamaño del vector: ");
        n = leer.nextInt();
        
        int[] A = new int[n];
        
        fill(A);
        print(A);
    }
    
    public static void print(int[] A){
        
        System.out.println("A = " + Arrays.toString(A));
        
    }
    
    public static int[] fill(int[] A){
        
        for (int i = 0; i < A.length; i++) {
            A[i]=(int) (Math.random() * 10);
        }
        return A;
    }
}
