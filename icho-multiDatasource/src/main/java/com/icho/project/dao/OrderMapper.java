package com.icho.project.dao;

import com.icho.project.bean.Order;
import org.springframework.stereotype.Repository;

/**
 * @Author: icho
 * @Date: 2022/6/30 17:57
 * @Describe:
 */
public interface OrderMapper {
    void insertOrder(Order order);
}
