/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.druid.core.model;

import java.io.Serializable;

public class BaseCriteria implements Serializable {
    private static final long serialVersionUID = 5846728647949913252L;
    private String paramName;
    private Object paramValue;
    private String arithmeticType;
    private String relationValue;

    public String getParamName() {
        return this.paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public Object getParamValue() {
        return this.paramValue;
    }

    public void setParamValue(Object paramValue) {
        this.paramValue = paramValue;
    }

    public String getArithmeticType() {
        return this.arithmeticType;
    }

    public void setArithmeticType(String arithmeticType) {
        this.arithmeticType = arithmeticType;
    }

    public String getRelationValue() {
        return this.relationValue;
    }

    public void setRelationValue(String relationValue) {
        this.relationValue = relationValue;
    }
}