package com.mapping.boot_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.boot_mapping.model.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
}
