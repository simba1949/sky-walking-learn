package vip.openpark.dubbo.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vip.openpark.dubbo.facade.IHelloService;

/**
 * @author anthony
 * @version 2024/11/15
 * @since 2024/11/15 12:37
 */
@Slf4j
@RestController
public class HelloController {
	@DubboReference
	private IHelloService helloService;

	@GetMapping("hello")
	public String hello(@RequestParam(value = "name", required = false) String name) {
		log.info("[dubbo consumer]: hello {}", name);
		return helloService.hello(name);
	}
}