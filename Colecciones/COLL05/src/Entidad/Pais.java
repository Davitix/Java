package Entidad;

public class Pais {

    private String name;
    private String continente;

    public Pais(String name, String continente) {
        this.name = name;
        this.continente = continente;
    }

    public Pais() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public String toString() {
        return "Pais: " + name + "\t\tContinente: " + continente + ".";
    }

}
