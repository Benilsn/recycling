package br.com.reykon.recycle.application.service.impl;

import br.com.reykon.recycle.application.dto.UserDto;
import br.com.reykon.recycle.application.mapper.UserMapper;
import br.com.reykon.recycle.domain.entity.User;
import br.com.reykon.recycle.domain.repository.UserRepository;
import br.com.reykon.recycle.domain.service.Service;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class UserService implements Service<User, UserDto> {

    UserRepository userRepository;
    UserMapper mapper;

    public UserService(UserRepository userRepository, UserMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(UserDto dto) {
        userRepository.persist(mapper.toEntity(dto));
    }
}
