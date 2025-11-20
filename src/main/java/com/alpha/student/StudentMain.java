package com.alpha.student;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentOperations ops = new StudentOperations();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Find Student by ID");
            System.out.println("3. Find Student by Name");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Display All Students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ops.addStudent();
                    break;

                case 2:
                    ops.findStudentById();
                    break;

                case 3:
                    ops.findStudentByName();
                    break;

                case 4:
                    ops.updateStudent();
                    break;

                case 5:
                    ops.deleteStudent();
                    break;

                case 6:
                    ops.displayAllStudents();
                    break;

                case 7:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}
