package com.brynk.assignment.brynk_cms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "✅ Brynk CMS Backend is Up!";
    }
}
