package top.lovezhangli.provider.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() throws InterruptedException {
        Thread.sleep(1000l);
        return "hello";
    }

    @GetMapping("/helloSb")
    public String sayHelloSb(String sb) throws InterruptedException {
        Thread.sleep(1000l);
        return "hello " + sb;
    }

}
