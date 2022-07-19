package com.icho.project.bean;

import com.icho.multiDatasource.dynamicdatasource.MultiDataSourceHolder;

/**
 * @Author: icho
 * @Date: 2022/6/30 17:55
 * @Describe:
 */
public class BaseDomin {
    private String tableSuffix;

    public String getTableSuffix() {
        this.tableSuffix = MultiDataSourceHolder.getTableIndex();
        return tableSuffix;
    }

    public void setTableSuffix(String tableSuffix) {
        this.tableSuffix = tableSuffix;
    }
}
