package vip.openpark.spring.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author anthony
 * @version 2024/11/16
 * @since 2024/11/16 9:17
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProviderApplication.class, args);
	}
}