package Entidad;

import java.util.Arrays;

public class Alumno {

    private String nombre;
    private int DNI;
    private int votos;

    public Alumno() {
    }

    public Alumno(String nombre, int DNI, int votos) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + ".\tDNI: " + DNI + ".\tVotos: " + votos + '.';
    }
    
}
