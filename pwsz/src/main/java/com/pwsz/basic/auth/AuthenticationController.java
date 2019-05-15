package com.pwsz.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AuthenticationController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean authenticationBean() {
        return new AuthenticationBean("You are authenticated");
    }

}
