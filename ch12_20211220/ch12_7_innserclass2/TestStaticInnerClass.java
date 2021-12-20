/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20211220.ch12_7_innserclass2;

/**
 *
 * @author xvpow
 */
public class TestStaticInnerClass {
    private static String msg1 = "Test!!!";
    private  String msg2 = "Test2!!!";
    protected static class StaticClass{
        private int count;
       public StaticClass(int count){
           this.count = count;
       }
       
       public  String toString(){
           //String test = msg2;//msg2不是靜態的!
           return String.valueOf(count+msg1);
       } 
       
    }    
}
