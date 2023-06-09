package com.globaroman.auxilium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String getLoginPageMain() {
        return "form_sussesfull";
    }

    @GetMapping("/success")
    public String getLoginPageSuccess() {
        return "form_sussesfull";
    }
}
