/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20211224.ch14_4_methodref3;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    public Person(){  }
    public Person(String name){ 
        this.name = name; }
    
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}
