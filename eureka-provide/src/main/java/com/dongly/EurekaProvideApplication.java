package com.dongly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProvideApplication.class, args);
	}
}
