/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polijic.ejb.exceptions;

/**
 *
 * @author l.sanchez
 */
public class EntidadDuplicadaException extends Exception {

    /**
     * Creates a new instance of <code>EntidadDuplicadaException</code> without
     * detail message.
     */
    public EntidadDuplicadaException() {
    }

    /**
     * Constructs an instance of <code>EntidadDuplicadaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EntidadDuplicadaException(String msg) {
        super(msg);
    }
}
