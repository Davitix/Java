package exce05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class EXCE05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rdn = new Random();
        Scanner leer = new Scanner(System.in);

        int user = 0, num = rdn.nextInt(499) + 1, intento = 0;
        
        System.out.println(num);
        
        do {
            try {
                System.out.print("Escriba un número: ");
                user = Integer.parseInt(leer.nextLine());
            } catch (NumberFormatException a) {
                System.out.print("Entrada NO válida. ");
            } finally {
                intento++;
            }
        } while (user != num);

        System.out.println("\nAdivinó el número" + "\nIntentos: " + intento);

    }

}
