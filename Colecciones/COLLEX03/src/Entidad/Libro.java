package Entidad;

import java.util.Objects;

/**
 *
 * @author david
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroEjemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public int hashCode() {
        int hash = 9;
        hash = 25 * hash + Objects.hashCode(this.titulo);
        hash = 25 * hash + Objects.hashCode(this.autor);
        hash = 25 * hash + this.numeroEjemplares;
        hash = 25 * hash + this.ejemplaresPrestados;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.numeroEjemplares != other.numeroEjemplares) {
            return false;
        }
        if (this.ejemplaresPrestados != other.ejemplaresPrestados) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + ".\tAutor: " + autor + ".\tNúmero de ejemplares: " + numeroEjemplares + ".\tEjemplares prestados=" + ejemplaresPrestados + '.';
    }
}
