package com.example.Spring_data_JPA_ex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Student {
    @Id
    private  int rollNO;
    private String name;
    private int marks;

    public int getRollNO() {
        return rollNO;
    }

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNO=" + rollNO +
                ", Name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
