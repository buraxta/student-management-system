package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

//Extend ettiğimiz JpaRepository'de var diye buraya tekrar @Repository anotasyonu eklemedik
public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
