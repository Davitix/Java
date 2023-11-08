package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio02_reasignar {
    
    /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
      una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
      C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
      iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        int A=1, B=2, C=3, D=4, a;
        
        System.out.println("Los valores son: A=" + A + ", B=" + B + ", C=" + C + " y D=" + D + ".");
        
        a = B;
        B = C;
        C = A;
        A = D;
        D = a;
        
        System.out.println("Los nuevos valores son: A=" + A + ", B=" + B + ", C=" + C + " y D=" + D + ".");
    }
    
}
