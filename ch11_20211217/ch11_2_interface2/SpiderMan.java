/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20211217.ch11_2_interface2;

/**
 *
 * @author xvpow
 */
public class SpiderMan implements Fly,Jump,Run,Attack {
    
    public void flying(){
        System.out.println("飛行裝備");
    }

    public void jumping(){
        System.out.println("強力跳!");
    }

    public void runing(){
        System.out.println("神速跑!");
    }
    
    public void attacking(int powe){
           System.out.println("蜘蛛攻擊!!:"+powe);
    }
    
}
