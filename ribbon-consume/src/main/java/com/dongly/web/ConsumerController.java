package com.dongly.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tiger on 17-6-14.
 */

@RestController
public class ConsumerController {

    private ComputeService computeService;

    @Autowired
    public ConsumerController(ComputeService computeService) {
        this.computeService = computeService;
    }


    @GetMapping(value = "/add")
    public String add() {

        return computeService.addService();
    }

}
