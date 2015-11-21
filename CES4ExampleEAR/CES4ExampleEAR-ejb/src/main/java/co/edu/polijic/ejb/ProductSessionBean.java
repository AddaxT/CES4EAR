/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polijic.ejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author l.sanchez
 */
@EJB(mappedName = "ejb/ProductBean")
@Stateless
public class ProductSessionBean implements ProductSessionBeanRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
