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
public class Ahorcado {
    
    final String[] palabras = {"Palabra","Casa", "Perro", "Ave", "Llaves", "Gato", "Auto", "Bicicleta"};
    private String palabra;
    private int letrasEncontradas;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(int letrasEncontradas, int jugadas) {
        this.letrasEncontradas = letrasEncontradas;
        this.intentos = jugadas;
    }

    public String[] getPalabras() {
        return palabras;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(int valor) {
        this.palabra = palabras[valor];
    }
    
    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
}