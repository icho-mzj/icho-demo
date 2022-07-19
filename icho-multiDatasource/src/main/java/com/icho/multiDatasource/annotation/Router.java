package com.icho.multiDatasource.annotation;

import com.icho.multiDatasource.constant.TulingConstant;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: icho
 * @Date: 2022/6/30 17:53
 * @Describe:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Router {
    String routingFiled() default TulingConstant.DEFAULT_ROUTING_FIELD;
}
