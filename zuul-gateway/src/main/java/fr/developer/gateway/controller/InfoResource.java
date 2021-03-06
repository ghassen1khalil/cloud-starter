package fr.developer.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("info/")
public class InfoResource {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/appname")
    public String getAppName(){
        return appName;
    }
}
