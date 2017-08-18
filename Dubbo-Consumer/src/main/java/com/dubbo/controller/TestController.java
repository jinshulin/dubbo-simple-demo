package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试入口.
 *
 * @author jinshulin (jinshulin170503@credithc.com)
 * @version 0.0.1-SNAPSHOT
 * @since 2017年08月18日 10时07分
 */
@RestController
public class TestController {

    @Reference
    private HelloService helloService;

    @GetMapping(value = "add")
    @ResponseBody
    public String add() {
        return String.format("1 + 2 = %d", helloService.add(1, 2));
    }
}
