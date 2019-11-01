package com.ilakshya.test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<StudentProfile, String> {
    StudentProfile findByUsername(String userName);
}
