package com.lancesoft.Student;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/{StudentId}")
	public Student studentDetails(@PathVariable ("StudentId") String StudentId)
	{
		return new Student("sudheer");
	}

}
