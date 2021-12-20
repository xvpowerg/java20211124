/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20211220.ch12_4_interface4;
public interface TestIF2  extends TestIF1{
    default void defMethod1(int v){
        System.out.println("defMethod2:"+v);
    } 
}
