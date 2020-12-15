package com.hexdomain.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    Long studentRef;
    String name;

    public Student build() {
        return new Student(
                studentRef,
                name
        );
    }
}
