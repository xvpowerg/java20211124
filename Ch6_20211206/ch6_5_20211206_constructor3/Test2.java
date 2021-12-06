/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_5_20211206_constructor3;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    Test2(){
       System.out.println("Test2()");
    }
    Test2(int v1,int v2){
        super(v1,v2);
        System.out.println("Test2(int int):"+v1+":"+v2);
    }
}
