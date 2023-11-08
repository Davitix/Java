package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio12_contadorDigitos {

    /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
      0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
      Ejemplo:
      0-0-0
      0-0-1
      0-0-2
      0-0-E
      0-0-4
      0-1-2
      0-1-E
      Nota: investigar función equals() y como convertir números a String.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, a;

        for (int i = 1; i < 999; i++) {
            String contador = "";
            num = i;
            a = num % 10;
            for (int j = 0; j < 2; j++) {
                num = num / 10;
                a = (a * 10) + (num % 10);
            }
            //System.out.println(a);
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    if (a%10==3) {
                        contador = contador.concat("E");
                    } else {
                        contador = contador.concat(String.valueOf(a % 10));
                    }
                    a = a / 10;
                } else {
                    if (a%10==3) {
                        contador = contador.concat("-E");
                    } else {
                        contador = contador.concat("-"+String.valueOf(a % 10));
                    }
                    a = a / 10;
                }
            }
            System.out.println(contador);
        }
    }
}
