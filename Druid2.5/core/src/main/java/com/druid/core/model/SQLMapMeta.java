package com.druid.core.model;

import java.io.Serializable;

/**
 * Created by 1115 on 2016/11/25.
 */
public class SQLMapMeta implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean clearPropertiesWhenCriteria;
    private String findSQLName;
    private String deleteSQLName;
    private String insertSQLName;
    private String updateSQLName;
    private String querySQLName;
    private String queryCountSQLName;
    private String findSQLId;
    private String deleteSQLId;
    private String insertSQLId;
    private String updateSQLId;
    private String querySQLId;
    private String queryCountSQLId;

    public SQLMapMeta() {
        this.clearPropertiesWhenCriteria = false;

        this.findSQLName = "findObj";

        this.deleteSQLName = "deleteObj";

        this.insertSQLName = "addObj";

        this.updateSQLName = "updateObj";

        this.querySQLName = "queryObj";

        this.queryCountSQLName = "queryCount";
    }

    public boolean isClearPropertiesWhenCriteria() {
        return this.clearPropertiesWhenCriteria;
    }

    public void setClearPropertiesWhenCriteria(boolean clearPropertiesWhenCriteria) {
        this.clearPropertiesWhenCriteria = clearPropertiesWhenCriteria;
    }

    public String getFindSQLName() {
        return this.findSQLName;
    }

    public void setFindSQLName(String findSQLName) {
        this.findSQLName = findSQLName;
    }

    public String getDeleteSQLName() {
        return this.deleteSQLName;
    }

    public void setDeleteSQLName(String deleteSQLName) {
        this.deleteSQLName = deleteSQLName;
    }

    public String getInsertSQLName() {
        return this.insertSQLName;
    }

    public void setInsertSQLName(String insertSQLName) {
        this.insertSQLName = insertSQLName;
    }

    public String getUpdateSQLName() {
        return this.updateSQLName;
    }

    public void setUpdateSQLName(String updateSQLName) {
        this.updateSQLName = updateSQLName;
    }

    public String getQuerySQLName() {
        return this.querySQLName;
    }

    public void setQuerySQLName(String querySQLName) {
        this.querySQLName = querySQLName;
    }

    public String getQueryCountSQLName() {
        return this.queryCountSQLName;
    }

    public void setQueryCountSQLName(String queryCountSQLName) {
        this.queryCountSQLName = queryCountSQLName;
    }

    public String getFindSQLId() {
        return this.findSQLId;
    }

    public void setFindSQLId(String findSQLId) {
        this.findSQLId = findSQLId;
    }

    public String getDeleteSQLId() {
        return this.deleteSQLId;
    }

    public void setDeleteSQLId(String deleteSQLId) {
        this.deleteSQLId = deleteSQLId;
    }

    public String getInsertSQLId() {
        return this.insertSQLId;
    }

    public void setInsertSQLId(String insertSQLId) {
        this.insertSQLId = insertSQLId;
    }

    public String getUpdateSQLId() {
        return this.updateSQLId;
    }

    public void setUpdateSQLId(String updateSQLId) {
        this.updateSQLId = updateSQLId;
    }

    public String getQuerySQLId() {
        return this.querySQLId;
    }

    public void setQuerySQLId(String querySQLId) {
        this.querySQLId = querySQLId;
    }

    public String getQueryCountSQLId() {
        return this.queryCountSQLId;
    }

    public void setQueryCountSQLId(String queryCountSQLId) {
        this.queryCountSQLId = queryCountSQLId;
    }
}