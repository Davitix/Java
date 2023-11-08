package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio04_romano {

    /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
      equivalente en romano.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;

        System.out.print("Escriba un número: ");

        num = leer.nextInt();
        
        System.out.print("Su número en romano es: ");
        switch (num) {
            case 1:
            case 2:
            case 3:
                for (int i = 0; i < num; i++) {
                    System.out.print("I");
                }
                break;
            case 4:
                System.out.print("IV");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.print("V");
                for (int i = 5; i < num; i++) {
                    System.out.print("I");
                }
                break;
            case 9:
                System.out.print("IX");
                break;
            case 10:
                System.out.print("X");
                break;
            default:
                break;
        }
        System.out.println();
    }

}
