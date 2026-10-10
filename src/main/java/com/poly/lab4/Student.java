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
public class Student {
    String id;
    String hoTen;
    int tuoi;
    double gpa;  
    Scanner sc = new Scanner(System.in);
    public Student (){
        
    }
    public Student (String id, String hoTen, int tuoi, double gpa ){
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gpa = gpa;
    }
    public void Input (){
        System.out.print("Nhap id: ");
        id = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap gpa: ");
        gpa = sc.nextDouble();
    }
//    public void Output(){
//        System.out.printf("ID : %s\n",id );
//        System.out.printf("Ho ten: %s\n", hoTen);
//        System.out.printf("Tuoi: %d\n", tuoi);
//        System.out.printf("GPA: %.2f\n", gpa);
//    }
    public String Rank(){
        if (gpa >=9){
            return "Excellent";
        }
        else if (gpa >=8){
            return "Very Good";
        }
        else if (gpa >=6.5){
            return "Good";
        }
        else if (gpa >=5){
            return "Average";
        }
        else {
            return "Fail";
        }
    }
    public void Output(){
        System.out.printf("ID: %s | Ho ten: %s | tuoi: %d | GPA: %.2f | Xeploai: %s\n",id , hoTen, tuoi, gpa, Rank());
  }
    
}
    



