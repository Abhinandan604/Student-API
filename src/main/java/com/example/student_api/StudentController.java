package com.example.studentapi.controller;

import com.example.studentapi.model.Student;
import com.example.studentapi.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*") // Allow all origins for Postman/browser
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // Get all students
    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    // Create student
    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.createStudent(student);
    }

    // Update student
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    // Delete student
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }
}
