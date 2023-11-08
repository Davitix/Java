package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio13_escaleraNumeros {

    /*Crear un programa que dibuje una escalera de números, donde cada línea de números
      comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
      usuario al comenzar. Ejemplo: si se ingresa el número 3:
      1
      12
      123*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num; String escalera="";
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Escriba el nivel de la escalera: ");
        num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            escalera = escalera.concat(Integer.toString(i));
            System.out.println(escalera);
        }
    }
}
