package vip.openpark.single.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthony
 * @version 2024/11/13
 * @since 2024/11/13 22:00
 */
@Slf4j
@RestController
@RequestMapping
public class HelloController {

	@GetMapping("hello")
	public String sayHello(@RequestParam(value = "name", required = false) String name) {
		log.info("hello " + name);
		return "hello " + name;
	}
}