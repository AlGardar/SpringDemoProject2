package org.gardar.demoproject2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @PostMapping("/")
    public String getLoginPage() {
        return "login.html";
    }
}
