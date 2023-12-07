package com.dailycodebuffer.springbootdemo.controller;

import com.dailycodebuffer.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }

    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("Hanife");
        user.setEmailId("hangmail.com");

        return user;
    }

    @GetMapping("{id}/{id2}")
    public String pathVariable(@PathVariable String id,
                               @PathVariable("id2") String name) {
        return "The pathvariable is:" + id+":"+ name;
    }

    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name,
                                @RequestParam(name="email", required = false) String emailId
    ) {
        return "your name is : " + name + " and EmailId is :" + emailId;
    }
}
