package com.example.studentapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity // Tells JPA this is a database table
@Data // Lombok - generates getters, setters, toString, equals, hashCode
@NoArgsConstructor // Lombok - generates no-args constructor
@AllArgsConstructor // Lombok - generates all-args constructor
@Builder // Lombok - enables builder pattern
public class Student {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private Long id;

    private String name;
    private String email;
    private int age;
}
