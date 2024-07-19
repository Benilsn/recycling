package br.com.reykon.recycle.application.resource;

import br.com.reykon.recycle.application.dto.UserDto;
import br.com.reykon.recycle.application.service.impl.UserService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    UserService userService;


    @GET
    public String get() {
        return "Hello world";
    }

    @POST
    @Path("/register")
    @Transactional
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void register(
            @FormParam("name") String name,
            @FormParam("email") String email,
            @FormParam("password") String password,
            @FormParam("phone") Integer phone) {

        UserDto dto = new UserDto();
        dto.name = name;
        dto.email = email;
        dto.password = password;
        dto.phone = phone;

        userService.save(dto);
    }
}
