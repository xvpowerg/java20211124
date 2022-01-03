/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20211231.ch17_2_treeset2;

public class Student {
  

    private String name;
    private int age;
    private int score;


    public Student(){}
    public Student(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }    
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }    
    public int getScore(){
        return this.score;
    }    
    public String toString(){
        return this.getName()+" Score:"+getScore()+" Age:"+getAge();
    }

}
