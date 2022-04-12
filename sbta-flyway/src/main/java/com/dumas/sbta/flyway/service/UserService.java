package com.dumas.sbta.flyway.service;

import com.dumas.sbta.flyway.entity.User;

import java.util.List;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/12 11:14
 */
public interface UserService {
    /**
     * 新增一个用户
     *
     * @param name
     * @param age
     */
    int create(String name, Integer age);

    /**
     * 根据name查询用户
     *
     * @param name
     * @return
     */
    List<User> getByName(String name);

    /**
     * 根据name删除用户
     *
     * @param name
     */
    int deleteByName(String name);

    /**
     * 获取用户总量
     */
    int getAllUsers();

    /**
     * 删除所有用户
     */
    int deleteAllUsers();

}
