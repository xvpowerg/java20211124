/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20211220.ch12_6_innserclass1;

/**
 *
 * @author xvpow
 */
public class Ch12_6 {
    
    public static void main(String[] args) {
         TestInnerClass innerClass = new TestInnerClass();
         innerClass.testInnerClass();     
         
         TestInnerClass innerClass2  = new TestInnerClass();
         TestInnerClass.MySubClass1 inn2MySub = 
                 innerClass2.new MySubClass1("Vivin");
         System.out.println(inn2MySub);
         
    }
    
}
