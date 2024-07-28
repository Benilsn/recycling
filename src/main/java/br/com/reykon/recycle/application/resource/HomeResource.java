package br.com.reykon.recycle.application.resource;

import io.quarkus.qute.*;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class HomeResource {

    @GET
    public TemplateInstance homePage() {
        return Templates.home().data("name", "Test");
    }

    @GET
    @Path("/register")
    public TemplateInstance registerPage() {
        return Templates.register();
    }

}
