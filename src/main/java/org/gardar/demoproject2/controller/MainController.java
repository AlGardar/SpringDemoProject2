package org.gardar.demoproject2.controller;

import org.gardar.demoproject2.service.LoggedUserManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private final LoggedUserManagerService loggedUserManagerService;

    public MainController(LoggedUserManagerService loggedUserManagerService) {
        this.loggedUserManagerService = loggedUserManagerService;
    }

    @GetMapping("/main")
    public String home(@RequestParam(required = false) String logout, Model model) {
        if (logout != null) {
            loggedUserManagerService.setUsername(null);
        }

        String username = loggedUserManagerService.getUsername();
        if (username == null) {
            return "redirect:/";
        }
        model.addAttribute("username", username);
        return "main.html";
    }
}

