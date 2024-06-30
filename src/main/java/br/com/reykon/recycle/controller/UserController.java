package br.com.reykon.recycle.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
public class UserController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Hello world";
    }
}
