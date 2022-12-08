package ru.kata.spring.boot_security.demo.controllers;

/**
 * Created in IntelliJ
 * User: e-davidenko
 * Date: 08.12.2022
 * Time: 12:54
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping
    public String adminPage() {
        return "admin";
    }
}
