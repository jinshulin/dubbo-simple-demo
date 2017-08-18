package com.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * .
 *
 * @author jinshulin (jinshulin170503@credithc.com)
 * @version 0.0.1-SNAPSHOT
 * @since 2017年08月18日 10时01分
 */
@SpringBootApplication
@ImportResource("spring-dubbo.xml")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
