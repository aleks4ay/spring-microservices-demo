package org.aleks4ay.micro.demo.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class Controller {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/test")
    public String test() {
        return "test eureka-client" + System.lineSeparator() + "instance Id: " + instanceId;
    }
}