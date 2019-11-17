package com.example.sentineldemo.controller;


import com.example.sentineldemo.service.DemoService;
import com.example.sentineldemo.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/test1")
    public Response test1() {
        demoService.test1();
        return Response.setSuccess("success");
    }

    @RequestMapping("/test2")
    public Response test2(String id) {
        String userName = demoService.test2(id);
        return Response.setSuccess(userName);
    }

    @RequestMapping("/test3")
    public Response test3(String id) {
        String userName = demoService.test3(id);
        return Response.setSuccess(userName);
    }
}
