package com.lr.springcloud.service;

import com.lr.springcloud.entities.Payment;

/**
 * @author liurui
 * @date 2020/3/30 6:13 下午
 */
public interface PaymentService {
    /**
     * 插入一个payment
     * @param payment
     * @return
     */
    Integer create(Payment payment);

    /**
     * 根据id获取一个payment
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
