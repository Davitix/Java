package here04;

import Entidad.*;
/**
 *
 * @author david
 */
public class HERE04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo = new Circulo(2);
        Rectangulo rect = new Rectangulo(2, 3);
        
        System.out.printf("El círculo tiene de perimetro %.2fu, y area %.2fu^2.%n", circulo.perimetro(), circulo.area());
        System.out.printf("El rectángulo tiene de perimetro %.2fu, y area %.2fu^2.%n", rect.perimetro(), rect.area());
    }
    
}
