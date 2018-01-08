package com.nmm.study.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "sleuthone",url = "http://localhost:8888")
public interface SleuthService {
    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable(name = "name")String name);
}
