package com.dumas.sbta.mongodb.repository;

import com.dumas.sbta.mongodb.MongoDBApplication;
import com.dumas.sbta.mongodb.dataobject.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
public class UserRepository02Test {
    @Autowired
    private UserRepository02 userRepository;

    @Test
    public void testFindByName(){
        UserDO user = userRepository.findByUsername("dumas");
        System.out.println(user);
    }

    @Test
    public void testFindByNameLike(){
        // 创建排序条件
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        // 创建分页条件
        Pageable pageable = PageRequest.of(0, 10, sort);
        // 执行分页操作
        Page<UserDO> page = userRepository.findByUsernameLike("du", pageable);
        // 打印
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
    }
}
