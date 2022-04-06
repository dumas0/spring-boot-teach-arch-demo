package com.dumas.sbta.rabbitmq.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/06 15:57
 */
@Data
public class Book implements Serializable {
    private static final long serialVersionUID = -5110868219439676443L;
    private String id;
    private String name;
}
