package org.robatipoor.polls.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
public class UserController {

    @GetMapping("/index")
    public String index() {
        return "Hello Spring World !!!";
    }
    @GetMapping("/user")
    public String user(Principal principal) {
        return "Hello " + principal.getName();
    }
}