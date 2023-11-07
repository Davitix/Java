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
public final class Residencia extends AlojamientoExtraHotelero {

    private int cantHab;
    private boolean discount;
    private boolean campoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado, int metrosCuadrados, int cantHab, boolean discount, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantHab = cantHab;
        this.discount = discount;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia " + super.toString() + "cantHab=" + cantHab + ", discount=" + discount + ", campoDeportivo=" + campoDeportivo + '}';
    }

    @Override
    public void precioHabitacion() {
    }
}
