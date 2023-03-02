package top.lovezhangli.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lovezhangli.consumer.feign.HelloClient;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private HelloClient helloClient;
    @GetMapping("/test")
    public String test() {
        return helloClient.sayHello();
    }

    @GetMapping("/test1")
    public String test1() {
        return helloClient.sayHelloSb("Tom");
    }
}
