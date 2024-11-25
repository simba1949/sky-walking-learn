package vip.openpark.spring.cloud.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author anthony
 * @version 2024/11/16
 * @since 2024/11/16 9:11
 */
@FeignClient(name = "spring-cloud-app-tracing-provider")
public interface IHelloService {
	@GetMapping(path = "/hello")
	String hello(@RequestParam(name = "name", required = false) String name);
}