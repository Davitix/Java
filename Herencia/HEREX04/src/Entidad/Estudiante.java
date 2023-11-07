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
public final class Estudiante extends Persona{
    
    private int curso;

    public Estudiante(String nombre, String apellido, int id, String estadoCivil, int curso) {
        super(nombre, apellido, id, estadoCivil);
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante: " + super.toString() + ", curso=" + curso + '.';
    }
    
}
