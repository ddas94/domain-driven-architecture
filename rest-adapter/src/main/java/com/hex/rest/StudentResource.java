package com.hex.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.hex.rest.representation.StudentRequest;
import com.hexdomain.api.model.Student;
import com.hexdomain.api.port.RequestStudent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/students")
public class StudentResource {

    private RequestStudent requestStudent;

    public StudentResource(RequestStudent requestStudent){
        this.requestStudent= requestStudent;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE,produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveStudent(@Valid @RequestBody StudentRequest studentRequest){
        Student student = Student.from(studentRequest.toStudent()).build();
        return ResponseEntity.ok().body(requestStudent.save(student));
    }
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getStudents(){
        return ResponseEntity.ok().body(requestStudent.getStudents());
    }
}
