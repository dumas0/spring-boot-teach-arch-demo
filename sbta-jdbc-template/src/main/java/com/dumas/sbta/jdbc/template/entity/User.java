package com.dumas.sbta.jdbc.template.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/02 16:41
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
