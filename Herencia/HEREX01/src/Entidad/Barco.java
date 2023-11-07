package Entidad;

import java.util.Date;

/**
 *
 * @author david
 */
public class Barco {

    protected int matricula;
    protected int metrosEslora;
    protected int anioFabricacion;

    public Barco(int matricula, int metrosEslora, int añoFabricacion) {
        this.matricula = matricula;
        this.metrosEslora = metrosEslora;
        this.anioFabricacion = añoFabricacion;
    }

    public int modulo() {
        return metrosEslora * 10;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", metrosEslora=" + metrosEslora + ", a\u00f1oFabricacion=" + anioFabricacion + '}';
    }
}
