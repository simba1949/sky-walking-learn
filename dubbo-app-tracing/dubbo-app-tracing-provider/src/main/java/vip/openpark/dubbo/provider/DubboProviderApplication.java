package vip.openpark.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author anthony
 * @version 2024/11/15
 * @since 2024/11/15 12:34
 */
@EnableDubbo
@SpringBootApplication
public class DubboProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
	}
}