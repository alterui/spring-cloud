package com.lr.springcloud.service.impl;

import com.lr.springcloud.dao.PaymentDao;
import com.lr.springcloud.entities.Payment;
import com.lr.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * payment业务实现类
 * @author liurui
 * @date 2020/3/30 6:14 下午
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public Integer create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(@Param("id") Long id) {
        return paymentDao.getPaymentById(id);
    }
}
