package com.example.jpamappingrelations.serviceiml;

import com.example.jpamappingrelations.model.Student;
import com.example.jpamappingrelations.repository.StudentRepository;
import com.example.jpamappingrelations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceIml implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
