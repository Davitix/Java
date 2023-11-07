package exce03;

import Entidad.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class EXCE03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        DivisionNumero dn = new DivisionNumero();

        System.out.print("Escriba el número 1: ");
        int x = Integer.parseInt(leer.nextLine());
        System.out.print("Escriba el número 2: ");
        int y = Integer.parseInt(leer.nextLine());

        try {
            System.out.println("El resultado es: " + dn.DivisionNumero(x, y));
        } catch (ArithmeticException a) {
            System.out.println("No se pueden dividir esos números.");
        }

    }

}
