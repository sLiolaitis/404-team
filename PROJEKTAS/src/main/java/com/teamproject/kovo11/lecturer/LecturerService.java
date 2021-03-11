package com.teamproject.kovo11.lecturer;

import com.teamproject.kovo11.lecturer.exceptions.LecturerAlreadyExistsException;
import com.teamproject.kovo11.lecturer.exceptions.LecturerNotFoundException;

import java.util.List;

public interface LecturerService {

    Lecturer getById(long id) throws LecturerNotFoundException;

    Lecturer add(Lecturer lecturer) throws LecturerAlreadyExistsException;

    void updateLecturer(Lecturer lecturer, long id) throws LecturerNotFoundException;

    List<Lecturer> getAll();

}
