package Entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class Armadura {

    private String colorPrimario;
    private String colorSecundario;
    private List<Device> dispositivos = new ArrayList<>();
    private int propulsoRed = 2;
    private int repulsores = 2;
    private int dureza;
    private int nivelDeSalud;
    private float nivelEnergia;

    public Armadura(String colorPrimario, String colorSecundario, int dureza, int nivelDeSalud, float nivelEnergia) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        dispositivos.add(new Device("Bota Derecha", true));
        dispositivos.add(new Device("Bota Izquierda", true));
        dispositivos.add(new Device("Guante Derecho", true));
        dispositivos.add(new Device("Guante Izquierdo", true));
        this.dureza = dureza;
        this.nivelDeSalud = nivelDeSalud;
        this.nivelEnergia = nivelEnergia;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public List<Device> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(List<Device> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public int getPropulsoRed() {
        return propulsoRed;
    }

    public void setPropulsoRed(int propulsoRed) {
        this.propulsoRed = propulsoRed;
    }

    public int getRepulsores() {
        return repulsores;
    }

    public void setRepulsores(int repulsores) {
        this.repulsores = repulsores;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public int getNivelDeSalud() {
        return nivelDeSalud;
    }

    public void setNivelDeSalud(int nivelDeSalud) {
        this.nivelDeSalud = nivelDeSalud;
    }

    public float getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(float nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", dispositivos=" + dispositivos + ", propulsoRed=" + propulsoRed + ", repulsores=" + repulsores + ", dureza=" + dureza + ", nivelDeSalud=" + nivelDeSalud + ", nivelEnergia=" + nivelEnergia + '}';
    }

}
