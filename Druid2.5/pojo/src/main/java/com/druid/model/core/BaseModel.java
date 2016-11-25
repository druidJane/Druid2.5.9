package com.druid.model.core;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * Created by 1115 on 2016/11/25.
 */
public abstract class BaseModel  implements Serializable {
    private static final long serialVersionUID = 8355306973460642850L;
    private transient SQLMapMeta sqlMapMeta;

    public BaseModel() {
    }
    public abstract String toString();
}
