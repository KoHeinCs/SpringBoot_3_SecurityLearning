package com.ashwetaw.springframeworksecuritylearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){
        Authentication authenticationReq = UsernamePasswordAuthenticationToken.unauthenticated(loginRequest.username(),loginRequest.password());
        Authentication authenticationResp = this.authenticationManager.authenticate(authenticationReq);

        return "Hello Spring Security 3";
    }

    public record LoginRequest(String username,String password){

    }
}
