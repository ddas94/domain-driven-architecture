package com.hex.jpa.entity;

import com.hexdomain.api.model.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(
            name="student_seq",
            sequenceName="student_sequence",
            allocationSize=100
    )
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
    private Long id;

    @Column(name = "STD_REF")
    private Long studentRef;

    @Column(name = "STD_NAME")
    private String name;

    public static StudentEntity fromStudent(Student student){
       return StudentEntity.builder()
                .id(student.getId())
                .studentRef(student.getStudentRef())
                .name(student.getName())
                .build();
    }

    public Student toStudent(){
        return Student.builder()
                .id(id)
                .studentRef(studentRef)
                .name(name)
                .build();
    }
}
