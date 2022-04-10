package com.dumas.sbta.redis.lettuce.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/06 14:10
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -3520063575322615442L;
    private Long id;
    private String username;
    private String password;

    public User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
