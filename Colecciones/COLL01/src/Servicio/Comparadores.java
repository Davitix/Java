/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Mascotas.Perro;
import java.util.*;

/**
 *
 * @author david
 */
public class Comparadores {

    public static Comparator<Perro> ordenarPorNombre = new Comparator<Perro>() {
        @Override
        public int compare(Perro t, Perro t1) {
            return t.getNombre().compareToIgnoreCase(t1.getNombre());
        }
    };
    
    public static Comparator<Perro> ordenarPorRaza = new Comparator<Perro>() {
        @Override
        public int compare(Perro t, Perro t1) {
            return t.getRaza().compareToIgnoreCase(t1.getRaza());
        }
    };
}
