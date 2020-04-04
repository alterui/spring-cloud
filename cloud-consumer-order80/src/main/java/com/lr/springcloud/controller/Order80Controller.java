package com.lr.springcloud.controller;

import com.lr.springcloud.entities.CommonResult;
import com.lr.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
 * @author liurui
 * @date 2020/4/4 16:54
 */
@RestController
@RequestMapping("/order/")
public class Order80Controller {

    @Resource
    private RestTemplate restTemplate;

    private static final String URL = "http://localhost:8001/";

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
       return restTemplate.getForObject(URL + "payment/" + id, CommonResult.class);

    }

    @GetMapping("/payment/create")
    public CommonResult createPayment(Payment payment) {
        return restTemplate.postForObject(URL + "payment/create", payment, CommonResult.class);
    }
}
