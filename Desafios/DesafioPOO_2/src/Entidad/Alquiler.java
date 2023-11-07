/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.Period;
import java.util.*;

/**
 *
 * @author david
 */
public class Alquiler {

    private String titulo;
    private Date fechaInicio;
    private Date fechaFin;
    private double precio;

    public Alquiler() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(Date fechaInicio, Date fechaFin) {
        this.precio = 10;
        int dias = ((fechaFin.getYear() - fechaInicio.getYear()) * 365) + ((fechaFin.getMonth() - fechaInicio.getMonth()) * 30) + (fechaFin.getDate() - fechaInicio.getDate());

        if (dias > 3) {
            for (int i = 3; i < dias; i++) {
                this.precio *= 1.1;
            }
        }

    }
}
