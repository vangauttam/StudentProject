package com.alpha.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private int age;

    public StudentEntity() {
        // Default constructor
    }

    public StudentEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // -------------------------
    // GETTERS & SETTERS
    // -------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Optional (for printing student info)
    @Override
    public String toString() {
        return "StudentEntity [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
