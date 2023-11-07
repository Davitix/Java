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
public class Cliente {

    private int id;
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String objetivo;
    private double IMC;
    private Rutina rutina;

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC() {
        this.IMC = peso/(Math.pow(altura, 2));
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    @Override
    public String toString() {
        return id + ". " + nombre + ": Edad=" + edad + " años, Altura=" + altura + " m, Peso=" + peso + " kg, objetivo=" + objetivo + ", IMC=" + String.format("%.2f", IMC) + ", Rutina=" + rutina.getNombre();
    }

}
