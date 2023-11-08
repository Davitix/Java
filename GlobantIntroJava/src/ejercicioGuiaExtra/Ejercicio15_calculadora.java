package ejercicioGuiaExtra;

import java.util.*;

/**
 *
 * @author david
 */
public class Ejercicio15_calculadora {
    
    /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
      restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
      matemática y deben devolver sus resultados para imprimirlos en el main.*/
    
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
    
    public static int suma(int a, int b){
        
        int suma = a + b;
        return suma;
    }
    
    public static int resta(int a, int b){
        
        int diferencia = a - b;
        return diferencia;
    }
    
    public static int multiplicacion(int a, int b){
        
        int producto = a * b;
        return producto;
    }
    
    public static double division(int a, int b){
        
        double cociente = a / b;
        return cociente;
    }
}
