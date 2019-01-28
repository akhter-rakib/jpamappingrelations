package com.example.jpamappingrelations.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "roll_no", nullable = false)
    private Integer rollNo;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "marks", nullable = true)
    private Integer marks;

    @JoinColumn(name = "laptop_id")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Laptop laptop;

    public Student(Integer rollNo, String name, Integer marks, Laptop laptop) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.laptop = laptop;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
