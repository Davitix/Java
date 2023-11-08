/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo11;

import java.time.*;
import java.util.*;

/**
 *
 * @author david
 */
public class POO11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba el año: ");
        int year = leer.nextInt();
        System.out.println("Escriba el mes: ");
        int month = leer.nextInt();
        System.out.println("Escriba el día: ");
        int day = leer.nextInt();
        
        Date fecha = new Date(year, month, day);
        
        // Metodo con DATE
        /*Date fecha = new Date(leer.nextInt(), leer.nextInt(), leer.nextInt());
        Date current = new Date();
        
        System.out.println("Hay " + (current.getYear() - fecha.getYear()) + " años entre la fecha ingresada y la actual.");*/
        
        // Metodo con LOCAL DATE
        // Obtener la fecha ingresada por el usuario
        LocalDate fechaIngresada = LocalDate.of(year, month, day);
        System.out.println(fechaIngresada);
        
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        
        int dif = diferencia(fechaIngresada,fechaActual);
        System.out.println("La diferencia es de "+ dif+" años");
    }
    
    public static int diferencia(LocalDate fecha1, LocalDate fecha2){
        Period periodo = Period.between(fecha1, fecha2);
        return periodo.getYears();
    }
    
}
