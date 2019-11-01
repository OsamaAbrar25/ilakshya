package com.ilakshya.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentProfileService {

    @Autowired
    StudentProfileRepository studentProfileRepository;

    @Autowired
    UserRepository userRepository;

    public List<StudentProfile> getProfiles() {
        List<StudentProfile> studentProfiles = new ArrayList<>();
        studentProfileRepository.findAll().forEach(studentProfiles::add);
        return studentProfiles;
    }

    public Optional<StudentProfile> getProfile(String id) {
        return studentProfileRepository.findById(id);
    }

    public void addProfile(StudentProfile studentProfile) {
        studentProfileRepository.save(studentProfile);
    }

    public void deleteProfile(String id) {
        studentProfileRepository.deleteById(id);
    }

   /* public void insert(UserCreds userCreds) {
        userRepository.save(userCreds);

    }*/
}
