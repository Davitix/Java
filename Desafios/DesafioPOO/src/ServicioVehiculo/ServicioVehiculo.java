/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioVehiculo;

import Entidad.Vehiculo;
import java.util.*;

/**
 *
 * @author david
 */
public class ServicioVehiculo {
    
    Vehiculo vehiculo = new Vehiculo();
    Scanner leer = new Scanner(System.in);
    
    public void crearVehiculo(){
        System.out.print("Ingrese el marca: ");
        vehiculo.setMarca(leer.next());
        System.out.print("Ingrese el modelo: ");
        vehiculo.setModelo(leer.next());
        System.out.print("Ingrese el año: ");
        vehiculo.setAño(leer.nextInt());
        System.out.print("Ingrese el tipo: ");
        vehiculo.setTipo(leer.next());
    }
    
    public int moverse(){
        System.out.print("Ingrese los segundos de avance de " + vehiculo.getTipo() + ": ");
        int segundos = leer.nextInt();
        int avance = 0;
        switch(vehiculo.getTipo()){
            case "Bicicleta":
                avance += segundos*1;
                break;
            case "Motocicleta":
                avance += segundos*2;
                break;
            case "Automovil":
                avance += segundos*3;
                break;
            default:
                System.out.println("El vehiculo escrito no se encuentra en nuestra base de datos.");
        }
        //System.out.println("El vehiculo avanzó: " + avance);
        return avance;
    }
    
    public void frenar(int avance){
        switch(vehiculo.getTipo()){
            case "Motocicleta":
            case "Automovil":
                avance+=2;
                break;
            default:
                ;
        }
        System.out.println("El vehiculo avanzó en total " +avance + " metros.");
    }
    
}
