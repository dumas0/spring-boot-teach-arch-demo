package com.dumas.sta.jdbc.template.entity;

import lombok.Data;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/02 16:41
 */
@Data
public class User {
    private Long id;
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
