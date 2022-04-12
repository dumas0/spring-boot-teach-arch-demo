package com.dumas.sbta.flyway.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/12 11:13
 */
@Data
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
    private Integer age;
}
