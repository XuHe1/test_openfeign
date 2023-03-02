package top.lovezhangli.consumer.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "svc-provider")
public interface HelloClient {

    @GetMapping("/hello")
    String sayHello();

    @GetMapping("/helloSb")
    String sayHelloSb(String sb);
}
