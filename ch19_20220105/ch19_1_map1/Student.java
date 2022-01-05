/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20220105.ch19_1_map1;
public class Student {
    private int id;
    private int score;
    Student(int id,int score){
        this.id = id;
        this.score = score;
    }
    public int getId(){
        return id;
    }
    
    public int getScore(){
        return score;
    }
    public String toString(){
        return id+":"+score;
    }
}
