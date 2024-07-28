package br.com.reykon.recycle.application.dto;

import br.com.reykon.recycle.domain.entity.Address;

public class UserDto {

    public String name;
    public String email;
    public String password;
    public String role;
    public Integer phone;
    public Double wallet;
    public String photo;
    public Address address;

    public UserDto() {}
}
