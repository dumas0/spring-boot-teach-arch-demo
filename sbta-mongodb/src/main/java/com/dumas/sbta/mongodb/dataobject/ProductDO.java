package com.dumas.sbta.mongodb.dataobject;

import com.dumas.sbta.mongodb.mongo.IncIdEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author dumas
 * @date 2022/04/27 4:52 PM
 */
@Document(collection = "Product")
public class ProductDO extends IncIdEntity<Integer> {
    /**
     * 商品名
     */
    private String name;

    public String getName() {
        return name;
    }

    public ProductDO setName(String name) {
        this.name = name;
        return this;
    }
}
