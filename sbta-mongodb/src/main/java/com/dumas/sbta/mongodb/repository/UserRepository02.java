package com.dumas.sbta.mongodb.repository;

import com.dumas.sbta.mongodb.dataobject.UserDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 按照名称匹配查询
 *
 * @author dumas
 * @date 2022/04/27 3:59 PM
 */
public interface UserRepository02 extends MongoRepository<UserDO, Integer> {
    /**
     * 通过用户名查询
     *
     * @param username
     * @return
     */
    UserDO findByUsername(String username);

    /**
     * 通过用户名分页查询
     *
     * @param username
     * @param pageable
     * @return
     */
    Page<UserDO> findByUsernameLike(String username, Pageable pageable);
}
