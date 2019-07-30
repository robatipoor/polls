package org.robatipoor.polls.controller;

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
}