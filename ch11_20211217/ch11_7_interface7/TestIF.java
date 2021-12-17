/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch11_20211217.ch11_7_interface7;

/**
 *
 * @author xvpow
 * FunctionalInterface 
 * 介面當中抽象方法只能有一個
 * 模擬函數
 * 
 */
@FunctionalInterface
public interface TestIF {
    boolean test(int v);
    //boolean test2(int v);//多這一組方法會錯
}
