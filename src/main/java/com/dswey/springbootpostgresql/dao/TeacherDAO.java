package com.dswey.springbootpostgresql.dao;

import com.dswey.springbootpostgresql.entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface TeacherDAO extends CrudRepository<Teacher, UUID> {}
