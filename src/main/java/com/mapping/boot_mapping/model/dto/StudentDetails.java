package com.mapping.boot_mapping.model.dto;

import lombok.Data;

@Data
public class StudentDetails {
	private String name;
	private String role;
	private String place;
	private LaptopDetails laptop_details;
}
