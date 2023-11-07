package Entidad;

/**
 *
 * @author david
 */
public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean disparo(RevAgua r) {
        if (r.mojar()) {
            mojado = true;
        } else {
            r.siguienteChorro();
        }
        return mojado;
    }

}
