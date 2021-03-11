package com.teamproject.kovo11.lecturer;

import com.teamproject.kovo11.lecturer.exceptions.LecturerAlreadyExistsException;
import com.teamproject.kovo11.lecturer.exceptions.LecturerNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerServiceImpl implements LecturerService{

    LecturerRepository lecturerRepository;

    public LecturerServiceImpl(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

    @Override
    public Lecturer getById(long id) throws LecturerNotFoundException {
        return lecturerRepository.findById(id).orElseThrow(()-> new LecturerNotFoundException("This lecturer does not exist"));
    }

    @Override
    public Lecturer add(Lecturer lecturer) throws LecturerAlreadyExistsException {
        return null;
    }

    @Override
    public void updateLecturer(Lecturer lecturer, long id) throws LecturerNotFoundException {

    }

    @Override
    public List<Lecturer> getAll() {
        return null;
    }
}
