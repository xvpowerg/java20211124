/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20211215.ch10_5_abstract1;

/**
 *
 * @author xvpow
 */
public class Ch10_5 {
    //抽象類別
    //1 類別是一種通稱時設為抽象類別
    //2 提醒你要複寫某些方法 
    public static void main(String[] args) {
       Animal an = new Dog("Vivi",2);
       System.out.println(an);
       an.bark();
        
        
        
    }
    
}
