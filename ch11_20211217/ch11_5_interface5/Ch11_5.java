/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20211217.ch11_5_interface5;

public class Ch11_5 {

    public static void main(String[] args) {
      TestIF tif = new TestObject();
     String msg  =  tif.func("abc");
     tif.printFunc("abc");
     System.out.println(msg);
        
    }
    
}
