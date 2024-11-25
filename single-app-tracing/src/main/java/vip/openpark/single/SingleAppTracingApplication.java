package vip.openpark.single;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 官方参考链接：<a href="https://skywalking.apache.org/docs/skywalking-java/next/en/setup/service-agent/java-agent/readme/">...</a>
 * 启动参数中加入以下参数：
-javaagent:C:\Users\nexa\Desktop\sky-walking\skywalking-agent\skywalking-agent.jar
-DSW_AGENT_NAME=single-app-tracing
-DSW_AGENT_COLLECTOR_BACKEND_SERVICES=192.168.0.122:11800
 *
 * @author anthony
 * @version 2024/11/13
 * @since 2024/11/13 21:59
 */
@SpringBootApplication
public class SingleAppTracingApplication {
	public static void main(String[] args) {
		SpringApplication.run(SingleAppTracingApplication.class, args);
	}
}