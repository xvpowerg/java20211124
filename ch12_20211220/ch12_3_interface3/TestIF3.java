/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20211220.ch12_3_interface3;

//父介面的 的方法有重複名稱 TestIF3子介面可複寫解決錯誤
public interface TestIF3 extends TestIF1,TestIF2 {
    default void defMethod1(int v){
        System.out.println("defMethod3:"+v);
    } 
}
