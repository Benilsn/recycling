package br.com.reykon.recycle.application.mapper;

import br.com.reykon.recycle.application.dto.UserDto;
import br.com.reykon.recycle.domain.entity.User;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserMapper implements Mapper<User, UserDto> {

    @Override
    public User toEntity(UserDto dto) {
        User user = new User();
        user.name = dto.name;
        user.email = dto.email;
        user.password = dto.password;
        user.role = dto.role;
        user.phone = dto.phone;
        user.address = dto.address;
        user.wallet = dto.wallet;
        user.photo = dto.photo;

        return user;
    }


    @Override
    public UserDto toDto(User entity) {
        UserDto userDto = new UserDto();
        userDto.name = entity.name;
        userDto.email = entity.email;
        userDto.password = entity.password;
        userDto.role = entity.role;
        userDto.phone = entity.phone;
        userDto.address = entity.address;
        userDto.wallet = entity.wallet;
        userDto.photo = entity.photo;

        return userDto;
    }

}
