package com.teamproject.kovo11.lecturer;

import com.teamproject.kovo11.lecturer.exceptions.LecturerAlreadyExistsException;
import com.teamproject.kovo11.lecturer.exceptions.LecturerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class LecturerController {

    LecturerService lecturerService;

    @Autowired
    public LecturerController(LecturerService lecturerService) {
        this.lecturerService = lecturerService;
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Lecturer>> getLecturers() {
        List<Lecturer> list = lecturerService.getAll();
        return new ResponseEntity<List<Lecturer>>(list, HttpStatus.OK);
    }

    @GetMapping(path = "{id}", produces = "application/json")
    public ResponseEntity<Lecturer> getLecturerById(@PathVariable("id") Long id) {
        Lecturer lecturer = lecturerService.getById(id);
        return new ResponseEntity<Lecturer>(lecturer, HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<Void> addLecturer(@RequestBody Lecturer lecturer) {
        lecturerService.add(lecturer);
        return ResponseEntity.ok().build();
    }


}
