package com.dumas.sbta.mongodb.mongo;

import org.springframework.data.annotation.Id;

/**
 * 自增主键实体
 *
 * @author dumas
 * @date 2022/04/27 4:50 PM
 */
public abstract class IncIdEntity<T extends Number> {
    @Id
    private T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
