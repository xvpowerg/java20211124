/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20220117.Ch24_7_ser5;

import java.io.Serializable;

public class Student  extends  Person implements Serializable{
    private Book book;
    private String name;
    private int age;
    
    public Student(String name, int age,
            String phoneNumber,String adderss) {
        super(phoneNumber,adderss);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Student{" + "book=" + book + ", name=" + name + ", age=" + age + '}';
    }
    

    
    
}
