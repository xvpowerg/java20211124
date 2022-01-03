/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20210103.ch18_3_map3;

/**
 *
 * @author xvpow
 */
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
