package Entidad;

/**
 *
 * @author david
 */
public abstract class Animal {
    
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String razaDelAnimal;

    public Animal(String nombre, String alimento, int edad, String razaDelAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaDelAnimal = razaDelAnimal;
    }
    
    public void Alimentarse(){
        System.out.println("Yo me alimento de " + alimento);
    }
    
}
