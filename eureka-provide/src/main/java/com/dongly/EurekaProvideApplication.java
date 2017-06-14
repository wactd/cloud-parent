package com.dongly;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProvideApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaProvideApplication.class).web(true).run(args);
    }
}
