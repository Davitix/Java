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
public final class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String color, char consumoEnergetico, int peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public void crearElectrodomestico() {
        super.crearElectrodomestico(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Escriba la capacidad de carga de la lavadora: ");
        setCarga(Integer.parseInt(leer.nextLine()));
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (carga >= 30) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + ", carga=" + carga + '}';
    }
}
