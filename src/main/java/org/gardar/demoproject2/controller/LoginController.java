package org.gardar.demoproject2.controller;

import org.gardar.demoproject2.service.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/")
    public String getLoginPage() {
        return "login.html";
    }
    @PostMapping("/")
    public String getLoginPage(@RequestParam String username, @RequestParam String password, Model model) {
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean loggedIn = loginProcessor.login();
        if (loggedIn) {
            return "redirect:/main";
        } else {
            model.addAttribute("message", "Login failed");
        }
        return "login.html";
    }
}
