/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20220121.ch26_4_thread4;

/**
 *
 * @author xvpow
 */
public class Ch26_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        
        Thread th1 = new Thread(()->{
          System.out.println(Thread.currentThread().getName());
        });
        th1.start();
        
         Thread th2 = new Thread(()->{
          System.out.println(Thread.currentThread().getName());
        },"MyThread");
        th2.start();
    }
    
}
