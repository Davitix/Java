/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ServCadena {

    Scanner leer = new Scanner(System.in);
    Cadena cadena = new Cadena();
    
    public Cadena crearCadena() {

        System.out.print("Ingrese una palabra: ");
        cadena.setPalabra(leer.nextLine());
        cadena.setLongitud(cadena.getPalabra().length());

        return cadena;
    }

    public void mostrarVocales() {
        
        String palabra = cadena.getPalabra();
        int vocales = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.substring(i,i+1).equals("a") || palabra.substring(i,i+1).equals("e") || palabra.substring(i,i+1).equals("i") || palabra.substring(i,i+1).equals("o") || palabra.substring(i,i+1).equals("u")) {
                vocales++;
            }
        }

        System.out.println("Su palabra tiene " + vocales + " vocales.");

    }
    
    public void invertirFrase() {

        String palabra = cadena.getPalabra();
        String palabraInvertida = "";
        
        for (int i = palabra.length()-1; i >= 0 ; i--) {
            palabraInvertida = palabraInvertida.concat(palabra.substring(i,i+1));
        }
        
        System.out.println("Su palabra invertida es: " + palabraInvertida);
        
    }

    public void vecesRepetido(){
        
        System.out.println("Escriba un carácter a buscar en la frase: ");
        String criterio = leer.nextLine();
        String palabra = cadena.getPalabra();
        int repetido = 0;
        
        for (int i = 0; i < palabra.length() ; i++) {
            if (palabra.substring(i,i+1).equals(criterio)){
                repetido++;
            }
        }
        
        System.out.println("El carácter" + criterio + " se reptie " + repetido + " veces en la frase.");
    }
    
    public void compararLongitud(){
        
        System.out.println("Escriba una frase a comparar: ");
        String criterio = leer.nextLine();
        String palabra = cadena.getPalabra();
        int compara;
        
        if (palabra.length()<criterio.length()){
            compara = palabra.length()-criterio.length();
            System.out.println("La frase inicial es " + compara + "caracteres mayor que su criterio ingresado");
        } else {
            compara = criterio.length()-palabra.length();
            System.out.println("La frase inicial es " + compara + "caracteres menor que su criterio ingresado");
        }
        
    }
    
    public void unirFrase(){
        
        System.out.println("Escriba una frase a comparar: ");
        String criterio = leer.nextLine();
        String palabra = cadena.getPalabra();
        
        palabra = palabra.concat(criterio);
        
        System.out.println("Su nueva palabra es: " + palabra);
        
    }
    
    public void reemplazar() {

        System.out.println("Escriba un carácter con el cual reempalzar la letra a: ");
        String criterio = leer.nextLine();
        String palabra = cadena.getPalabra();
        String reemplazo = "";

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.substring(i,i+1).equalsIgnoreCase("a")) {
                reemplazo = reemplazo.concat(criterio);
            } else {
                reemplazo = reemplazo.concat(palabra.substring(i, i+1));
            }
            
        }

        System.out.println("Su nueva palabra es: " + reemplazo);

    }
    
    public void contiene() {

        System.out.println("Escriba un carácter con el cual reempalzar la letra a: ");
        String criterio = leer.nextLine();
        String palabra = cadena.getPalabra();
        boolean contiene = false;
        
        
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.substring(i,i+1).equals(criterio)) {
                contiene = true;
                break;
            }
        }

        System.out.println("Es " + contiene + "decir que su caracter está contenido en la frase");

    }
    
}
