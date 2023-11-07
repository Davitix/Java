package here02;

import Entidad.*;

/**
 *
 * @author david
 */
public class HERE02 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaración del objeto Lavadora con  atributos iniciales)
        //Electrodomestico lavadora = new Lavadora(1000d, "Blanco", 'A', 10, 20);
        //Declaración del objeto Lavadora sin atributos iniciales
        Electrodomestico lavadora = new Lavadora();
        lavadora.crearElectrodomestico();
        lavadora.precioFinal();
        System.out.println(lavadora + "Precio de la lavadora: " + lavadora.getPrecio());

        //Declaración del objeto Televisor con atributos iniciales
        //Electrodomestico televisor = new Televisor(1000d, "Negro", 'C', 10, 40, true);
        //Declaración del objeto Lavadora sin atributos iniciales
        Electrodomestico televisor = new Televisor();
        televisor.crearElectrodomestico();
        televisor.precioFinal();
        System.out.println("Precio del televisor: " + televisor.getPrecio());
    }

}
