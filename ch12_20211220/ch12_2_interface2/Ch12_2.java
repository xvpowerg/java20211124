/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20211220.ch12_2_interface2;

public class Ch12_2 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        TestIF1 tif1 = myClass;
        TestIF1.testStatic();
        TestIF2.testStatic();
    }
    
}
