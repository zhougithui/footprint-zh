package com.lanmao.data.sync.client.exception;

/**
 * @author hui.zhou 9:20 2018/3/9
 */
public class QueryJobException extends RuntimeException {
    private String message;

    public QueryJobException(Exception e, String message) {
        super(e);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
