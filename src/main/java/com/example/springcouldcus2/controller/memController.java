package com.example.springcouldcus2.controller;


import com.example.springcouldcus2.service.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class memController {
    @Autowired
    private OrderFeign orderFeign;

    @RequestMapping("/memTest")
    public String memTest(){
        String str = orderFeign.orderTest();
        return str;
    }
}
