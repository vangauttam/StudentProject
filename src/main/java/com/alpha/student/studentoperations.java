package com.alpha.student;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class studentoperations {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Find Student by ID");
            System.out.println("3. Find Student by Name");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Display All Students");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                	
                	 System.out.print("Enter ID: ");
                     int id = sc.nextInt();
                     sc.nextLine();

                     System.out.print("Enter Name: ");
                     String name = sc.nextLine();

                     System.out.print("Enter Standard: ");
                     int standard = sc.nextInt();

                     System.out.print("Enter Marks: ");
                     double marks = sc.nextDouble();

                     Student newStudent = new Student(id, name, standard, marks);

                     et.begin();
                     em.persist(newStudent);
                     et.commit();

                     System.out.println("✔ Student added successfully!");
                     break;


                case 2:
                	
                	System.out.print("Enter Student ID: ");
                    int findId = sc.nextInt();

                    Student found = em.find(Student.class, findId);

                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("❌ Student not found!");
                    }
                    break;


                case 3:
                   break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
        em.close();
        emf.close();
    }
}