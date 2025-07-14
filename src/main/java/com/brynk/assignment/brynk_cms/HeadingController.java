package com.brynk.assignment.brynk_cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/heading")
@CrossOrigin(origins = "*")  // Allow all for local React testing
public class HeadingController {

    @Autowired
    private HeadingRepository headingRepository;

    @GetMapping
    public ResponseEntity<Heading> getHeading() {
        //Return default if not found
        return ResponseEntity.ok(
                headingRepository.findById(1L).orElse(new Heading("Default heading"))
        );
    }

    @PostMapping
    public ResponseEntity<String> saveHeading(@RequestBody Heading heading) {
        heading.setId(1L); // Always overwrite ID 1
        headingRepository.save(heading);
        return ResponseEntity.ok("Heading saved successfully!");
    }
}
