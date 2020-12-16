package com.hexdomain.api.port;

import com.hexdomain.api.model.Student;

import java.util.List;

public interface ObtainStudent {

    Student save(Student student);

    List<Student> getStudents();
}
