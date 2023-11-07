package Entidad;

import Interfaces.calculosFormas;

/**
 *
 * @author david
 */
public final class Circulo implements calculosFormas {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return 2 * pi * radio;
    }

    @Override
    public double area() {
        return pi * Math.pow(radio, 2);
    }
}
