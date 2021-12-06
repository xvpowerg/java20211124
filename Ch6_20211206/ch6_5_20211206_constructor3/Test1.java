/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_5_20211206_constructor3;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){
        System.out.println("Test1()");
    }
    Test1(int v1,int v2){
        this();
        System.out.println("Test1(int int)");
    }
}
