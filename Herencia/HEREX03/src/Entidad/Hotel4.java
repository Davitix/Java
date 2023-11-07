/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author david
 */
public class Hotel4 extends Hotel {

    private String gim;
    private String nameRest;
    private int capRest;

    public Hotel4(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int numCamas, int cantPisos, String gim, String nameRest, int capRest) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, numCamas, cantPisos);
        this.gim = gim;
        this.nameRest = nameRest;
        this.capRest = capRest;
    }

    public String getGim() {
        return gim;
    }

    public void setGim(String gim) {
        this.gim = gim;
    }

    public String getNameRest() {
        return nameRest;
    }

    public void setNameRest(String nameRest) {
        this.nameRest = nameRest;
    }

    public int getCapRest() {
        return capRest;
    }

    public void setCapRest(int capRest) {
        this.capRest = capRest;
    }

    @Override
    public void precioHabitacion() {
        pHab = (double) 50 + (numCamas * cantHab * cantPisos);
        if (capRest <= 30) {
            pHab += 10;
        } else if (capRest <= 50) {
            pHab += 30;
        } else {
            pHab += 50;
        }
        if (gim.equalsIgnoreCase("A")) {
            pHab += 50;
        } else {
            pHab += 30;
        }
    }

    @Override
    public String toString() {
        return "Hotel " + super.toString() + "gim=" + gim + ", nameRest=" + nameRest + ", capRest=" + capRest + '}';
    }

}
