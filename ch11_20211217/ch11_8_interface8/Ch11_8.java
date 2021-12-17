/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20211217.ch11_8_interface8;

/**
 *
 * @author xvpow
 */
public class Ch11_8 {
    public static void main(String[] args) {
       //default 會被繼承下來
        TestIF1 tif1 = new TestObject();
        tif1.func1();
        tif1.defFunc();
        TestIF1.staticFunc();
        System.out.println("============================");
        TestIF3 tif3 = new TestObjec2();
        tif3.func1();
        tif3.defFunc();
    }
    
}
