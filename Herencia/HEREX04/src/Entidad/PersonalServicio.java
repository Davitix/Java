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
public final class PersonalServicio extends Persona{
    
    private String seccion;

    public PersonalServicio(String nombre, String apellido, int id, String estadoCivil, String seccion) {
        super(nombre, apellido, id, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalServicio: " + super.toString() + ", seccion=" + seccion + '.';
    }
    
}
