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
public abstract class Hotel extends Alojamiento {

    protected int cantHab;
    protected int numCamas;
    protected int cantPisos;
    protected Double pHab;

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int numCamas, int cantPisos) {
        super(nombre, direccion, localidad, gerente);
        this.cantHab = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getpHab() {
        return pHab;
    }

    @Override
    public String toString() {
        return super.toString() + "cantHabitaciones=" + cantHab + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitaciones=" + pHab;
    }
}
