package com.dumas.sbta.localdatetime.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author dumas
 * @desc TODO 方案二:@JsonFormat
 * @date 2022/04/10 22:50
 */
@Data
public class Order {
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime payTime;
}
