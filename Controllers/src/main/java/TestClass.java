
import co.edu.polijic.proyectoejemplojpql.controllers.CustomerJpaController;
import co.edu.polijic.proyectoejemplojpql.model.Customer;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sala306
 */
public class TestClass {
    public static void main(String[] args) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyectoEjemploJPQLPU");
        CustomerJpaController customerJpaController = new CustomerJpaController(emf);
        for (Customer customer : customerJpaController.getAllCustomers()) {
            System.out.println(customer);
        }
        System.out.println("Listar los primeros 5");
        for (Customer customer : customerJpaController.getFirstFiveCustomers()) {
            System.out.println(customer);
        }
        System.out.println("Listar los primeros 5 con codigos de descuento L o H");
        for (Customer customer : customerJpaController.getCustomersSpecialDicountCodes()) {
            System.out.println(customer);
        }
        
        System.out.println("Listar los primeros 5 con codigos de descuento L o H");
        for (Object[] customer : customerJpaController.getTopTen()) {
            System.out.println(Arrays.toString(customer));
        }
    }
}
