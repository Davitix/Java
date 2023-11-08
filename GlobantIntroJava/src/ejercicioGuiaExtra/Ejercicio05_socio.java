package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio05_socio {

    /*Una obra social tiene tres clases de socios:
        o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
          todos los tipos de tratamientos.
        o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
          para los mismos tratamientos que los socios del tipo A.
        o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
          tratamientos.
        o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
          real que represente el costo del tratamiento (previo al descuento) y determine el
          importe en efectivo a pagar por dicho socio.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String clase;
        int costo;
        
        System.out.print("Escriba una letra: ");
        clase = leer.nextLine();
        
        System.out.print("Escriba el costo del tratamiento: ");
        costo = leer.nextInt();
        switch (clase) {
            case "A":
                System.out.println("Su tratamiento tiene un costo de: " + costo*0.5);
                break;
            case "B":
                System.out.println("Su tratamiento tiene un costo de: " + costo*0.65);
                break;
            case "C":
                System.out.println("Su tratamiento tiene un costo de: " + costo);
                break;
            default:
                System.out.println("Esa no es una clase válida de socio");
                break;
        }
    }
    
}
