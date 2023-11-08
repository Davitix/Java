package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio11_digitos {

    /*Escribir un programa que lea un número entero y devuelva el número de dígitos que
      componen ese número. Por ejemplo, si introducimos el número 12345, el programa
      deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
      operador de división. Nota: recordar que las variables de tipo entero truncan los
      números o resultados.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, i=1;
        num = leer.nextInt();
        
        while (num > 10){
            num = num / 10;
            i++;
        }
        
        System.out.println("El número tiene " + i + " digitos.");
    }
}
