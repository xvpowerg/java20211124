/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20211208.Ch7_5_override2_returnvalue;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public void m1(int v2){
        System.out.println("Test1 m1");
    }
   public Test1 m2(){
        System.out.println("Test1 m2");
        return new Test1();
    }
   public int m3(){
        System.out.println("Test1 m2");
        return 0;
    }
}  
