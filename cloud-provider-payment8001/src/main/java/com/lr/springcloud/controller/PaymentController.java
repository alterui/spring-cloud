package com.lr.springcloud.controller;

import com.lr.springcloud.entities.CommonResult;
import com.lr.springcloud.entities.Payment;
import com.lr.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * payment的
 * @author liurui
 * @date 2020/3/30 6:16 下午
 */
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        System.out.println(id);
        Payment payment = paymentService.getPaymentById(id);

        return new CommonResult<>(200, "获取payment成功", payment);
    }

    @GetMapping("/hi")
    public String get() {

        return "hello123";
    }

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(Payment payment) {
        Integer integer = paymentService.create(payment);
        return new CommonResult<>(200, "插入payment成功", integer);

    }
}
