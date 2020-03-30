package com.lr.springcloud.dao;

import com.lr.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liurui
 * @date 2020/3/30 5:57 下午
 */
@Mapper
public interface PaymentDao {

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
