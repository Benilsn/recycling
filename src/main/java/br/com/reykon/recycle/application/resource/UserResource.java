package br.com.reykon.recycle.application.resource;

import br.com.reykon.recycle.application.dto.UserDto;
import br.com.reykon.recycle.application.mapper.UserMapper;
import br.com.reykon.recycle.application.service.impl.UserService;
import br.com.reykon.recycle.domain.repository.UserRepository;
import br.com.reykon.recycle.domain.service.Service;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
@Produces(MediaType.TEXT_HTML)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    private Service userService;

    @Inject
    public UserResource(UserService userService) {
        this.userService = new UserService(new UserRepository(), new UserMapper());
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
