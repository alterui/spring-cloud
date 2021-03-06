package com.lr.springcloud.controller;

import com.lr.springcloud.entities.CommonResult;
import com.lr.springcloud.entities.Payment;
import com.lr.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        //System.out.println(id);
        Payment payment = paymentService.getPaymentById(id);

        return new CommonResult<>(200, "获取payment成功,port:"+port, payment);
    }

    @GetMapping("/hi")
    public String get() {

        return "hello123";
    }

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        Integer integer = paymentService.create(payment);
        return new CommonResult<>(200, "插入payment成功", integer);

    }
}
