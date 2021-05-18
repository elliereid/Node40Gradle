package HelloWorldNode40.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldDropwizardResource {

    @GET
    public String simpleHello() {
        return "Hello! How are you today?";
    }


}