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
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int año;
    private String tipo;

    public Vehiculo() {
    }
    
    public Vehiculo(String marca, String modelo, int año, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("bici") || tipo.equalsIgnoreCase("bicicleta")){
            this.tipo = "Bicicleta";
        }
        if (tipo.equalsIgnoreCase("moto") || tipo.equalsIgnoreCase("motocicleta")){
            this.tipo = "Motocicleta";
        }
        if (tipo.equalsIgnoreCase("carro") || tipo.equalsIgnoreCase("auto") || tipo.equalsIgnoreCase("automovil")){
            this.tipo = "Automovil";
        }
    }
    
}
