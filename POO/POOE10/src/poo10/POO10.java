/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo10;

import java.text.*;
import java.util.*;

/**
 *
 * @author david
 */
public class POO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double [] arregloA = new double[50];
        double [] arregloB = new double[20];

        llenarVectorAleatorioRango(arregloA,150,-50);
        mostrarVector(arregloA);
        Arrays.sort(arregloA);
        for (int i = 0; i < 10; i++) {
            arregloB[i]= arregloA[i];
        }
        for (int i = 10; i < arregloB.length; i++) {
            arregloB[i]= 0.5;
        }

        System.out.println("vector A ordenado");
        mostrarVector(arregloA);
        System.out.println("vector B");
        mostrarVector(arregloB);
    }

//    public static void llenarVectorAleatorio(int[] vector) {
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] = (int) (Math.random() * 10 + 1);
//            //System.out.println(vector[i]);
//        }
//    }
    public static void llenarVectorAleatorioRango(double[] vector, int max, int min) {
        int rango = max-min+1;
        DecimalFormat formato = new DecimalFormat("#,##");
        for (int i = 0; i < vector.length; i++) {
//            vector[i] = (Math.random() * rango ) + min;
            vector[i] = Double.valueOf( formato.format((Math.random() * rango ) + min));
        }
    }

    public static void mostrarVector(double[] vector) {
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("("+i+") "+vector[i] + ", ");
        }
        System.out.print("]");
    }



}