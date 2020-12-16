package com.hex.rest.representation;

import com.hexdomain.api.model.Student;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {

    @NotNull
    Long studentRef;
    @NotBlank
    String name;

    public Student toStudent(){
        return Student.builder()
                .studentRef(studentRef)
                .name(name)
                .build();
    }
}
