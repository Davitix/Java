/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.*;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class servicioNIF {
    
    Scanner leer = new Scanner(System.in);
    
    //Método para crear puntos
    public NIF crearNIF(){
        
        NIF nif = new NIF();
        
        System.out.print("Escriba el número de DNI: ");
        nif.setDNI(leer.nextLong());
        
        nif.setNIF(nif.crearNIF(nif.getDNI()));
        
        return nif;
    }
    
    public void mostrar(NIF nif){
        //Impresión sin 0's antes
        //System.out.println(nif.getDNI()+"-"+nif.getNIF());
        
        //Impresión con 0's antes
        System.out.printf("Mi DNI es: %08d-%s\n", nif.getDNI(),nif.getNIF());
    }
    
}
