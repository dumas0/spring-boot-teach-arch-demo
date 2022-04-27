package com.dumas.sbta.mongodb.repository;

import com.dumas.sbta.mongodb.dataobject.ProductDO;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author dumas
 * @date 2022/04/27 4:54 PM
 */
public interface ProductRepository extends MongoRepository<ProductDO, Integer> {

}
