/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polijic.ejb;

import co.edu.polijic.ejb.exceptions.EntidadDuplicadaException;
import co.edu.polijic.ejb.exceptions.EntidadNoExistenteException;
import co.edu.polijic.ejb.exceptions.ViolacionClaveForaneaException;
import co.edu.polijic.proyectoejemplojpql.model.Customer;
import javax.ejb.Remote;

/**
 *
 * @author l.sanchez
 */
@Remote
public interface CustomerSessionBeanRemote {

    void create(Customer customer) throws EntidadDuplicadaException;

    void edit(Customer customer) throws EntidadNoExistenteException, ViolacionClaveForaneaException;

}
