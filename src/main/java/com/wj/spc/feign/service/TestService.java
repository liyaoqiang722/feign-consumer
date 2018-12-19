package com.wj.spc.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service-curly-umbrella") //（1）指定服务为名绑定服务（服务为名不区分大小写）
public interface TestService {

    @RequestMapping("/test/test04") //（2）再使用springMVC注解绑定该服务提供的REST接口
    String test01();

}
