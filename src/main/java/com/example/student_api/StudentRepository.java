package com.example.studentapi.repository;

import com.example.studentapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository gives CRUD methods without writing SQL
public interface StudentRepository extends JpaRepository<Student, Long> {
}
