package com.nokri.jersey.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Student {
	private int id;
	private String name;
	private String country;
	private int age;
	
	public Student(int id, String name, String country, int age) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.age = age;
		
	}
}
