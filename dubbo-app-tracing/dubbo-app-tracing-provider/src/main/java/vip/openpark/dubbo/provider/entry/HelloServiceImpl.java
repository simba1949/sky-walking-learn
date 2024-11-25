package vip.openpark.dubbo.provider.entry;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import vip.openpark.dubbo.facade.IHelloService;

/**
 * @author anthony
 * @version 2024/11/15
 * @since 2024/11/15 12:34
 */
@Slf4j
@DubboService
public class HelloServiceImpl implements IHelloService {
	@Override
	public String hello(String name) {
		log.info("[dubbo provider]: hello {}", name);
		return "hello " + name;
	}
}