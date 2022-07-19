package com.icho.project.service;

import com.icho.project.bean.Order;
import com.icho.project.dao.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: icho
 * @Date: 2022/6/30 17:56
 * @Describe:
 */
@Service
public class OrderServiceImpl {
    @Autowired
    private OrderMapper orderMapper;

    public void insertOrder(Order order){
        orderMapper.insertOrder(order);
    }
}
