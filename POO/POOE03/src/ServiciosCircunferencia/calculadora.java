/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosCircunferencia;

import Entidad.numeros;
import java.util.*;

/**
 *
 * @author david
 */
public class calculadora {

    Scanner leer = new Scanner(System.in);

    public numeros crearNumeros() {

        System.out.print("Ingrese el número 1: ");
        double num1 = leer.nextDouble();
        System.out.print("Ingrese el número 2: ");
        double num2 = leer.nextDouble();

        return new numeros(num1, num2);
    }

}
