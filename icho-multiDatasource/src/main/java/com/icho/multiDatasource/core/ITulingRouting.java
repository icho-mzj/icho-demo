package com.icho.multiDatasource.core;

import com.icho.multiDatasource.exception.FormatTableSuffixException;
import com.icho.multiDatasource.exception.LoadRoutingStategyUnMatch;
import com.icho.multiDatasource.exception.RoutingFiledArgsIsNull;


/**
 * 路由接口
 * Created by smlz on 2019/4/16.
 */
public interface ITulingRouting {

    /**
     * 根据规则计算出
     * @param routingFiled
     * @return
     */
    String calDataSourceKey(String routingFiled) throws LoadRoutingStategyUnMatch, RoutingFiledArgsIsNull;


    /**
     * 计算routingFiled字段的 hashcode值
     * @param routingFiled
     * @return
     */
    Integer getRoutingFileHashCode(String routingFiled);

    /**
     * 计算一个库所在表的索引值
     * @param routingFiled
     * @return
     */
    String calTableKey(String routingFiled) throws LoadRoutingStategyUnMatch,RoutingFiledArgsIsNull;

    String getFormatTableSuffix(Integer tableIndex) throws FormatTableSuffixException;
}
