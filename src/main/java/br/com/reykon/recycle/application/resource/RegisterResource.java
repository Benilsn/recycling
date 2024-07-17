package br.com.reykon.recycle.application.resource;

import br.com.reykon.recycle.domain.entity.User;
import br.com.reykon.recycle.domain.repository.UserRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/register")
public class RegisterResource {

    @Inject
    UserRepository userRepository;

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Transactional
    public void register(@FormParam("email") String email, @FormParam("password") String password) {
        User user = new User();
        user.email = email;
        user.password = password;

        userRepository.persist(user);
    }
}