package com.dswey.springbootpostgresql.service;

import com.dswey.springbootpostgresql.entities.Review;

import javax.validation.constraints.NotNull;

public interface TeacherService {
    /**
     *
     * @param teacherID
     * @param review
     * @throws javax.persistence.EntityNotFoundException
     */
    void addReview(@NotNull String teacherID, @NotNull Review review);
}
