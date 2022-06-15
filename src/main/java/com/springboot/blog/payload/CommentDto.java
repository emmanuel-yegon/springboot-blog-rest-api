package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {
    private long id;

    // name should not be null or empty
    // name should have atleast 3 characters
    @NotEmpty(message = "name should not be null or empty")
    private String name;

    //email should not be null or empty
    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    // body should not be null or empty
    // body should have atleast 10 characters
    @NotEmpty(message = "Comment body should not be null")
    @Size(min = 10, message = "Comment body must be 10 minimum characters")
    private String body;

}
