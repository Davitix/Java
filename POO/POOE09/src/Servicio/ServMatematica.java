/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author david
 */
public class ServMatematica {
    
    Matematica mate = new Matematica();
    
    public void crearNumeros(){
        mate.setNum1(Math.random()*10);
        mate.setNum2(Math.random()*10);
    }
    
    public void imprimirNumeros(){
        
        System.out.println("Número 1: " + String.format("%.2f",mate.getNum1()) + "\nNúmero 2: " +  String.format("%.2f",mate.getNum2()));
    }
    
    public double devolverMayor(){
        
        return Math.max(mate.getNum1(), mate.getNum2());
        
        /*if (mate.getNum1()<mate.getNum2()){
            return mate.getNum2();
        } else {
            return mate.getNum1();
        }*/
    }
    
    public double calcularPotencia(){
        
        return Math.pow(Math.max((int) mate.getNum1(),(int)  mate.getNum2()),Math.min((int) mate.getNum1(),(int) mate.getNum2()));
        
        /*if (mate.getNum1()<mate.getNum2()){
            return Math.pow((int) mate.getNum2(),(int) mate.getNum1());
        } else {
            return Math.pow((int) mate.getNum1(),(int) mate.getNum2());
        }*/
    }
    
    public double calcularRaiz(){
        
        return Math.sqrt(Math.abs(Math.min(mate.getNum1(), mate.getNum2())));
        
        /*if (mate.getNum1()<mate.getNum2()){
            return Math.sqrt(Math.abs(mate.getNum1()));
        } else {
            return Math.sqrt(Math.abs(mate.getNum2()));
        }*/
    }
    
}
