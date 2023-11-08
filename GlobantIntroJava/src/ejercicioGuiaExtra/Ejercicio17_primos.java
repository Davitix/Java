package ejercicioGuiaExtra;

import java.util.*;

/**
 *
 * @author david
 */
public class Ejercicio17_primos {

    /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
      por parámetro para que nos indique si es o no un número primo, debe devolver true si es
      primo, sino false.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner leer = new Scanner(System.in);

        System.out.print("Escriba un número: ");
        n = leer.nextInt();

        System.out.println("¿El número es primo?: " + primo(n));
    }

    public static boolean primo(int a) {
        int i = 0;
        boolean primo=true;
        for (int j = 1; j <= a; j++) {
            if (a % j == 0) {
                i++;
            }
            if (i > 2) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}
