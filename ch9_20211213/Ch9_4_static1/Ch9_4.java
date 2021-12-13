/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20211213.Ch9_4_static1;

/**
 *
 * @author xvpow
 */
public class Ch9_4 {
    public static void main(String[] args) {
       
        Test1 t1 = new Test1();
        t1.msg2 = "T1 Msg2";
        t1.msg1 = "T1 Msg1";//不建議
        //t1.method2();
        //t1.method1();//不建議
        
        //靜態 屬於 類別
        //類別.屬性 通常讀多
        //類別.方法
       Test1.msg1 = "Test1 msg1" ;
       Test1.method1();
       
        Test1 t2 = new Test1();
        Test1 t3 = new Test1();
        //非靜態
        t2.msg2 = "T2 Msg2";
        t3.msg2 = "T3 Msg2";        
        t2.method2();
        t3.method2();
        //靜態
        t2.msg1 = "static T2 Msg1";
        t3.msg1 = "static T3 Msg1";
        t2.method1();
        t3.method1();
    }
    
}

