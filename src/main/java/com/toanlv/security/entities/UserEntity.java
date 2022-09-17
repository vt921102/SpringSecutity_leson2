package com.toanlv.security.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    Integer Id;

    @Getter
    @Setter
    @Column(name = "user_name")
    String userName;

    @Getter
    @Setter
    @Column(name = "pass_word")
    String passWord;

    public UserEntity() {

    }
}
