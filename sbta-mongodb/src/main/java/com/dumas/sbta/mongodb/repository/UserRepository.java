package com.dumas.sbta.mongodb.repository;

import com.dumas.sbta.mongodb.dataobject.UserDO;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author dumas
 * @date 2022/04/27 2:59 PM
 */
public interface UserRepository extends MongoRepository<UserDO, Integer> {

}
