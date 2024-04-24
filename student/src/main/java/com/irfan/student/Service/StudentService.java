package com.irfan.student.Service;


import com.irfan.student.Entity.Student;
import com.irfan.student.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public void saveStudent(Student student){
        repository.save(student);
    }

    public List<Student> findAllStudents() {
        return repository.findAll();
    }
}
