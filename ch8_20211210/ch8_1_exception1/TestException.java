/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20211210.ch8_1_exception1;
public class TestException {
    public static void testuncatchedException(int v){
        if (v > 5){
            throw new MyUncatchedException();
        }
    }
    
    public static void testCatchedException(int m) throws MyCatchedException{
        if (m > 5){
            throw new MyCatchedException(m+"");
        }    
    }
}
