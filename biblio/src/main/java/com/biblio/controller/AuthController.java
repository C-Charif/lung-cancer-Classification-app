package com.biblio.controller;

import com.biblio.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String username,
                              @RequestParam String password,
                              Model model) {
        if (authService.login(username, password)) {
            return "redirect:/dashboard";
        } else {
            model.addAttribute("error", "Identifiants incorrects !");
            return "login";
        }
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/login";
    }
}