package rele01;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class RELE01 {

    /**
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
     * contar de dos clases. Perro, que tendrá como atributos: nombre, raza,
     * edad y tamaño; y la clase Persona con atributos: nombre, apellido, edad,
     * documento y Perro. Ahora deberemos en el main crear dos Personas y dos
     * Perros. Después, vamos a tener que pensar la lógica necesaria para
     * asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase
     * Persona, la información del Perro y de la Persona
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Perro> perros = new ArrayList<>();
        List<Persona> personas = new ArrayList<>();

        Scanner leer = new Scanner(System.in);

        perros.add(new Perro("Perro", "Golden", 5, 1.60));
        perros.add(new Perro("Perrito", "Mestizo", 2, 0.60));

        boolean crear = true;
        System.out.println("Creación de usuarios");

        do {
            System.out.print("Escriba su nombre: ");
            String name = leer.nextLine();
            System.out.print("Escriba su apellido: ");
            String last = leer.nextLine();
            System.out.print("Escriba su edad: ");
            int age = Integer.parseInt(leer.nextLine());
            System.out.print("Escriba su id: ");
            int ids = Integer.parseInt(leer.nextLine());
            System.out.println("Elija un perro de la lista para adoptar: ");

            for (int i = 0; i < perros.size(); i++) {
                System.out.println((i + 1) + ". " + perros.get(i));
            }

            int opcion = Integer.parseInt(leer.nextLine()) - 1;
            Perro elección = perros.get(opcion);
            perros.remove(opcion);

            personas.add(new Persona(name, last, age, ids, elección));

            System.out.print("¿Desea crear otro usuario? S/N: ");
            if (!leer.nextLine().equalsIgnoreCase("s")) {
                crear = false;
            }
        } while (crear);

        for (int i = 0; i < personas.size(); i++) {
            System.out.println((i + 1) + ". " + personas.get(i));
        }
    }

}
