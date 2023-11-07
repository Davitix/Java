/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopoo;

import ServicioVehiculo.ServicioFigura;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class DesafioPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Elija el tipo de figura que quiere usar: ");
        System.out.println("1. Cuadrado\n2. Rectángulo\n3. Triangulo\n4. Circulo\n5. Hexágono\n6. Pentágono\n7. Rombo");
        
        System.out.print("Figura número: ");
        int opc = leer.nextInt();
        
        ServicioFigura serv = new ServicioFigura();
        
        serv.crearFigura(opc);
        serv.datos(opc);
        
    }
    
}
