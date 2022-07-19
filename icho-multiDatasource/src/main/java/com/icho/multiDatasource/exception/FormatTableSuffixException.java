package com.icho.multiDatasource.exception;


import com.icho.multiDatasource.enumuration.MultiDsErrorEnum;

/**
 * 格式化表后缀名称异常
 * Created by smlz on 2019/4/18.
 */
public class FormatTableSuffixException extends TulingMultiDsError {

    public FormatTableSuffixException(MultiDsErrorEnum formatTableSuffixError) {
        super();
        setErrorCode(formatTableSuffixError.FORMAT_TABLE_SUFFIX_ERROR.getCode());
        setErrorMsg(formatTableSuffixError.FORMAT_TABLE_SUFFIX_ERROR.getMsg());

    }
}
