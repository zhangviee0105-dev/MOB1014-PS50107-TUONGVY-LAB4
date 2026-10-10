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

        public class Student3 {
        private String id;
        private String name;
        private int age;
        private double gpa;

        public Student3() {
        }

        public void input(Scanner sc) {
            System.out.print("Nhap ma SV: ");
            id = sc.nextLine();

            System.out.print("Nhap ho ten: ");
            name = sc.nextLine();

            System.out.print("Nhap tuoi: ");
            age = Integer.parseInt(sc.nextLine());

            System.out.print("Nhap GPA: ");
            gpa = Double.parseDouble(sc.nextLine());
        }

        public double getGpa() {
            return gpa;
        }

        public void output() {
            System.out.printf("ID: %s | Ho ten: %s | Tuoi: %d | GPA: %.2f%n",
                    id, name, age, gpa);
        }
    }

