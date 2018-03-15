package com.lanmao.data.sync.server.exception;

/**
 * @author hui.zhou 9:20 2018/3/9
 */
public class SaveJobException extends RuntimeException {
    private String message;

    public SaveJobException(Exception e, String message) {
        super(e);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
