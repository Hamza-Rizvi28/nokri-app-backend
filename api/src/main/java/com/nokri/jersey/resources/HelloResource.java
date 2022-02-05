package com.nokri.jersey.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nokri.jersey.model.Student;

@Path("/hello")
public class HelloResource {
	
	@GET 
	@Produces(MediaType.APPLICATION_JSON)
	public Student sayJsonHello() {
		return new Student(123, "Mustufain", "Pakistan", 28);
	}
	
}