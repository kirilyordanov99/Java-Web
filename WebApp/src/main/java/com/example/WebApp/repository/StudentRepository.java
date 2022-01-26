package com.example.WebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WebApp.domain.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}