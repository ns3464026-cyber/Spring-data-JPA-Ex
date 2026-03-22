package com.example.Spring_data_JPA_ex;

import com.example.Spring_data_JPA_ex.model.Student;
import com.example.Spring_data_JPA_ex.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringDataJpaExApplication.class, args);
//		System.out.println("HELLO SPRING JPA");
		Student s1 =context.getBean(Student.class);
		Student s2 =context.getBean(Student.class);
		Student s3 =context.getBean(Student.class);
//
		StudentRepo repo = context.getBean(StudentRepo.class);
//
		s1.setRollNO(01);
		s1.setMarks(55);
		s1.setName("Nikhil");
////
//		s2.setRollNO(02);
//		s2.setMarks(60);
//		s2.setName("Garima");
//
//		s3.setRollNO(03);
//		s3.setMarks(70);
//		s3.setName("Tony");
//
//		repo.save(s1);
//		repo.save(s3);

//		Optional<Student> s = repo.findById(03); //optional keyword handle the nullpoint expection if there is no student object
//		System.out.println(s.orElse(new Student())); //orElse gives null object if s is not present
//		System.out.println(repo.findAll());
		System.out.println(repo.findByName("Garima"));
		System.out.println(repo.findByMarksGreaterThan(40));

	}

}
