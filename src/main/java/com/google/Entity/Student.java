package com.google.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Students_DB")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
     
	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	
	private int marks;
	
	private String Name;
     
}
