/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20211213.Ch9_4_static1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    static String msg1 = "msg1";
    String msg2 = "msg2";
   
    public static void method1(){
        System.out.println("method1:"+msg1);
    }
    public  void method2(){
         System.out.println("method2:"+msg1+":"+msg2);
    }
}
