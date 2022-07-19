package com.icho.project.bean;

import lombok.Data;

/**
 * @Author: icho
 * @Date: 2022/6/30 17:54
 * @Describe:
 */
@Data
public class Order {
    private Long orderId;
    private String userId;
    private double money;
}
