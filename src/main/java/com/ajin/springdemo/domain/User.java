package com.ajin.springdemo.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer userid;
    private String username;
    private Integer password;
    private String nikename;
    private Integer age;
    private Boolean sex;
    private String email;
    private Date regDate;
    private Boolean role;

}
