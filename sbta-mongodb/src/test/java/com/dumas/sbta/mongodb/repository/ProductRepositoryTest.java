package com.dumas.sbta.mongodb.repository;

import com.dumas.sbta.mongodb.MongoDBApplication;
import com.dumas.sbta.mongodb.dataobject.ProductDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author dumas
 * @date 2022/04/27 4:55 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongoDBApplication.class)
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testInsert() {
        // 创建 ProductDO 对象
        ProductDO product = new ProductDO();
        product.setName("dumas");
        // 插入
        productRepository.insert(product);
        // 打印 ID
        System.out.println(product.getId());
    }
}
