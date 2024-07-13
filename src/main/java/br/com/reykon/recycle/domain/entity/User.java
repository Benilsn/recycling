package br.com.reykon.recycle.domain.entity;

import jakarta.persistence.*;

@Entity(name = "tb_usr")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user-id", nullable = false)
    private Long userId;

    public String name;
    public String email;
    public String password;
    public String role;
    public Integer phone;
    public Double wallet;
    public String photo;

//    @OneToOne
//    @JoinColumn(name = "address_id")
//    public Address address;


}
