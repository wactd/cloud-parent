package com.dongly.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dongly on 2017/6/14.
 */

@RestController
public class ComputeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private DiscoveryClient discoveryClient;

    private Registration registration;

    @Autowired
    public ComputeController(DiscoveryClient discoveryClient, Registration registration) {
        this.discoveryClient = discoveryClient;
        this.registration = registration;
    }

    @GetMapping(value = "/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("★★★★★★★★★");
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        logger.info("/add, service_id:" + registration.getServiceId() + ", result:" + r);
        logger.info("★★★★★★★★★");
        return r;
    }

}
