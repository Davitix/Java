package Servicio;

import Entidad.Producto;
import java.util.Comparator;

/**
 *
 * @author david
 */
public class Comparadores {
    
    public static Comparator<Producto> ordenarPorTitulo = new Comparator<Producto>() {
        @Override
        public int compare(Producto t, Producto t1) {
            return t.getNombre().compareToIgnoreCase(t1.getNombre());
        }
    };
}
