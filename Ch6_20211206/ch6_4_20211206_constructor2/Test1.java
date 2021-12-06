/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_4_20211206_constructor2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){
        this(10,25f,"Ken");
        System.out.println("Test1()");
    }
    Test1(int v1,String s1){
        System.out.println("Test1(int string)"+v1+":"+s1);
    }
    
    Test1(int v1,float f1,String s1){
      this(v1,"Lucy");
      System.out.println("Test1(int,float String)");
    }
}
