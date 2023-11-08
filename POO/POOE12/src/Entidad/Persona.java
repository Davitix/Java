/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.*;

/**
 *
 * @author david
 */
public class Persona {

    private String name;
    private Date birthDate;

    public Persona() {
    }

    public Persona(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int calcularEdad() {

        Date current = new Date();
        
        if (current.getMonth()<=birthDate.getMonth() && current.getDate()<birthDate.getDate()) {
            return current.getYear() - birthDate.getYear() - 1;
        } else {
            return current.getYear() - birthDate.getYear();
        }
    }

    public boolean menorQue(int age) {
        return calcularEdad() < age;
    }

    public void mostrarPersona() {
        System.out.println("El nombre de la persona es: " + name + ", y su edad " + calcularEdad() + " años.");
    }

}
