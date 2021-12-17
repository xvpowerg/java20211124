/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20211217.ch11_2_interface2;

/**
 *
 * @author xvpow
 */
public class Ch11_2 {
   
    public static void main(String[] args) {
      SpiderMan spiderMan = new SpiderMan();
      Fly fly1 = spiderMan;
      fly1.flying();
      Attack attack = spiderMan;
      attack.attacking(100);
        
       spiderMan.jumping();
    }
    
}
