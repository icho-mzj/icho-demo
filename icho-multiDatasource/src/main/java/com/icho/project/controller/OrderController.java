package com.icho.project.controller;

import com.icho.multiDatasource.annotation.Router;
import com.icho.project.bean.Order;
import com.icho.project.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: icho
 * @Date: 2022/6/30 17:53
 * @Describe:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;

    @RequestMapping("/save")
    @Router
    public Order insertOrder(Order order) {
        orderService.insertOrder(order);
        return order;
    }
}
