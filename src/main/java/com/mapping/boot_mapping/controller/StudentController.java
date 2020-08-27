package com.mapping.boot_mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.boot_mapping.exception.DatabaseMappingException;
import com.mapping.boot_mapping.model.dto.StudentDetails;
import com.mapping.boot_mapping.service.StudentService;

@RestController
@RequestMapping(value = "/student/")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping(value = "save")
	public ResponseEntity<StudentDetails> saveStudentData(@RequestBody StudentDetails studentDetails) throws DatabaseMappingException {
		System.out.println("dto: "+studentDetails);
		StudentDetails studentDetails2=studentService.saveData(studentDetails);
		return new ResponseEntity<StudentDetails>(studentDetails2,HttpStatus.OK);
	}
}
