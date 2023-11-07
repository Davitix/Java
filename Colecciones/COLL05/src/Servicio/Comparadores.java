package Servicio;

import java.util.Comparator;

import Entidad.Pais;

public class Comparadores {

    public static Comparator<Pais> ordenarPorNombre = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getName().compareToIgnoreCase(t1.getName());
        }
    };
}
