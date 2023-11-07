/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.*;
import java.util.Comparator;

/**
 *
 * @author david
 */
public class Comparadores {

    public static Comparator<Hotel> ordenarPorPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t, Hotel t1) {
            return t1.getpHab().compareTo(t.getpHab());
        }
    };
}
