package com.deepak.youtube.Springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllertwo {

    @GetMapping("/user")
    public UserDto getUser() {
        return new UserDto("Deepak", 22);
    }
}
