package com.dumas.sbta.validate.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/10 14:26
 */
@Data
public class Book {
    private Integer id;
    @NotBlank(message = "name 不允许为空", groups = Groups.Update.class)
    @Length(min = 2, max = 10, message = "name 长度必须在 {min} - {max} 之间")
    private String name;
    @NotNull(message = "price 不允许为空", groups = Groups.Default.class)
    @DecimalMin(value = "0.1", message = "价格不能低于 {value}", groups = Groups.Default.class)
    private BigDecimal price;
}
