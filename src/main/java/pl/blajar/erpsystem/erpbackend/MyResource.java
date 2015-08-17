package pl.blajar.erpsystem.erpbackend;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.inject.Inject;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pl.blajar.erpsystem.beans.ExampleBean;
import pl.blajar.erpsystem.entity.Cargo;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	//@EJB
	//private ExampleBean exampleBean;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    	Cargo cargo = new Cargo();
    	cargo.setId(1l);
    	cargo.setName("wapno");
        return "added";
    }
}
