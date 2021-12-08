/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20211208.Ch7_6_exception1;
import java.lang.IllegalArgumentException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    
    public void setName(String name)throws IOException{
        if(name == null || name.length() < 2){           
            throw new IOException("錯誤的姓名!");
        }
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        if (age < 5 || age >150){
            System.out.println("錯誤的年齡!");
            throw new IllegalArgumentException("錯誤的年齡!");
        }
        this.age = age;
    }            
    public int getAge(){
        return this.age;
    }
    
}
