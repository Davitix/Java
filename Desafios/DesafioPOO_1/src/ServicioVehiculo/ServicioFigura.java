/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioVehiculo;

import Entidad.*;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ServicioFigura {
    
    Cuadrado cuadrado = new Cuadrado();
    Circulo cir = new Circulo();
    Triangulo tri = new Triangulo();
    Rectangulo rect = new Rectangulo();
    Rombo rom = new Rombo();
    Pentagono pent = new Pentagono();
    Hexagono hex = new Hexagono();
    
    Scanner leer = new Scanner(System.in);
    
    public void crearFigura(int opc){
        
        switch (opc) {
            case 1:
                System.out.println("Ingrese el lado del cuadrado: ");
                System.out.print("Lado: ");cuadrado.setLado(leer.nextDouble());
                break;
            case 2:
                System.out.println("Ingrese las dimensiones del rectángulo: ");
                System.out.print("Altura: ");rect.setAltura(leer.nextDouble());
                System.out.print("Base: ");rect.setBase(leer.nextDouble());
                break;
            case 3:
                System.out.print("Ingrese las dimensiones del triángulo: ");
                System.out.print("Altura: ");tri.setAltura(leer.nextDouble());
                System.out.print("Base: ");tri.setBase(leer.nextDouble());
                break;
            case 4:
                System.out.println("Ingrese el radio del círculo: ");
                System.out.print("Radio: ");cir.setRadio(leer.nextDouble());
                break;
            case 5:
                System.out.println("Ingrese el lado del hexágono: ");
                System.out.print("Lado: ");hex.setLado(leer.nextDouble());
                break;
            case 6:
                System.out.println("Ingrese el lado del pentágono: ");
                System.out.print("Lado: ");pent.setLado(leer.nextDouble());
                break;
            case 7:
                System.out.println("Ingrese las dimensiones del rombo: ");
                System.out.print("Altura: ");rom.setAltura(leer.nextDouble());
                System.out.print("Base: ");rom.setBase(leer.nextDouble());
                System.out.print("Diagonal Mayor: ");rom.setDiagonalMayor(leer.nextDouble());
                System.out.print("Diagonal Menor: ");rom.setDiagonalMenor(leer.nextDouble());
                break;
            default:
                ;
        }
        
    }
    
    public void datos(int opc){
        
        switch (opc) {
            case 1:
                System.out.println("El perimetro es: " + (cuadrado.getLado()*4));
                System.out.println("El area es: " + Math.pow(cuadrado.getLado(),2));
                break;
            case 2:
                System.out.println("El perimetro es: " + ((2*rect.getAltura())+(2*rect.getBase())));
                System.out.println("El area es: " + (rect.getAltura()*rect.getBase()));
                break;
            case 3:
                System.out.println("El perimetro es: " + (3*tri.getBase()));
                System.out.println("El area es: " + ((tri.getAltura()*tri.getBase())/2));
                break;
            case 4:
                System.out.println("El perimetro es: " + (2*Math.PI*cir.getRadio()) );
                System.out.println("El area es: " + (Math.PI*(Math.pow(cir.getRadio(),2))));
                break;
            case 5:
                System.out.println("El perimetro es: " + (6*hex.getLado()) );
                System.out.println("El area es: " + (Math.pow(hex.getLado(),2)*((3*Math.sqrt(3))/2)) );
                break;
            case 6:
                System.out.println("El perimetro es: " + (5*pent.getLado()));
                System.out.println("El area es: " + (Math.pow(pent.getLado(),2))*Math.sqrt(25+(10*Math.sqrt(5)))/4);
                break;
            case 7:
                System.out.println("El perimetro es: " + ((2*rom.getAltura())+(2*rom.getBase())));
                System.out.println("El area es: " + ((rom.getDiagonalMayor()*rom.getDiagonalMenor())/2));
                break;
            default:
                ;
        }
        
    }
    
}
