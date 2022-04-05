package com.dumas.sbta.data.jpa.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/04 12:13
 */
@Getter
@Setter
@ToString
@Entity(name = "t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 7628915597860753149L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String password;
    /**
     * TODO 忽略该字段的映射
     */
    @Transient
    private String email;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
