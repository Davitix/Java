package Servicio;

import Entidad.CantanteFamoso;
import java.util.*;

/**
 *
 * @author david
 */
public class Comparadores {

    public static Comparator<CantanteFamoso> ordenarPorNombre = new Comparator<CantanteFamoso>() {
        @Override
        public int compare(CantanteFamoso t, CantanteFamoso t1) {
            return t.getNombre().compareToIgnoreCase(t1.getNombre());
        }
    };
}
