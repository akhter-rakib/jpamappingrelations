package com.example.jpamappingrelations.ResController;

import com.example.jpamappingrelations.model.Laptop;
import com.example.jpamappingrelations.model.Student;
import com.example.jpamappingrelations.service.LaptopService;
import com.example.jpamappingrelations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingRestController {

    @Autowired
    StudentService studentService;

    @Autowired
    LaptopService laptopRepository;

    @PostMapping(value = "/saveLaptop")
    public void saveLaptop(@RequestBody Laptop laptop) {
        laptopRepository.saveLaptop(laptop);
    }

    @PostMapping(value = "/saveStudent")
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @GetMapping(value = "/test")
    public void test() {
        Laptop laptop = laptopRepository.get(1);
        Student student = new Student(1, "rakib", 30, laptop);
        studentService.save(student);
    }
}
