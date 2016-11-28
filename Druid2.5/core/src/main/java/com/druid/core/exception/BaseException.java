package com.druid.core.exception;

/**
 * Created by druid on 28/11/16.
 */
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 3972850046675346941L;

    public BaseException() {
    }

    public BaseException(Throwable throwable) {
        super(throwable);
    }

    public BaseException(String msg) {
        super(msg);
    }

    public BaseException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
