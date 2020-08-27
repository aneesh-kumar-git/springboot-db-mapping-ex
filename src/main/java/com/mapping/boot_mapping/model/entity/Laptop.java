package com.mapping.boot_mapping.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "laptop")
public class Laptop {
	@Id
	@Column
	private Integer laptopno;
	@Column
	private String laptopname;
}
