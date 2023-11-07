/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.*;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ServicePassMan {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String[] specials = {"!", "#", "-", "_", "$", "&", "/", "*"};

    public PasswordManager createPassword() {

        PasswordManager discount = new PasswordManager();

        System.out.print("Cree su contraseña: La contraseña debe tener una longitud mayor a 8 digitos, incluir al menos un carácter "
                + "especial (!, #, -, _, $, &, /, *), o una mayúscula.\n"
                + "Ingrese su contraseña: ");
        discount.setPassword(leer.nextLine());

        return discount;
    }

    public boolean length(PasswordManager password) {
        return password.getPassword().length() > 7;
    }

    public boolean symbols(PasswordManager password) {
        boolean symbol = false;
        for (int i = 0; i < password.getPassword().length(); i++) {
            for (String special : specials) {
                if (password.getPassword().subSequence(i, i+1).equals(special)) {
                    symbol = true;
                    break;
                }
            }
            if (symbol){
                break;
            }
        }
        return symbol;
    }

    public boolean mayus(PasswordManager password) {
        boolean mayus = false;
        for (int i = 0; i < password.getPassword().length(); i++) {
            if (Character.isUpperCase(password.getPassword().toCharArray()[i])){
                mayus = true;
                break;
            }
        }
        return mayus;
    }
    
    public boolean validator(PasswordManager password){
        if (length(password) && symbols(password) && mayus(password)){
            System.out.println("Contraseña segura.");
            return true;
        } else {
            System.out.println("Contraseña débil.");
            return false;
        }
    }
    
    public void update(PasswordManager password){
        System.out.print("Cree su contraseña: La contraseña debe tener una longitud mayor a 8 digitos, incluir al menos un carácter "
                + "especial (!, #, -, _, $, &, /, *), o una mayúscula.\n"
                + "Ingrese su contraseña: ");
        password.setPassword(leer.nextLine());
    }
    
}
