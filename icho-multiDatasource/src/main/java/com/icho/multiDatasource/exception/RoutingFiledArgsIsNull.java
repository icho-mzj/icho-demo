package com.icho.multiDatasource.exception;

import com.icho.multiDatasource.enumuration.MultiDsErrorEnum;
import lombok.Data;

/**
 * 路由key 为空异常
 * Created by smlz on 2019/4/16.
 */
@Data
public class RoutingFiledArgsIsNull extends TulingMultiDsError {

    public RoutingFiledArgsIsNull(MultiDsErrorEnum multiDsErrorEnum) {
        super();
        setErrorCode(multiDsErrorEnum.ROUTINGFIELD_ARGS_ISNULL.getCode());
        setErrorMsg(multiDsErrorEnum.ROUTINGFIELD_ARGS_ISNULL.getMsg());

    }
}
