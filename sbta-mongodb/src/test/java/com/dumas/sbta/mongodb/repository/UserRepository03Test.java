package com.dumas.sbta.mongodb.repository;

import com.dumas.sbta.mongodb.MongoDBApplication;
import com.dumas.sbta.mongodb.dataobject.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author dumas
 * @date 2022/04/27 4:29 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongoDBApplication.class)
public class UserRepository03Test {
    @Autowired
    private UserRepository03 userRepository;

    @Test
    public void testFindByUsername01() {
        UserDO user = userRepository.findByUsername01("yutou");
        System.out.println(user);
    }

    @Test
    public void testFindByUsernameLike01() {
        UserDO user = userRepository.findByUsernameLike01("yu");
        System.out.println(user);
    }
}
