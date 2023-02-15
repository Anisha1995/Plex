package com.example.pragraplex.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CUSTOMER_ID")

    private Integer id;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;

    private String phone;
    private String login;
    private String passWord;

    @Transient
    private boolean isLoggedIn;

    private Date createDate;
    private Date updateDate;
}
