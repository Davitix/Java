package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio01_tiempo {
    
    /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
      usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int min, hour, day;
        
        System.out.print("Escriba una cantidad de minutos: ");
        
        min = leer.nextInt();
        
        hour = min/60;
        day=hour/24;
        hour=hour%24;
        
        System.out.println("Sus minutos equivalen a " + day + " día(s) y " + hour + " hora(s)");
    }
    
}
