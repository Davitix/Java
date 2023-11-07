package here03;

import Entidad.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author david
 */
public class HERE03 {

    public static void main(String[] args) {
        // TODO code application logic here

        List<Electrodomestico> compras = new ArrayList<>();
        Random rdn = new Random();
        int suma = 0, sumaTv = 0, sumaLav = 0, nTv = 0, nLav = 0;
        String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};

        for (int i = 0; i < 4; i++) {
            
            //Random para letras de tipo de consumo limitadas entre A y F
            char letra = (char) (65 + rdn.nextInt(6));
            
            //Random para crear un objeto y agregarlo al listado
            switch (1 + rdn.nextInt(2)) {
                case 1:
                    compras.add(new Lavadora(1000d, colores[rdn.nextInt(4)], letra, rdn.nextInt(40), rdn.nextInt(60)));
                    nLav++;
                    break;
                case 2:
                    compras.add(new Televisor(1000d, colores[rdn.nextInt(4)], letra, rdn.nextInt(40), rdn.nextInt(80), rdn.nextBoolean()));
                    nTv++;
                    break;
                default:
                    break;
            }
            
            //Método que genera el precio final
            compras.get(i).precioFinal();
            
            //Condicional para imprimir dependiendo del tipo de objeto creado
            if (compras.get(i) instanceof Lavadora) {
                //System.out.println(compras.get(i));
                System.out.println((i + 1) + ". Precio de la lavadora " + nLav + ": " + compras.get(i).getPrecio());
                sumaLav += compras.get(i).getPrecio();
            } else if (compras.get(i) instanceof Televisor){
                //System.out.println(compras.get(i));
                System.out.println((i + 1) + ". Precio del televisor " + nTv + ": " + compras.get(i).getPrecio());
                sumaTv += compras.get(i).getPrecio();
            }
            
            //Suma de precios de objetos creados
            suma += compras.get(i).getPrecio();
        }
        
        //Impresión de todas las variables en pantalla
        System.out.println("Se compraron " + nTv + " televisores, sumando un total de " + sumaTv + "."
                + "\nY se compraron " + nLav + " lavadoras, sumando un total de " + sumaLav + ".");
        System.out.println("La suma del precio de todos los electrodomésticos es: " + suma + ".");
    }
}
