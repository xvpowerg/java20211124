/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20220121.ch26_2_thread2;

/**
 *
 * @author xvpow
 */
public class Ch26_2 {
    //Lock
    //資源搶占問題?
    //解決方案!
    //真的需要一可共享的變數嗎?
    //加鎖 建議區域鎖
    static  class Test1{
        private int x = 0;
        public synchronized void run(){
            for (int i = 1;i <= 5;i++){
                //Lock this 是一把鎖
                //Thread 拿到 Key
                //區域封鎖
               // synchronized(this){
                    x++;
                    System.out.println(x);
               // }
                
            }            
        }
    }
    public static void main(String[] args) {        
        Test1 t1 = new Test1();
        Thread th1 = new Thread(()->{
        t1.run();
        });
        
        Thread th2 = new Thread(()->{
        t1.run();
        });
        
        th1.start();
        th2.start();
    //A
    //B
        
    }
    
}
