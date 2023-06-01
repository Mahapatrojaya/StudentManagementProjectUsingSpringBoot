package com.StudentManagementSystem.StudentProject.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentManagementSystem.StudentProject.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Long>{

}