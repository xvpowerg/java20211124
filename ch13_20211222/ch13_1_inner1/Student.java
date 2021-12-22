/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20211222.ch13_1_inner1;

/**
 *
 * @author xvpow
 */
public  abstract class Student {
    private String name;
    public String getName(){
        return name;
    }
    public Student(String name){        
        this.name = name;
    }
    public abstract void skill();
}
