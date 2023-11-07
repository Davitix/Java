package Entidad;

/**
 *
 * @author david
 */
public final class Polideportivo<TI> extends Edificio {

    private String nombre;
    private TI tipoInstalacion;

    public Polideportivo(String nombre, TI tipoInstalacion, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TI getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(TI tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
    
    @Override
    public int calcularSuperficie() {
        return 2 * ((ancho * largo) + (ancho * alto) + (alto * largo));
    }

    @Override
    public int calcularVolumen() {
        return ancho * alto * largo;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + super.toString() + ", nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion + '}';
    }
}
