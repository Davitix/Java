package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio10_adivinar {

    /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
      dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
      si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
      al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
      utilizar la función Math.random() de Java.*/

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, user;
        
        num = (int) ((Math.random()*10)*(Math.random()*10));
        //System.out.println(num);
        do {
            System.out.print("Escriba el número que cree es resultado de la multiplicación enetre dos random: ");
            user = leer.nextInt();
        } while (user!=num);
        
        System.out.println();
        if (user==num){
            System.out.println("Acertaste.");
        }
        
    }
}
