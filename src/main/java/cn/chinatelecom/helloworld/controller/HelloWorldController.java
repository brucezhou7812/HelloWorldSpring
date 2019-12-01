package cn.chinatelecom.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "Hello Spring boot and Jenkins.";
    }
}
