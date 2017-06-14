package com.dongly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaService1Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaService1Application.class).web(true).run(args);
	}
}
