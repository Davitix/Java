package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio08_multiplosCinco {

    /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
      detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
      y la cantidad de números impares. Al igual que en el ejercicio anterior los números
      negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, nNum=0, par = 0, impar = 0;
        float average = 0;

        do {
            System.out.print("Escriba un número: ");
            num = leer.nextInt();
            if (num > 0) {
                nNum++;
                average += num;
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            } else {
                System.out.print("Ese no es un número positivo. ");
            }
        } while (num % 5 != 0);

        for (int i = 0; i < num; i++) {

        }
        System.out.println();
        System.out.println("Se leyeron un total de " + nNum + " números, teniendo " + par + " pares y " + impar + " impares.");
    }

}
