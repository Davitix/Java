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
public class BarcoMotor extends Barco {

    private int potenciaCV;

    public BarcoMotor(int numMastiles, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = numMastiles;
    }

    @Override
    public int modulo() {
        return super.modulo() + potenciaCV; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potenciaCV=" + potenciaCV + " " + super.toString() + '}';
    }
}
