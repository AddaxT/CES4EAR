/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polijic.ejb;

import co.edu.polijic.ejb.exceptions.EntidadDuplicadaException;
import co.edu.polijic.ejb.exceptions.EntidadNoExistenteException;
import co.edu.polijic.ejb.exceptions.ViolacionClaveForaneaException;
import co.edu.polijic.proyectoejemplojpql.controllers.CustomerJpaController;
import co.edu.polijic.proyectoejemplojpql.controllers.exceptions.IllegalOrphanException;
import co.edu.polijic.proyectoejemplojpql.controllers.exceptions.NonexistentEntityException;
import co.edu.polijic.proyectoejemplojpql.controllers.exceptions.PreexistingEntityException;
import co.edu.polijic.proyectoejemplojpql.model.Customer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

/**
 *
 * @author l.sanchez
 */
@EJB(mappedName = "ejb/CustomerBean")
@Stateless
public class CustomerSessionBean implements CustomerSessionBeanRemote {

    @PersistenceContext(unitName = "proyectoEjemploJPQLPU")
    private EntityManagerFactory emf;

    @Override
    public void create(Customer customer) throws EntidadDuplicadaException {
        CustomerJpaController controller = new CustomerJpaController(emf);
        try {
            controller.create(customer);
        } catch (PreexistingEntityException ex) {
            Logger.getLogger(CustomerSessionBean.class.getName()).log(Level.SEVERE, null, ex);
            throw new EntidadDuplicadaException(ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(CustomerSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public void edit(Customer customer) throws EntidadNoExistenteException, ViolacionClaveForaneaException {
        CustomerJpaController controller = new CustomerJpaController(emf);
        try {
            controller.edit(customer);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(CustomerSessionBean.class.getName()).log(Level.SEVERE, null, ex);
            throw new EntidadNoExistenteException(ex.getMessage());
        } catch (IllegalOrphanException ex) {
            Logger.getLogger(CustomerSessionBean.class.getName()).log(Level.SEVERE, null, ex);
            throw new ViolacionClaveForaneaException(ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(CustomerSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
