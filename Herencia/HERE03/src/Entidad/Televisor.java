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
public final class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(double precio, String color, char consumoEnergetico, int peso, int resolucion, boolean TDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public void crearElectrodomestico() {
        super.crearElectrodomestico(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Escriba la resolución del televisor: ");
        setResolucion(Integer.parseInt(leer.nextLine()));
        System.out.print("Escriba si tiene TDT ");
        String respuesta;
        do {
            System.out.print("S (Si) / N (No): ");
            respuesta = leer.nextLine();
        } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
        if (respuesta.equalsIgnoreCase("S")) {
            TDT = true;
        } else {
            TDT = false;
        }
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (resolucion >= 40) {
            precio *= 1.3;
        }
        if (TDT) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        if (TDT) {
            return "Televisor{" + super.toString() + ", resolucion=" + resolucion + ", TDT=Si" + '}';
        } else {
            return "Televisor{" + super.toString() + ", resolucion=" + resolucion + ", TDT=No" + '}';
        }
    }

}
