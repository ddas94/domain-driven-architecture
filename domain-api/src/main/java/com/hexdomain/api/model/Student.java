package com.hexdomain.api.model;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = false)
@Builder
@Getter
@ToString
public class Student {

    Long id;
    Long studentRef;
    String name;

    public static Student.StudentBuilder from(Student student){
        return Student.builder()
                .id(student.getId())
                .name(student.getName())
                .studentRef(student.getStudentRef());
    }
    public Student build() {
        return new Student(
                id,
                studentRef,
                name
        );
    }
}
