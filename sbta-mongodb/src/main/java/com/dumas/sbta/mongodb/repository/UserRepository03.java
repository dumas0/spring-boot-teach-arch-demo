package com.dumas.sbta.mongodb.repository;

import com.dumas.sbta.mongodb.dataobject.UserDO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 利用 Example 查询
 *
 * @author dumas
 * @date 2022/04/27 4:23 PM
 */
public interface UserRepository03 extends MongoRepository<UserDO, Integer> {

    /**
     * 使用 username 精准匹配
     *
     * @param username
     * @return
     */
    default UserDO findByUsername01(String username) {
        // 创建 Example 对象，使用 username 查询
        UserDO probe = new UserDO();
        probe.setUsername(username);
        Example<UserDO> example = Example.of(probe);
        // 执行查询 如果为空，则返回 null
        return findOne(example).orElse(null);
    }

    /**
     * 使用 username 模糊匹配
     *
     * @param username
     * @return
     */
    default UserDO findByUsernameLike01(String username) {
        // 创建 Example 对象，使用 username 查询
        UserDO probe = new UserDO();
        probe.setUsername(username);
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("username", ExampleMatcher.GenericPropertyMatchers.contains());
        Example<UserDO> example = Example.of(probe, matcher);
        // 执行查询 如果为空，则返回 null
        return findOne(example).orElse(null);
    }
}
