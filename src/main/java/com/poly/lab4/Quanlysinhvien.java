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
public class Quanlysinhvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap so luong sinh vien: ");
            n = Integer.parseInt(sc.nextLine());
        } while (n <= 0);

        Student3[] ds = new Student3[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1));
            ds[i] = new Student3();
            ds[i].input(sc);
        }
        System.out.println("=== DANH SACH SINH VIEN ===");
        for (int i = 0; i < n; i++) {
            ds[i].output();
        }

        Student3 max = ds[0];

        for (int i = 1; i < n; i++) {
            if (ds[i].getGpa() > max.getGpa()) {
                max = ds[i];
            }
        }

        System.out.println("=== SINH VIEN CO GPA CAO NHAT ===");
        max.output();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (ds[j].getGpa() < ds[j + 1].getGpa()) {
                    Student3 tmp = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = tmp;
                }
            }
        }

        System.out.println("=== DANH SACH SAU KHI SAP XEP GIAM DAN THEO GPA ===");
        for (int i = 0; i < n; i++) {
            ds[i].output();
        }

        sc.close();
    }
}
    
    

