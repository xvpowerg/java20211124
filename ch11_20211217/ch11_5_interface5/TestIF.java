/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch11_20211217.ch11_5_interface5;

/**
 *
 * @author xvpow
 */
public interface TestIF {
    String func(String str);
    //可以有default方法
    //如果會使用default的方法 通常是因為 做呼叫 介面內抽象方法
    public default void printFunc(String msg){
        System.out.println(func(msg));
    }
    
}
