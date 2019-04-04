package com.demo.eurekaclient3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test/")
public class TestController {

    /*@Autowired
    private DiscoveryClient client;*/

    @RequestMapping(value = "sayHello",method = RequestMethod.GET)
    public String testSayHello(){
        return "Hello Eureka-client3!";
    }
}
