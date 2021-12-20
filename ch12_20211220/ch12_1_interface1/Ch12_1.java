/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20211220.ch12_1_interface1;

/**
 *
 * @author xvpow
 */
public class Ch12_1 {

    public static void main(String[] args) {
       MyClass myClass = new MyClass();
        TestIF1 tif1  = myClass;
        TestIF2 tif2  = myClass;
        tif1.method1(20);
        tif2.method1(50);
    }
    
}
