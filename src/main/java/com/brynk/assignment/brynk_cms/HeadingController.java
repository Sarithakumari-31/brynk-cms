package com.brynk.assignment.brynk_cms;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/api/heading")
@CrossOrigin(origins = "*") // Allow frontend access from any origin
public class HeadingController {

    @Autowired
    private HeadingRepository headingRepository;

    // ✅ Create a default heading if none exists (important for Railway/H2)
    @PostConstruct
    public void initHeading() {
        if (headingRepository.count() == 0) {
            Heading heading = new Heading();
            heading.setText("Welcome to Brynk CMS!");
            headingRepository.save(heading);
        }
    }

    // ✅ Fetch current heading
    @GetMapping
    public Heading getHeading() {
        List<Heading> headings = headingRepository.findAll();
        return headings.isEmpty() ? null : headings.get(0);
    }

    // ✅ Update heading
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
