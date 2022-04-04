package com.dumas.sta.data.jpa.repository;

import com.dumas.sta.data.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/04 12:19
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 查询结果
     */
    List<User> findAllByUsername(String username);
}
