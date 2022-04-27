package com.dumas.sbta.mongodb.repository;

import com.dumas.sbta.mongodb.dataobject.UserDO;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 常规查询，继承 CRUD 操作
 *
 * @author dumas
 * @date 2022/04/27 2:59 PM
 */
public interface UserRepository extends MongoRepository<UserDO, Integer> {

}
