package com.dumas.sbta.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/07 10:52
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@ApiModel
public class User implements Serializable {
    private static final long serialVersionUID = 1301443111675170854L;
    private Long id;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("密码")
    private String password;

    public User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
