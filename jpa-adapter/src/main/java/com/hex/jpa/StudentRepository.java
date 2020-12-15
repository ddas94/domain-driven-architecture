package com.hex.jpa;

import com.hex.jpa.dao.StudentDao;
import com.hex.jpa.entity.StudentEntity;
import com.hexdomain.api.model.Student;
import com.hexdomain.api.port.ObtainStudent;

public class StudentRepository implements ObtainStudent {

    private final StudentDao studentDao;

    public StudentRepository(StudentDao studentDao){
        this.studentDao=studentDao;

    }
    @Override
    public Student save(Student student) {
        return studentDao.save(StudentEntity.fromStudent(student).toStudent());
    }
}
