package com.hex.jpa.entity;

import com.hexdomain.api.model.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentEntity {
    @Id
    private long id;

    @Column
    private long studentRef;

    @Column
    private String name;

    public static StudentEntity fromStudent(Student student){
       return StudentEntity.builder()
                .studentRef(student.getStudentRef())
                .name(student.getName())
                .build();
    }

    public Student toStudent(){
        return Student.builder()
                .studentRef(studentRef)
                .name(name)
                .build();
    }
}
