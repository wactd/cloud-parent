package com.dongly;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 启动一个服务注册中心
@EnableEurekaServer
@SpringBootApplication
public class EurekaRegisterApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaRegisterApplication.class).web(true).run(args);
	}
}
