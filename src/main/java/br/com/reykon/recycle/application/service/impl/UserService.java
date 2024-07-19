package br.com.reykon.recycle.application.service.impl;

import br.com.reykon.recycle.application.dto.UserDto;
import br.com.reykon.recycle.application.mapper.UserMapper;
import br.com.reykon.recycle.entity.User;
import br.com.reykon.recycle.repository.UserRepository;
import br.com.reykon.recycle.service.Service;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.Optional;

@ApplicationScoped
public class UserService implements Service<User, UserDto> {

    @Inject
    UserRepository userRepository;

    @Inject
    UserMapper mapper;


    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(UserDto dto) {
        userRepository.persist(mapper.toEntity(dto));
    }
}
