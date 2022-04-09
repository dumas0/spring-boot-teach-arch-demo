package com.dumas.sbta.exception.handler.exception;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/09 11:37
 */
public class CustomException extends RuntimeException {

    private static final long serialVersionUID = 1632293134214846865L;

    private int code;

    public CustomException() {
        super();
    }

    public CustomException(String message, int code) {
        super(message);
        this.setCode(code);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
