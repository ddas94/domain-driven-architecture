package com.hex.domain;

import com.hexdomain.api.model.Student;
import com.hexdomain.api.port.ObtainStudent;
import com.hexdomain.api.port.RequestStudent;

import java.util.List;

public class StudentDomain implements RequestStudent {

    private final ObtainStudent obtainStudent;

    public StudentDomain(ObtainStudent obtainStudent){
        this.obtainStudent=obtainStudent;
    }
    //save the student object by request from domain port
    @Override
    public Student save(Student student) {
        return obtainStudent.save(student);
    }

    @Override
    public List<Student> getStudents() { return obtainStudent.getStudents();}
}
