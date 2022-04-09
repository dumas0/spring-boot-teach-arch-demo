package com.dumas.sbta.exception.handler.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/09 11:40
 */
@Getter
@Setter
@NoArgsConstructor
public class ErrorResponseEntity {
    private int code;
    private String message;

    public ErrorResponseEntity(int code, String message) {
        this.message = message;
        this.code = code;
    }
}
