/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20211220.ch12_6_innserclass1;

/**
 *
 * @author xvpow
 */
public class TestInnerClass {
    //為什麼要內部類
    //因為內部類可以使用所有Modifier(public ...protected...)
    public  class MySubClass1{
        private String name;
        public MySubClass1(String name){
            this.name = name;
        }
        public String toString(){
            return name;
        }
    }
    
    public void testInnerClass(){
         MySubClass1 sub1 = new MySubClass1("Ken");   
         System.out.println(sub1);
    }
}
