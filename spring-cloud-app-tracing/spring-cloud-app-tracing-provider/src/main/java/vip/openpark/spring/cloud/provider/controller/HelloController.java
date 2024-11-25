package vip.openpark.spring.cloud.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vip.openpark.spring.cloud.facade.IHelloService;

/**
 * @author anthony
 * @version 2024/11/16
 * @since 2024/11/16 9:21
 */
@Slf4j
@RestController
public class HelloController implements IHelloService {
	@Override
	public String hello(@RequestParam(name = "name", required = false) String name) {
		log.info("[spring cloud provider]: hello {}", name);
		return "hello " + name;
	}
}