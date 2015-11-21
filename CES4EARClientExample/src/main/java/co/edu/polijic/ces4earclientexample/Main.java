package co.edu.polijic.ces4earclientexample;

import co.edu.polijic.ejb.CustomerSessionBeanRemote;
import co.edu.polijic.ejb.exceptions.EntidadDuplicadaException;
import co.edu.polijic.proyectoejemplojpql.model.Customer;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.naming.NamingException;

/**
 * Enterprise Application Client main class.
 *
 */
public class Main {

    public static void main(String[] args) throws IOException, EntidadDuplicadaException, NamingException {
        Properties props = new Properties();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("ServiceLocator.properties");
        if (inputStream != null) {
            props.load(inputStream);
            ExampleServiceLocator esl = new ExampleServiceLocator(props);
            CustomerSessionBeanRemote customerSessionBeanRemote = esl.<CustomerSessionBeanRemote>getEJBInstance("ejb/CustomerBean");
            customerSessionBeanRemote.create(new Customer(5));
        }
    }
}
