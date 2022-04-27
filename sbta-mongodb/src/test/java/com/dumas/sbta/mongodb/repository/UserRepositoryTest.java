package com.dumas.sbta.mongodb.repository;

import com.dumas.sbta.mongodb.MongoDBApplication;
import com.dumas.sbta.mongodb.dataobject.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

/**
 * @author dumas
 * @date 2022/04/27 4:07 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongoDBApplication.class)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testInsert() {
        UserDO userDO = new UserDO();
        userDO.setId(1);
        userDO.setUsername("dumas");
        userDO.setPassword("dumas");
        userDO.setCreateTime(LocalDate.now());
        UserDO.Profile profile = new UserDO.Profile();
        profile.setNickname("dumas");
        profile.setGender(1);
        userDO.setProfile(profile);
        userRepository.insert(userDO);
    }

    @Test
    public void testUpdate(){
        Optional<UserDO> userResult = userRepository.findById(1);
        Assert.isTrue(userResult.isPresent(), "用户一定要存在");
        UserDO updateUser = userResult.get();
        updateUser.setUsername("dumas.dz.ma");
        userRepository.save(updateUser);
    }

    @Test
    public void testDelete(){
        userRepository.deleteById(1);
    }

    @Test
    public void testSelectById(){
        Optional<UserDO> userDO = userRepository.findById(1);
        System.out.println(userDO.isPresent());
    }

    @Test
    public void testSelectByIds(){
        Iterable<UserDO> users = userRepository.findAllById(Arrays.asList(1, 4));
        users.forEach(System.out::println);
    }
}
