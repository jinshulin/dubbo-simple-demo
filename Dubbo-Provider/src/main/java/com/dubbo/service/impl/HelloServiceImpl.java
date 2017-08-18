package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.HelloService;

/**
 * Dubbo对外暴露接口实现类.
 *
 * @author jinshulin (jinshulin170503@credithc.com)
 * @version 0.0.1-SNAPSHOT
 * @since 2017年08月18日 10时04分
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public Integer add(Integer a, Integer b) {
        System.out.println(String.format("收到了一个加法请求: %d + %d = ?", a, b));

        a = a == null ? 0 : a;
        b = b == null ? 0 : b;
        return a + b;
    }
}
