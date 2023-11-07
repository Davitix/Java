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
public final class EdificioDeOficinas extends Edificio {

    private int numOficinas;
    private int cantPersonasPorOficina;
    private int numPisos;

    public EdificioDeOficinas(int numOficinas, int cantPersonas, int numPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasPorOficina = cantPersonas;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonasPorOficina() {
        return cantPersonasPorOficina;
    }

    public void setCantPersonasPorOficina(int cantPersonasPorOficina) {
        this.cantPersonasPorOficina = cantPersonasPorOficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public int calcularSuperficie() {
        return 2 * ((ancho * largo) + (ancho * alto) + (alto * largo));
    }

    @Override
    public int calcularVolumen() {
        return ancho * alto * largo;
    }

    public void cantPersonas() {
        System.out.println("   En cada piso hay espacio para " + cantPersonasPorOficina + " personas. Y en todo el edificio hay espacio para: "
                + (cantPersonasPorOficina * numOficinas) + " personas.");
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + super.toString() + ", numOficinas=" + numOficinas + ", cantPersonasPorOficina=" + cantPersonasPorOficina + ", numPisos=" + numPisos + '}';
    }
    
    
}
