/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20211215.ch10_5_abstract1;
//抽象的類別 不可以是final的
//finla 的類別是不可繼承
public abstract class Animal {
    private String name;
    private int age;
    //唯讀
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }    
    public int getAge(){
        return age;
    }        
    //抽象方法不可私有
    //抽象的方法 不可以是final的
    ////finla 的方法是不可複寫
    public abstract void bark();
    public String toString(){
        return this.name+":"+this.age;
    }
}
