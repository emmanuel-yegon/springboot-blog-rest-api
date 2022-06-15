package com.springboot.blog.payload;

import lombok.Data;

@Data
public class LoginDto {

    private String usernameorEmail;
    private String password;

}
