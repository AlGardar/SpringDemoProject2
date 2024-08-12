package org.gardar.demoproject2.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@Getter
@Setter
public class LoginProcessor {
    private final LoggedUserManagerService loggedUserManagerService;
    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagerService loggedUserManagerService) {
        this.loggedUserManagerService = loggedUserManagerService;
    }

    public boolean login() {

        String username = this.getUsername();
        String password = this.getPassword();

        if ("Alex".equals(username) && "pass".equals(password)) {
            loggedUserManagerService.setUsername(username);
            return true;
        } else {
            return false;
        }
    }
}
