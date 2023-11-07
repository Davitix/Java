/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author david
 */
public class ArmaduraException extends Exception {

    /**
     * Creates a new instance of <code>ArmaduraException</code> without detail
     * message.
     */
    public ArmaduraException() {
    }

    /**
     * Constructs an instance of <code>ArmaduraException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ArmaduraException(String msg) {
        super(msg);
    }
}
