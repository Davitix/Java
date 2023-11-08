/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Persona {
    
    private String nombre;
    private Integer edad;
    private String sexo;
    private double peso;
    private double altura;

    Scanner leer = new Scanner(System.in);
    
    public Persona() {
    }

    public Persona(String nombre, Integer edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")) {
            System.out.println("Por favor ingrese un valor válido para el sexo de la persona, escriba: \nH para Hombre\nM para mujer\nO para Otro");
            System.out.print("Escriba la letra que corresponda a su selección: ");
            this.sexo = leer.next();
        }
        
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
