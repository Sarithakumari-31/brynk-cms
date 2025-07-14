package com.brynk.assignment.brynk_cms;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HeadingRepository extends JpaRepository<Heading, Long> {
    // No extra methods needed for basic CRUD
}
