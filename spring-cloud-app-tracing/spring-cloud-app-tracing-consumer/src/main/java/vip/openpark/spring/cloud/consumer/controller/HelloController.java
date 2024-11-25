package vip.openpark.spring.cloud.consumer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vip.openpark.spring.cloud.facade.IHelloService;

/**
 * @author anthony
 * @version 2024/11/16
 * @since 2024/11/16 9:24
 */
@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HelloController {
	private final IHelloService helloService;

	@GetMapping("hello")
	public String hello(@RequestParam(value = "name", required = false) String name) {
		log.info("[spring cloud consumer]: hello {}", name);
		return helloService.hello(name);
	}
}