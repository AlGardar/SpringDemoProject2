package org.gardar.demoproject2.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
@Getter
@Setter
public class LoggedUserManagerService {
    private String username;

}
