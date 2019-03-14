package com.dswey.springbootpostgresql.controllers;

import com.dswey.springbootpostgresql.entities.Review;
import com.dswey.springbootpostgresql.service.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/teachers/{id}/review")
    public ResponseEntity addReview(@RequestBody Review review, @PathVariable("id") String teacherID){
        try {
            teacherService.addReview(teacherID, review);
            return ResponseEntity.ok().build();
        }
        catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }
}
