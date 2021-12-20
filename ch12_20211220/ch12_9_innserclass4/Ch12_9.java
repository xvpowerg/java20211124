/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20211220.ch12_9_innserclass4;

/**
 *
 * @author xvpow
 */
public class Ch12_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // anonymous
        Dog dog1 = new Dog();
        dog1.bark();
        Dog dog2 = new Dog(){
          public void bark(){
              System.out.println("喵喵！！");
          }  
        };
        dog2.bark();
    }
    
}
