package com.security.example.springbootsecurityjwt.controller;

import com.security.example.springbootsecurityjwt.model.JwtUser;
import com.security.example.springbootsecurityjwt.security.JwtTokenGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {


    @Autowired
    private JwtTokenGenerator jwtTokenGenerator;

    @PostMapping
    public String generate(@RequestBody JwtUser jwtUser){

        return jwtTokenGenerator.generate(jwtUser);

    }
}
