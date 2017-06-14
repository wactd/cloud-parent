package com.dongly.web;

import com.dongly.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tiger on 17-6-14.
 */

@RestController
public class ConsumerController {

    private ComputeClient computeClient;

    @Autowired
    public ConsumerController(ComputeClient computeClient) {
        this.computeClient = computeClient;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(11, 20);
    }
}
