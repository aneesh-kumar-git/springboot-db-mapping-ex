package com.mapping.boot_mapping.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.boot_mapping.exception.DatabaseMappingException;
import com.mapping.boot_mapping.model.dto.StudentDetails;
import com.mapping.boot_mapping.model.entity.Student;
import com.mapping.boot_mapping.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo studentRepo;
	ModelMapper modelMapper=new ModelMapper();
	public StudentDetails saveData(StudentDetails studentDetails) throws DatabaseMappingException {
		StudentDetails studentDetails2=new StudentDetails();
		Student student=new Student();
		modelMapper.map(studentDetails, student);
		Student student2=studentRepo.save(student);
		if(student2!=null){
			modelMapper.map(student2, studentDetails2);
			System.out.println("ret dto: "+studentDetails2);
			return studentDetails2;
		}
		else {
			throw new DatabaseMappingException("Internal server error");
		}
	}
}
