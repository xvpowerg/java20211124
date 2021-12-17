/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20211217.ch11_6_interface6;

public class Ch11_6 {
    
    public static void main(String[] args) {
        
        TestObject tobj = new TestObject();
        //int max = tobj.max(5,8);
        int max = TestStaticIF.max(5, 8);
        System.out.println(max);
    }
    
}
