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
public final class Camping extends AlojamientoExtraHotelero {

    private int capMaxCarpas;
    private int cantBanios;
    private boolean restaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, int metrosCuadrados, int capMaxCarpas, int cantBanios, boolean restaurante) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping " + super.toString() + "capMaxCarpas=" + capMaxCarpas + ", cantBanios=" + cantBanios + ", restaurante=" + restaurante + '}';
    }

    @Override
    public void precioHabitacion() {
    }
}
