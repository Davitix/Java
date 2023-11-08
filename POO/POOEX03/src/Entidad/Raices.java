/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author david
 */
public class Raices {
    
    private int a;
    private int b;
    private int c;
    
    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminante(){
        return Math.pow(b, 2)-(4*a*c);
    }
    
    public boolean tieneRaices(){
        return getDiscriminante()>=0;
    }
    
    public boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
    
    public void obtenerRaices(){
        if (tieneRaices()){
            double raiz1=(-b-(Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a);
            double raiz2=(-b+(Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a);
            System.out.println("Las raices de la ecuación son: " + raiz1 + " y " + raiz2);
        }
    }
    
    public void obtenerRaiz(){
        if (tieneRaices()){
            double raiz=(-b+(Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a);
            System.out.println("Las raiz de la ecuación es: " + raiz);
        }
    }
    
    public void calcular(){
        tieneRaices();
        tieneRaiz();
        obtenerRaices();
        obtenerRaiz();
    }
    
}
