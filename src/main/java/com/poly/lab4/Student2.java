/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab4;
import java.util.Scanner;

/**
 *
 * @author TUONG VY
 */
public class Student2 {
    

    private String id;
    private String name;
    private int age;
    private double gpa;

    public Student2() {
    }

    public Student2(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        setAge(age);        
        setGpa(gpa);
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuoi khong hop le");
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 10) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA khong hop le");
        }
    }


    public void input(Scanner sc) {

        System.out.print("Nhap id: ");
        id = sc.nextLine();

        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        setAge(sc.nextInt());

        System.out.print("Nhap GPA: ");
        setGpa(sc.nextDouble());

        sc.nextLine();
    }

    public String rank() {

        if (gpa >= 9) {
            return "Excellent";
        } else if (gpa >= 8) {
            return "Very Good";
        } else if (gpa >= 6.5) {
            return "Good";
        } else if (gpa >= 5) {
            return "Average";
        } else {
            return "Fail";
        }
    }

    public void output() {

        System.out.printf(
            "ID: %s | Ho ten: %s | Tuoi: %d | GPA: %.2f | Xep loai: %s\n",
            id, name, age, gpa, rank()
        );
    }
}

