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
public final class Velero extends Barco {

    private final int numMastiles;

    public Velero(int numMastiles, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.numMastiles = numMastiles;
    }

    @Override
    public int modulo() {
        return super.modulo() + numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numMastiles=" + numMastiles + " " + super.toString() + '}';
    }
}
