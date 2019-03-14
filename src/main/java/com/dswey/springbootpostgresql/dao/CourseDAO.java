package com.dswey.springbootpostgresql.dao;


import com.dswey.springbootpostgresql.entities.Course;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface CourseDAO extends CrudRepository<Course, UUID> {}