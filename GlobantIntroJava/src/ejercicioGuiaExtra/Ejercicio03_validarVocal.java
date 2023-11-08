package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio03_validarVocal {

    /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
      Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
      String.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String letra;
        
        System.out.print("Escriba una letra: ");
        
        letra = leer.nextLine();
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U") ) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
    
}
