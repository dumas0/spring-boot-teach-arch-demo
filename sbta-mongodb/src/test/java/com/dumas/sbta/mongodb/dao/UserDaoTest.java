package com.dumas.sbta.mongodb.dao;

import com.dumas.sbta.mongodb.MongoDBApplication;
import com.dumas.sbta.mongodb.dataobject.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * @author dumas
 * @date 2022/04/27 4:39 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongoDBApplication.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testInsert() {
        // 创建 UserDO 对象
        UserDO user = new UserDO();
        // 这里先临时写死一个 ID 编号，后面演示自增 ID 的时候，在修改这块
        user.setId(1);
        user.setUsername("dumas");
        user.setPassword("dumas");
        user.setCreateTime(LocalDate.now());
        // 创建 Profile 对象
        UserDO.Profile profile = new UserDO.Profile();
        profile.setNickname("芋道源码");
        profile.setGender(1);
        user.setProfile(profile);
        // 存储到 DB
        userDao.insert(user);
    }

    @Test
    public void testUpdate() {
        // 创建 UserDO 对象
        UserDO updateUser = new UserDO();
        updateUser.setId(1);
        updateUser.setUsername("dumas");
        // 执行更新
        userDao.updateById(updateUser);
    }

    @Test
    public void testDelete() {
        userDao.deleteById(1);
    }

    @Test
    public void testSelectById() {
        UserDO userDO = userDao.findById(1);
        System.out.println(userDO);
    }

    @Test
    public void testSelectByIds() {
        List<UserDO> users = userDao.findAllById(Arrays.asList(1, 4));
        users.forEach(System.out::println);
    }
}
