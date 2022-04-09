package com.example.spring.with.mvc.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "USER_DETAILS")
public class User {

    @Id
    @GeneratedValue
    Integer userId;
    String uname;
    String email;
    Long phno;
}
