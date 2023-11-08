/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo13;

import Entidad.Curso;
import Servicio.ServCurso;
import java.util.Arrays;

/**
 *
 * @author david
 */
public class POO13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServCurso servicio = new ServCurso();
        Curso persona = servicio.crearCurso();
        
        persona.calcularGananciaSemana();
        System.out.println(Arrays.toString(persona.getAlumnos()));
        
    }
    
}
