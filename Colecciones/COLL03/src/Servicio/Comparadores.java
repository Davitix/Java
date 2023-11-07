/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.*;

/**
 *
 * @author david
 */
public class Comparadores {

    public static Comparator<Alumno> ordenarPorNombre = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t.getNombre().compareToIgnoreCase(t1.getNombre());
        }
    };
}
