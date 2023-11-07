package Entidad;

import java.util.Arrays;

public class Cine {

    private String[][] sala = new String[8][6];
    private Pelicula peliculaReproduccion;
    private double precioEntrada;

    public Cine() {
    }

    public Cine(String[][] sala, Pelicula peliculaReproduccion, double precioEntrada) {
        super();
        this.sala = sala;
        this.peliculaReproduccion = peliculaReproduccion;
        this.precioEntrada = precioEntrada;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public Pelicula getPeliculaReproduccion() {
        return peliculaReproduccion;
    }

    public void setPeliculaReproduccion(Pelicula peliculaReproduccion) {
        this.peliculaReproduccion = peliculaReproduccion;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine [sala=" + Arrays.toString(sala) + ", peliculaReproduccion=" + peliculaReproduccion
                + ", precioEntrada=" + precioEntrada + "]";
    }
    
}
