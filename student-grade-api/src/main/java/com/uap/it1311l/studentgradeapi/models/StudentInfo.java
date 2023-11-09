package com.uap.popquiz.studentgradesapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uap.popquiz.studentgradesapi.repository.RegistrationMybatisRepository;
import com.uap.popquiz.studentgradesapi.model.StudentInfo;
import com.uap.popquiz.studentgradesapi.model.StudentRatings;

@RestController
public class GradesController {
    @Autowired
    RegistrationMybatisRepository registrationRepo;

    @PostMapping("/register")
    public StudentInfo register(@RequestBody StudentInfo studentinfo, @RequestBody StudentRatings studentrating) {
        // Insert data into the database
        registrationRepo.insert(studentinfo, studentrating);

        // Update the comment based on the average grade
        if (studentinfo.getAverageGrade() >= 85) {
            studentinfo.setComment("Within the maintaining average");
        } else {
            studentinfo.setComment("For Improvement");
        }

        // Update the comment in the database
       // registrationRepo.update(student);

        return studentinfo;
    }
}