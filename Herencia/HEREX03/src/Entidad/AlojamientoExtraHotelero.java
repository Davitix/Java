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
public abstract class AlojamientoExtraHotelero extends Alojamiento{
    
    private boolean privado;
    private int metrosCuadrados;

    public AlojamientoExtraHotelero(String nombre, String direccion, String localidad, String gerente, boolean privado, int metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return super.toString() + "privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + '}';
    }
}
