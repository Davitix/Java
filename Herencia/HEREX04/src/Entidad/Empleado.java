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
public final class Empleado extends Persona{
    
    private int anioIncorporación;
    private int numeroDespacho;

    public Empleado(String nombre, String apellido, int id, String estadoCivil, int anioIncorporación, int numeroDespacho) {
        super(nombre, apellido, id, estadoCivil);
        this.anioIncorporación = anioIncorporación;
        this.numeroDespacho = numeroDespacho;
    }

    public int getAnioIncorporación() {
        return anioIncorporación;
    }

    public void setAnioIncorporación(int anioIncorporación) {
        this.anioIncorporación = anioIncorporación;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        return "Empleado: " + super.toString() + ", anioIncorporaci\u00f3n=" + anioIncorporación + ", numeroDespacho=" + numeroDespacho + '.';
    }
}
