package com.druid.core.exception;

/**
 * Created by druid on 28/11/16.
 */
public class SystemException extends BaseException {
    private static final long serialVersionUID = -311741547568186052L;

    public SystemException() {
    }

    public SystemException(Throwable throwable) {
        super(throwable);
    }

    public SystemException(String msg) {
        super(msg);
    }

    public SystemException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}