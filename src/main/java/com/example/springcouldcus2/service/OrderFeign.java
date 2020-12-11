package com.example.springcouldcus2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("order-server")
public interface OrderFeign {

    @RequestMapping("/orderTest")
    public String orderTest();

}
