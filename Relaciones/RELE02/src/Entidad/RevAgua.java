package Entidad;

import java.util.Random;

/**
 *
 * @author david
 */
public class RevAgua {

    private int posActual;
    private int posAgua;

    public void llenarRevolver() {
        posActual = new Random().nextInt(8)+1;
        posAgua = new Random().nextInt(8)+1;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }
    
    public boolean mojar(){
        if (posActual == posAgua) {
            return true;
        } else {
            return false;
        }
    }
    
    public void siguienteChorro(){
        if (posActual<8) {
            posActual++;
        } else {
            posActual=1;
        }
    }

    @Override
    public String toString() {
        return "Revolver de Agua: " + "Inicia en = " + posActual + ", Disparo en = " + posAgua;
    }
    
}
