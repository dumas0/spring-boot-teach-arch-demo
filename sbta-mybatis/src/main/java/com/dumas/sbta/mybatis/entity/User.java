package com.dumas.sbta.mybatis.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/04 12:55
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 8534989293915837593L;

    private Long id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
