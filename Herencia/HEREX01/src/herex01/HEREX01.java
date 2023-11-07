/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herex01;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class HEREX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alquiler alq = new Alquiler();
        List<Barco> barcos = new ArrayList<>();

        barcos.add(new Barco(123, 5, 2020));
        barcos.add(new Velero(5, 124, 6, 2020));
        barcos.add(new BarcoMotor(200, 125, 7, 2020));
        barcos.add(new Yate(4, 264, 8, 2020, 240));
        barcos.add(new Yate(2, 265, 9, 2020, 250));

        alq.opciones(barcos);
    }

}
