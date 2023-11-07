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
public final class Yate extends BarcoMotor {

    private int numCamarotes;

    public Yate(int numCamarotes, int numMastiles, int matricula, int eslora, int añoFabricacion) {
        super(numMastiles, matricula, eslora, añoFabricacion);
        this.numCamarotes = numCamarotes;
    }

    @Override
    public int modulo() {
        return super.modulo() + numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "numCamarotes=" + numCamarotes + " " + super.toString() + '}';
    }
}
