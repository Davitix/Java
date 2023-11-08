/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.*;

/**
 *
 * @author david
 */
public class ServMovil {
    
    Scanner leer = new Scanner(System.in);
    
    public Movil crearPersona(){
        
        Movil movil = new Movil();
        
        System.out.print("Ingrese el nombre de la marca del celular: ");
        movil.setMarca(leer.nextLine());
        
        System.out.print("Ingrese el precio del celular: ");
        movil.setPrecio(leer.nextDouble());
        
        System.out.print("Ingrese el modelo del celular: ");
        movil.setModelo(leer.next());
        
        System.out.print("Ingrese la capacidad de memoria RAM del celular: ");
        movil.setMemoriaRam(leer.nextInt());
        
        System.out.print("Ingrese el almacenamiento del celular: ");
        movil.setAlmacenamiento(leer.nextInt());
        
        movil.ingresarCodigo();
        
        return movil;
    }
    
}
