package Servicio;

import Entidad.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ServicioArmadura {

    Scanner leer = new Scanner(System.in);
    Random rdn = new Random();
    List<Armadura> armaduras = new ArrayList<>();
    Objetivo[] objetivos = new Objetivo[10];

    public void energiaInsuficiente(Armadura armadura, int minutos, int consBotas, int consGuantes) throws ArmaduraException {
        try {
            if (armadura.getNivelEnergia() < (minutos * (consBotas + consGuantes))) {
                throw new ArmaduraException("No tiene suficiente energía para esta acción.");
            }
        } catch (ArmaduraException a) {
            throw a;
        }
    }

    public void dispositivoDaniado(Device dispositivo) throws ArmaduraException {
        try {
            if (!dispositivo.isFuncional()) {
                throw new ArmaduraException();
            }
        } catch (ArmaduraException a) {
            throw a;
        }
    }

    public void usarBotas(Device dispositivo, int consumo, int intensidad) throws ArmaduraException {
        try {
            dispositivoDaniado(dispositivo);
            consumo += intensidad;
        } catch (ArmaduraException a) {
            throw new ArmaduraException("El " + dispositivo.getNombre() + " se encuentra averiado.");
        }
    }

    public void usarGuantes(Device dispositivo, int consumo, int intensidad) throws ArmaduraException {
        try {
            dispositivoDaniado(dispositivo);
            consumo += intensidad;
        } catch (ArmaduraException a) {
            throw new ArmaduraException("El " + dispositivo.getNombre() + " se encuentra averiado.");
        }
    }

    public void comunicar(Armadura armadura) {
        if (armadura.getNivelEnergia() == 0) {
            System.out.println("Sistemas apagados");
        } else {
            armadura.setNivelEnergia(armadura.getNivelEnergia() - 1);
        }
    }

    public void acción(Armadura armadura, int opc) {
        int minutos = 0, consBotas = 0, consGuantes = 0;
        String[] mensaje = {"caminar", "correr", "propulsarse", "volar", "atacar"};

        try {
            switch (opc) {
                case 1:
                    usarBotas(armadura.getDispositivos().get(0), consBotas, 1);
                    usarBotas(armadura.getDispositivos().get(1), consBotas, 1);
                    break;
                case 2:
                    usarBotas(armadura.getDispositivos().get(0), consBotas, 2);
                    usarBotas(armadura.getDispositivos().get(1), consBotas, 2);
                    break;
                case 3:
                    usarBotas(armadura.getDispositivos().get(0), consBotas, 3);
                    usarBotas(armadura.getDispositivos().get(1), consBotas, 3);
                    break;
                case 4:
                    usarBotas(armadura.getDispositivos().get(0), consBotas, 3);
                    usarBotas(armadura.getDispositivos().get(1), consBotas, 3);
                    usarBotas(armadura.getDispositivos().get(2), consGuantes, 2);
                    usarBotas(armadura.getDispositivos().get(3), consGuantes, 2);
                    break;
                case 5:
                    usarBotas(armadura.getDispositivos().get(2), consGuantes, 3);
                    usarBotas(armadura.getDispositivos().get(3), consGuantes, 3);
                    break;
                default:
                    break;
            }

            sufriendoDanios(armadura, opc);

            System.out.print("Cuanto tiempo desea " + mensaje[opc - 1] + ": ");
            comunicar(armadura);

            do {
                try {
                    minutos = Integer.parseInt(leer.nextLine());
                    comunicar(armadura);
                    energiaInsuficiente(armadura, minutos, consBotas, consGuantes);
                    armadura.setNivelEnergia(armadura.getNivelEnergia() - (minutos * (consBotas + consGuantes)));
                } catch (NumberFormatException a) {
                    System.out.print("Por favor escriba una cantidad numérica: ");
                    comunicar(armadura);
                } catch (ArmaduraException a) {
                    System.out.println(a.getMessage());
                }
            } while (minutos == 0);

        } catch (ArmaduraException a) {
            System.out.println(a.getMessage());
        }
    }

    public void estadoBateria(Armadura armadura) {
        System.out.println("Actualmente el reactor se encuentra en un "
                + ((armadura.getNivelEnergia() / Float.MAX_VALUE) * 100) + "% de capacidad");
        comunicar(armadura);
    }

    public void estadoBateriaOtrasMedidas(Armadura armadura) {
        System.out.println("Actualmente el reactor presenta energía de " + (armadura.getNivelEnergia() * 60 / 1000) + " Joules");
        System.out.println("Actualmente el reactor presenta energía de " + (armadura.getNivelEnergia() / 60) + " BTU's");
        comunicar(armadura);
    }

    public void sufrirDanio(Device dispositivo) {
        if (rdn.nextDouble() <= 0.3) {
            dispositivo.setFuncional(false);
        }
    }

    public void sufriendoDanios(Armadura armadura, int opc) {
        switch (opc) {
            case 1:
            case 2:
            case 3:
                sufrirDanio(armadura.getDispositivos().get(0));
                sufrirDanio(armadura.getDispositivos().get(1));
                break;
            case 4:
                sufrirDanio(armadura.getDispositivos().get(0));
                sufrirDanio(armadura.getDispositivos().get(1));
                sufrirDanio(armadura.getDispositivos().get(2));
                sufrirDanio(armadura.getDispositivos().get(3));
                break;
            case 5:
                sufrirDanio(armadura.getDispositivos().get(2));
                sufrirDanio(armadura.getDispositivos().get(3));
                break;
            default:
                break;
        }
    }

    public void repararDanio(Device dispositivo) {
        if (!dispositivo.isFuncional() && Math.random() <= 0.4) {
            dispositivo.setFuncional(true);
        }
    }

    public void revisandoDispositivos(Armadura armadura) {
        for (int i = 0; i < armadura.getDispositivos().size(); i++) {
            if (!armadura.getDispositivos().get(i).isFuncional()) {
                do {
                    repararDanio(armadura.getDispositivos().get(i));
                    if (Math.random() <= 0.3) {
                        armadura.getDispositivos().get(i).setDestruido(true);
                    }
                } while (!armadura.getDispositivos().get(i).isFuncional() && !armadura.getDispositivos().get(i).isDestruido());
            }
        }
    }

    public double radar(Objetivo obj) {
        double dist = Math.sqrt(Math.pow(obj.getX(), 2) + Math.pow(obj.getY(), 2) + Math.pow(obj.getZ(), 2));
        return dist;
    }

    public void simulador() {

        System.out.println("¿Cuántos objetivos desea buscar?");
        int obj = Integer.parseInt(leer.nextLine());

        try {
            for (int i = 0; i < obj; i++) {
                objetivos[i] = new Objetivo(rdn.nextInt(10000), rdn.nextInt(10000), rdn.nextInt(10000), rdn.nextInt(5000), rdn.nextBoolean());
            }
            for (int i = 0; i < obj; i++) {
                System.out.println((i + 1) + ". " + objetivos[i]);
                System.out.println("El objetivo " + objetivos[i] + " se encuentra a " + radar(objetivos[i]) + " metros.");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("La versión actual de radar tiene un limite de búsqueda de 10 objetivos.");
        }
    }

    public void destruirEnemigos(Armadura armadura) {
        float eAntDisparo, ePosDisparo;
        double nivelBateria = (armadura.getNivelEnergia() / Float.MAX_VALUE) * 100;
        for (Objetivo objetivo : objetivos) {
            if (objetivo.isHostil()) {
                if (nivelBateria <= 0.1) {
                    acción(armadura, 4);
                } else {
                    do {
                        eAntDisparo = armadura.getNivelEnergia();
                        acción(armadura, 5);
                        ePosDisparo = armadura.getNivelEnergia();
                        objetivo.setResistencia((int) (objetivo.getResistencia() - ((eAntDisparo - ePosDisparo) / radar(objetivo))));
                    } while (objetivo.getResistencia() > 0 && nivelBateria > 0.1);
                }
            }
        }
    }

    public void menuConsumo() {
        System.out.println("¿Qué deseas hacer?");
        System.out.print("1. Caminar\n" + "2. Correr\n" + "3. Propulsarse\n" + "4. Volar\n" + "5. Atacar\n"
                + "6. Salir\n" + "Su opción: ");
    }

    public void menu() {
        System.out.println("Hola soy JARVIS, tu asistente personal (In British)" + "¿Qué deseas hacer?");
        System.out.print("1. Acciones\n" + "2. Mostrar Estado\n" + "3. Estado Reactor\n" + "4. Revisar Dispositivos\n" + "5. Simulador\n"
                + "6. Destruyendo Enemigos\n" + "7. Acciones Evasivas\n" + "8. Salir\n" + "Su opción: ");
    }

    public void opciones() {
        armaduras.add(new Armadura("Dorado", "Rojo", 100, 100, 1000000));
        menu();

        int opc = Integer.parseInt(leer.nextLine());

        do {
            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Lo siento, no entiendo su instrucción señor.");
                    break;
            }
        } while (opc != 8);
    }
}
