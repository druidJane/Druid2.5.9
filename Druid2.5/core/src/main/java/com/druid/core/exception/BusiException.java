package com.druid.core.exception;

/**
 * Created by druid on 28/11/16.
 */
public class BusiException extends BaseException{

    private static final long serialVersionUID = 3593939479612993447L;

    public BusiException() {
    }

    public BusiException(Throwable throwable) {
        super(throwable);
    }

    public BusiException(String msg) {
        super(msg);
    }

    public BusiException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

}
