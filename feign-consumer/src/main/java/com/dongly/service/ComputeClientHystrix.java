package com.dongly.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tiger on 17-6-15.
 */

@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a,
                       @RequestParam(value = "b") Integer b) {
        return -9999;
    }


}
