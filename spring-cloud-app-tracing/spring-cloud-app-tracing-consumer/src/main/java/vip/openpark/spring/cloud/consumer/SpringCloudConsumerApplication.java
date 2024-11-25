package vip.openpark.spring.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author anthony
 * @version 2024/11/16
 * @since 2024/11/16 9:16
 */
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "vip.openpark.spring.cloud.facade")
@SpringBootApplication
public class SpringCloudConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerApplication.class, args);
	}
}