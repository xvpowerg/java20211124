/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20211220.ch12_7_innserclass2;
import ch12_20211220.ch12_7_innserclass2.TestStaticInnerClass.StaticClass;
/**
 *
 * @author xvpow
 */
public class Ch12_7 {


    public static void main(String[] args) {
        TestStaticInnerClass.StaticClass ts =
                new TestStaticInnerClass.StaticClass(25);
        System.out.println(ts);
        
        StaticClass ts2 = new StaticClass(18);
        System.out.println(ts2);
        
        
    }
    
}
