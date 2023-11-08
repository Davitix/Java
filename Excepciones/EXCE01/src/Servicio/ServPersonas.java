package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ServPersonas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona persona = new Persona();

    public Persona crearPersona() {

        System.out.print("Ingrese el nombre de la persona: ");
        persona.setNombre(leer.next());
        System.out.print("Ingrese la edad de la persona: ");
        persona.setEdad(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese el sexo de la persona, escriba: \nH - para Hombre\nM - para mujer\nO - para Otro");
        System.out.print("Escriba la letra que corresponda a su selección: ");
        persona.setSexo(leer.next());

        System.out.print("Ingrese el peso de la persona: ");
        persona.setPeso(leer.nextDouble());
        System.out.print("Ingrese el altura de la persona: ");
        persona.setAltura(leer.nextDouble());

        return persona;
    }

    public int calcularIMC(double peso, double altura) {

        double IMC = peso / (Math.pow(altura, 2));

        if (IMC < 20) {
            return -1;
        } else if (IMC > 20 && IMC < 25) {
            return 0;
        } else {
            return 1;
        }

    }

    public boolean esMayorDeEdad(int edad) {
        if (edad < 18) {
            return false;
        } else {
            return true;
        }
    }

}
