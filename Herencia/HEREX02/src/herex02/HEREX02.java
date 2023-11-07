/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herex02;

import Entidad.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class HEREX02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Edificio> edificios = new ArrayList<>();
        int techados = 0, abiertos = 0;

        edificios.add(new EdificioDeOficinas(5, 10, 5, 100, 200, 300));
        edificios.add(new Polideportivo("Movistar Arena", tipoInstalacion.ABIERTO, 1590, 1750, 300));
        edificios.add(new EdificioDeOficinas(10, 40, 10, 200, 200, 1450));
        edificios.add(new Polideportivo("Simon Bólivar", tipoInstalacion.TECHADO, 2180, 1860, 250));

        for (int i = 0; i < edificios.size(); i++) {
            System.out.println((i + 1) + ". El " + edificios.get(i));
            System.out.printf("   Tiene de superfiicie %,du^2, y de volumen %,du^3.%n", edificios.get(i).calcularSuperficie(), 
                    edificios.get(i).calcularVolumen());
            if (edificios.get(i) instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificios.get(i);
                if (polideportivo.getTipoInstalacion().toString().equalsIgnoreCase("Techado")) {
                    techados++;
                } else {
                    abiertos++;
                }
            }
            if (edificios.get(i) instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificios.get(i);
                edificioDeOficinas.cantPersonas();
            }
        }

        System.out.println("\nHay un total de " + techados + " polideportivos techados, y " + abiertos + " abiertos.");
    }

}
