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
public final class Profesor extends Persona{
    
    private String departamento;

    public Profesor(String nombre, String apellido, int id, String estadoCivil, String departamento) {
        super(nombre, apellido, id, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor: " + super.toString() + ", departamento=" + departamento + '.';
    }
    
}
