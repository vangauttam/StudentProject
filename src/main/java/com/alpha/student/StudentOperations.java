package com.alpha.student;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentOperations implements Student {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addStudent() {


        System.out.print("Enter student name: ");
        String name = sc.next();

        System.out.print("Enter student Age: ");
        int age = sc.nextInt();

        StudentEntity stu = new StudentEntity();
        stu.setName(name);
        stu.setAge(age);

        et.begin();
        em.persist(stu);
        et.commit();

        System.out.println("Student Added Successfully!");

    }

    @Override
    public void findStudentById() {
        
    	System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        StudentEntity stu = em.find(StudentEntity.class, id);

        if (stu != null) {
            System.out.println("\n--- Student Found ---");
            System.out.println("ID       : " + stu.getId());
            System.out.println("Name     : " + stu.getName());
            System.out.println("Age : " + stu.getAge());
            
        } else {
            System.out.println("Student Not Found!");
        }
    }

    @Override
    public void findStudentByName() {
        // your code here
    }

    @Override
    public void updateStudent() {
        // your code here
    }

    @Override
    public void deleteStudent() {
        // your code here
    }

    @Override
    public void displayAllStudents() {
        // your code here
    }
}
