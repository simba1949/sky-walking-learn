package vip.openpark.sky.walking.custom.trace.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.skywalking.apm.toolkit.trace.Tag;
import org.apache.skywalking.apm.toolkit.trace.Trace;
import org.apache.skywalking.apm.toolkit.trace.TraceContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author anthony
 * @version 2024/11/25
 * @since 2024/11/25 13:58
 */
@Slf4j
@RestController
@RequestMapping
public class HelloController {

	@GetMapping("hello")
	public String sayHello(@RequestParam(value = "name", required = false) String name) {
		log.info("hello {}", name);

		// 获取当前链路追踪的traceId
		String traceId = TraceContext.traceId();
		log.info("traceId:{}", traceId);
		// 向上下文对象中绑定key/value数据
		TraceContext.putCorrelation("name", name);

		// 查询用户信息
		log.info("[链路追踪][查询用户]");
		String userInfo = getUser(name);

		// 查找用户订单信息
		log.info("[链路追踪][查询订单]");
		List<String> orders = listOrders(userInfo);

		return "hello " + name;
	}

	@Tag(key = "name", value = "arg[0]")
	@Trace(operationName = "获取用户名称")
	private String getUser(String name) {
		log.info("fetch user info, name:{}", name);
		return name;
	}

	@Tag(key = "listOrders", value = "returnedObj")
	@Trace(operationName = "获取用户订单")
	private List<String> listOrders(String userInfo) {
		log.info("fetch user orders, userinfo:{}", userInfo);
		return Stream.iterate(0, i -> i + 1).limit(2).map(ele -> "order-" + ele).toList();
	}
}