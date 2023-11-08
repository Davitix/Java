/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe3;

import Entidad.*;
import ServiciosCircunferencia.*;

/**
 *
 * @author david
 */
public class POOE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        calculadora serv = new calculadora();
        numeros nums = serv.crearNumeros();

        System.out.println("La suma de los numerso es: " + nums.sumar());
        System.out.println("La resta de los numerso es: " + nums.restar());
        System.out.println("La multiplicación de los numerso es: " + nums.multiplicar());
        System.out.println("La división de los numerso es: " + nums.dividir());
    }

}
