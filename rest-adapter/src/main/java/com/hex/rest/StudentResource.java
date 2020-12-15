package com.hex.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.hexdomain.api.model.Student;
import com.hexdomain.api.port.RequestStudent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentResource {

    private RequestStudent requestStudent;

    public StudentResource(RequestStudent requestStudent){
        this.requestStudent= requestStudent;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveStudent(Student student){
        return ResponseEntity.ok().body(requestStudent.save(student));
    }
}
