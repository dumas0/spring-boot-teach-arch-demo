package com.dumas.sbta.mongodb.dataobject;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * 用户
 *
 * @author dumas
 * @date 2022/04/27 2:56 PM
 */
@Data
@Document(collection = "User")
public class UserDO {

    @Data
    public static class Profile {
        /**
         * 昵称
         */
        private String nickname;
        /**
         * 性别
         */
        private Integer gender;
    }

    @Id
    private Integer id;
    /**
     * 账号
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private LocalDate createTime;
    /**
     * 用户信息
     */
    private Profile profile;
}
