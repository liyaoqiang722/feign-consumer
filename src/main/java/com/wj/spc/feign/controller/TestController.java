package com.wj.spc.feign.controller;

import com.wj.spc.feign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "test01",
                    method = RequestMethod.GET)
    public String test01(){
        return testService.test01();
    }

}
