package com.brynk.assignment.brynk_cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/api/heading")
@CrossOrigin(origins = "*")
public class HeadingController {

    @Autowired
    private HeadingRepository headingRepository;

    // Create default heading if DB is empty
    @PostConstruct
    public void initHeading() {
        if (headingRepository.count() == 0) {
            Heading heading = new Heading();
            heading.setText("Welcome to Brynk CMS!");
            headingRepository.save(heading);
        }
    }

    // GET current heading
    @GetMapping
    public Heading getHeading() {
        List<Heading> headings = headingRepository.findAll();
        return headings.isEmpty() ? null : headings.get(0);
    }

    // POST new or update heading
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

    // ✅ New: Init heading manually
    @PostMapping("/init")
    public String manualInit() {
        if (headingRepository.count() == 0) {
            Heading heading = new Heading();
            heading.setText("Welcome to Brynk CMS!");
            headingRepository.save(heading);
            return "✅ Default heading created!";
        } else {
            return "ℹ️ Heading already exists.";
        }
    }
}
