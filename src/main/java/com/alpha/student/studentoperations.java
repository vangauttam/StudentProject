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
        // your code here
    }

    @Override
    public void findStudentById() {
        // your code here
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
