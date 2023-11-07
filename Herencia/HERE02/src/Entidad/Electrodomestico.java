package Entidad;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author david
 */
public abstract class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumo;
    protected int peso;

    Scanner leer = new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        if (letra < 'A' || letra > 'F') {
            letra = 'F';
        }
        return letra;
    }

    public String comprobarColor(String color) {
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo")
                && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
            color = "Blanco";
        }
        return color;
    }

    public void crearElectrodomestico() {
        setPrecio(1000d);
        System.out.print("Escriba el color del electrodoméstico: ");
        setColor(comprobarColor(leer.nextLine()));
        System.out.print("Escriba el consumo del electrodoméstico: ");
        setConsumo(comprobarConsumoEnergetico(leer.nextLine().charAt(0)));
        int weight;
        do {
            System.out.print("Escriba el peso del electrodoméstico (valor positivo): ");
            weight = Integer.parseInt(leer.nextLine());
        } while (weight < 0);
        setPeso(weight);
    }

    public void precioFinal() {
        switch (consumo) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;
            default:
                break;
        }

        if (peso <= 19) {
            precio += 100;
        } else if (peso <= 49) {
            precio += 500;
        } else if (peso <= 79) {
            precio += 800;
        } else {
            precio += 1000;
        }
    }

    @Override
    public String toString() {
        return "Precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso;
    }
}
