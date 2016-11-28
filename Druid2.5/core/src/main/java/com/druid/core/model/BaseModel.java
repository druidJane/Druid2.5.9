package com.druid.core.model;

import com.druid.core.exception.BusiException;

import java.io.Serializable;

/**
 * Created by 1115 on 2016/11/25.
 */
public abstract class BaseModel  implements Serializable {
    private static final long serialVersionUID = 8355306973460642850L;
    private transient SQLMapMeta sqlMapMeta;

    public BaseModel() {
    }
    public SQLMapMeta sqlMapMeta() {
        if (this.sqlMapMeta == null) {
            this.sqlMapMeta = new SQLMapMeta();
        }
        return this.sqlMapMeta;
    }
    public abstract String toString();

    public abstract String getTableName() throws BusiException;
}
