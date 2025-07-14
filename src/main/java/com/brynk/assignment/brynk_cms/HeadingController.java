package com.example.brynkcms.controller;

import com.example.brynkcms.model.Heading;
import com.example.brynkcms.repository.HeadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/api/heading")
@CrossOrigin(origins = "*") // Allow frontend to access
public class HeadingController {

    @Autowired
    private HeadingRepository headingRepository;

    // ✅ This runs once after startup
    @PostConstruct
    public void initHeading() {
        if (headingRepository.count() == 0) {
            Heading defaultHeading = new Heading();
            defaultHeading.setText("Welcome to Brynk CMS!");
            headingRepository.save(defaultHeading);
        }
    }

    @GetMapping
    public Heading getHeading() {
        List<Heading> headings = headingRepository.findAll();
        return headings.isEmpty() ? null : headings.get(0);
    }

    @PostMapping
    public Heading updateHeading(@RequestBody Heading updatedHeading) {
        List<Heading> headings = headingRepository.findAll();
        Heading heading;

        if (headings.isEmpty()) {
            heading = new Heading();
        } else {
            heading = headings.get(0);
        }

        heading.setText(updatedHeading.getText());
        return headingRepository.save(heading);
    }
}
