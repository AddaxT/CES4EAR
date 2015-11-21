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
public class EntidadNoExistenteException extends Exception {

    /**
     * Creates a new instance of <code>EntidadNoExistenteException</code>
     * without detail message.
     */
    public EntidadNoExistenteException() {
    }

    /**
     * Constructs an instance of <code>EntidadNoExistenteException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public EntidadNoExistenteException(String msg) {
        super(msg);
    }
}
