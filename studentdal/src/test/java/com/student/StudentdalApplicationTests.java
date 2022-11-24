package com.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository repo;

	@Test
	void testCreateStudent() {
		Student student=new Student();
		student.setName("Aswin");
		student.setCourse("Computer Science");
		student.setFee(30d);
		repo.save(student);
	}
	
	@Test
	void testFindStudentById() {
		Student student=repo.findById(1l).get();
		System.out.println(student);
		}
	
	@Test
	void testUpdateStudent() {
		Student student=repo.findById(1l).get();
		student.setFee(40000d);
		repo.save(student);
	}
	
	@Test
	void testDeleteStudent() {
		Student student=repo.findById(2l).get();
		repo.delete(student);
	}
	
	

}
