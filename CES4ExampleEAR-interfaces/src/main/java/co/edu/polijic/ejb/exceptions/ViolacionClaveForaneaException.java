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
public class ViolacionClaveForaneaException extends Exception {

    /**
     * Creates a new instance of <code>ViolacionClaveForaneaException</code>
     * without detail message.
     */
    public ViolacionClaveForaneaException() {
    }

    /**
     * Constructs an instance of <code>ViolacionClaveForaneaException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ViolacionClaveForaneaException(String msg) {
        super(msg);
    }
}
