package ejercicioGuiaExtra;

import java.util.*;

public class Ejercicio09_divisionResta {

    /*Simular la división usando solamente restas. Dados dos números enteros mayores que
      uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
      Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
      este resultado es el residuo, y el número de restas realizadas es el cociente.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2, cociente=0;
        System.out.print("Escriba el dividendo: ");
        num1=leer.nextInt();
        System.out.print("Escriba el divisor: ");
        num2=leer.nextInt();
        
        while (num1>num2) {
            num1=num1-num2;
            cociente++;
        }
        
        System.out.println();
        System.out.println("El cociente es " + cociente + ", y el residuo " + num1);
    }
}
