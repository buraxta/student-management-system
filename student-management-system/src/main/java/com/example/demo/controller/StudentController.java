package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	//handler method to handle list student request and return mode and view
	@GetMapping("/students")
	public String listStudent(Model model) {
		model.addAttribute("student",studentService.getAllStudents());
		return "students";
	}
}
