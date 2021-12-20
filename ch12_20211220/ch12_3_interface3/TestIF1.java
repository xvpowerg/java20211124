/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20211220.ch12_3_interface3;

public interface TestIF1 {
    default void defMethod1(int v){
        System.out.println("defMethod1:"+v);
    }
}
