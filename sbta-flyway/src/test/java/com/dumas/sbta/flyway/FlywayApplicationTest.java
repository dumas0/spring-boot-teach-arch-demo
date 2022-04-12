package com.dumas.sbta.flyway;

import com.dumas.sbta.flyway.entity.User;
import com.dumas.sbta.flyway.service.UserService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/12 11:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FlywayApplication.class)
public class FlywayApplicationTest {

    @Autowired
    private UserService userSerivce;

    @Test
    public void test() throws Exception {
        userSerivce.deleteAllUsers();

        // 插入5个用户
        userSerivce.create("Tom", 10);
        userSerivce.create("Mike", 11);
        userSerivce.create("Didispace", 30);
        userSerivce.create("Oscar", 21);
        userSerivce.create("Linda", 17);

        // 查询名为Oscar的用户，判断年龄是否匹配
        List<User> userList = userSerivce.getByName("Oscar");
        Assertions.assertEquals(21, userList.get(0).getAge().intValue());

        // 查数据库，应该有5个用户
        Assertions.assertEquals(5, userSerivce.getAllUsers());

        // 删除两个用户
        userSerivce.deleteByName("Tom");
        userSerivce.deleteByName("Mike");

        // 查数据库，应该有5个用户
        Assertions.assertEquals(3, userSerivce.getAllUsers());
    }

}
