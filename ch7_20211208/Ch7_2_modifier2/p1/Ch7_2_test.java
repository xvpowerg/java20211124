/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20211208.Ch7_2_modifier2.p1;

/**
 *
 * @author xvpow
 */
import ch7_20211208.Ch7_2_modifier2.Test1;
public class Ch7_2_test {
    
    public static void main(String[] args) {
        //使用的類別 在不同 package  必須import
     Test1 t1 = new Test1();
     System.out.println(t1.publicStr);
     
     Test2 t2 = new Test2();
     t2.run();
     System.out.println(t2.publicStr);
    }    
}
