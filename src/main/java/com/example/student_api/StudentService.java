package com.example.studentapi.service;

import com.example.studentapi.model.Student;
import com.example.studentapi.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentById(Long id) {
        return repo.findById(id)
                   .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Student createStudent(Student student) {
        return repo.save(student);
    }

    public Student updateStudent(Long id, Student details) {
        Student student = getStudentById(id);
        student.setName(details.getName());
        student.setEmail(details.getEmail());
        student.setAge(details.getAge());
        return repo.save(student);
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}
