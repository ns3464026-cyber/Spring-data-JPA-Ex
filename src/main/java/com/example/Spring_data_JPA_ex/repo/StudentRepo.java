package com.example.Spring_data_JPA_ex.repo;

import com.example.Spring_data_JPA_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
//    @Query("select s from Student s where s.name=?1")     //JPQL
    List<Student> findByName(String name);//spring jpa use behind the seen dsl to create method
    List<Student> findByMarks(int marks);


    List<Student> findByMarksGreaterThan(int marks);
}
