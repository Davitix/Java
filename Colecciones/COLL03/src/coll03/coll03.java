package coll03;

import Entidad.Alumno;
import Servicio.ServicioAlumno;

/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perros en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perros o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/

/**
 *
 * @author david
 */
public class coll03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ServicioAlumno clase = new ServicioAlumno();
        clase.opciones();
    }
}
