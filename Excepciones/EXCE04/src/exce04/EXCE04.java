package exce04;

import Entidad.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class EXCE04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        DivisionNumero dn = new DivisionNumero();

        int x = 0, y = 0;
        String num1;

        // Método 1
        System.out.print("Escriba el número 1: ");
        num1 = leer.nextLine();
        try {
            x = Integer.parseInt(num1);
        } catch (NumberFormatException a) {
            System.out.println("Lo que ingreso para el primer número no corresponde a un número.");
        }
        System.out.print("Escriba el número 2: ");
        try {
            y = leer.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("Error por intentar ingresar letras en un campo de número.");
        }
        try {
            System.out.println("El resultado es: " + dn.DivisionNumero(x, y));
        } catch (ArithmeticException a) {
            System.out.println("No se pueden dividir esos números.");
        }

        //Método 2
        try {
            dn.DivisionNumero(Integer.parseInt(leer.nextLine()), leer.nextInt());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("no es posible la división entre cero");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("no se puede convertir a numero");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("el valor ingresado no es un entero");
        }

    }
}
