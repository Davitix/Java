/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.*;

/**
 *
 * @author david
 */
public class ServCurso {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Curso crearCurso(){
        
        Curso curso = new Curso();
        
        System.out.print("Ingrese el nombre del curso: ");
        curso.setNombreCurso(leer.nextLine());
        
        System.out.print("Ingrese la cantidad de horas de clase al día: ");
        curso.setCantidadHorasPorDia(leer.nextInt());
        
        System.out.print("Ingrese la cantidad de días a la semana en que se imparte el curso: ");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        
        System.out.print("Ingrese el turno: ");
        curso.setTurno(leer.next());
        
        System.out.print("Ingrese el precio por hora: ");
        curso.setPrecioPorHora(leer.nextInt());
        
        System.out.println("Ingrese el nombre de los alumnos: ");
        curso.cargarAlumnos();
        
        return curso;
    }
    
}
