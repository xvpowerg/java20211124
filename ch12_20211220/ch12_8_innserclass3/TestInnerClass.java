/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20211220.ch12_8_innserclass3;
public class TestInnerClass {
       String name = "OutInner";
       static String msg = "StaticOutInner";
       
    public class MyInnerClass{
        String name = "MyInner";
        public void testInner(){
            System.out.println(name);
            System.out.println(TestInnerClass.this.name);
        }
    }
    
    public static class StaticInnerClass{
         static String msg = "MyStaticInner";
           public void testStaticInner(){
               System.out.println(msg);
               System.out.println(TestInnerClass.msg);
        }
    }
    
}
