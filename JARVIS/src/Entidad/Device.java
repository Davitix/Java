package Entidad;

/**
 *
 * @author david
 */
public class Device {

    private String nombre;
    private boolean funcional;
    private boolean destruido = false;

    public Device(String nombre, boolean state) {
        this.nombre = nombre;
        this.funcional = state;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isFuncional() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    @Override
    public String toString() {
        return nombre + ": " + funcional;
    }

}
