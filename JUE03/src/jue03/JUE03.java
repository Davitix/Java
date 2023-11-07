/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jue03;

import Entidad.PasswordManager;
import Servicio.ServicePassMan;

/**
 *
 * @author david
 */
public class JUE03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicePassMan sd = new ServicePassMan();
        PasswordManager password = sd.createPassword();
        
        while (!sd.validator(password)) {
            sd.update(password);
        }

    }

}
