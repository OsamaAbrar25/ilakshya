package com.ilakshya.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("students")
public class StudentProfileController {

    @Autowired
    private StudentProfileService studentProfileService;

    @RequestMapping("/profiles")
    public List<StudentProfile> getProfiles() {
        return studentProfileService.getProfiles();
    }

    @RequestMapping("profiles/{id}")
    public Optional<StudentProfile> getProfile(@PathVariable String id) {
        return studentProfileService.getProfile(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/profiles")
    public void addProfile(@RequestBody StudentProfile studentProfile) {
        studentProfileService.addProfile(studentProfile);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/profiles/{id}")
    public void deleteProfile(@PathVariable String id) {
        studentProfileService.deleteProfile(id);
    }
}
