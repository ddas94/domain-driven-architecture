package com.hex.jpa.dao;

import com.hex.jpa.entity.StudentEntity;
import com.hexdomain.api.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentEntity,Long> {

    Student save(Student student);
}
