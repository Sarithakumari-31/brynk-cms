package com.brynk.assignment.brynk_cms;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Heading {

    @Id
    private Long id = 1L;
    private String text;

    public Heading() {}

    public Heading(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = 1L; // Always ID = 1
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
