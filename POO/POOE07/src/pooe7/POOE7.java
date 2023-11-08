/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe7;

import Entidad.Persona;
import Servicio.ServPersonas;

/**
 *
 * @author david
 */
public class POOE7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double bajo = 0, ideal = 0, sobrepeso = 0, mayores = 0, menores = 0, IMC;
        boolean mayorEdad;

        ServPersonas serv = new ServPersonas();

        Persona[] personas = new Persona[4];
        personas[0] = serv.crearPersona();
        personas[1] = serv.crearPersona();
        personas[2] = serv.crearPersona();
        personas[3] = serv.crearPersona();

        /*Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
          distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
          cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
          también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/
        for (int i = 0; i < personas.length; i++) {
            IMC = serv.calcularIMC(personas[i].getPeso(), personas[i].getAltura());
            mayorEdad = serv.esMayorDeEdad(personas[i].getEdad());

            if (IMC < 0) {
                bajo++;
            } else if (IMC == 0) {
                ideal++;
            } else {
                sobrepeso++;
            }

            if (mayorEdad) {
                mayores++;
            } else {
                menores++;
            }
        }

        System.out.println("De las personas listadas " + ((bajo / 4) * 100) + "% están por debajo de su peso ideal.");

        System.out.println("De las personas listadas " + ((ideal / 4) * 100) + "% están en su peso ideal.");

        System.out.println("De las personas listadas " + ((sobrepeso / 4) * 100) + "% están en sobrepeso.");

        System.out.println("De las personas listadas " + ((mayores / 4) * 100) + "% son mayores de edad, y " + ((menores / 4) * 100) + "% menores.");

    }

}
