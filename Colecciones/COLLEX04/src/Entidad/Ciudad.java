package Entidad;

/**
 *
 * @author david
 */
public class Ciudad {
    
    private Integer codPostal;
    private String ciudad;

    public Ciudad() {
    }

    public Ciudad(Integer codPostal, String ciudad) {
        this.codPostal = codPostal;
        this.ciudad = ciudad;
    }

    public Integer getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(Integer codPostal) {
        this.codPostal = codPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Pais{" + "codPostal=" + codPostal + ", ciudad=" + ciudad + '}';
    }
    
}
