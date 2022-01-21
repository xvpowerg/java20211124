/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20220121.ch26_1_thread1;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author xvpow
 */
public class Ch26_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable run= ()->{
            for (int i = 1;i<= 5;i++){               
               String time = LocalTime.now().toString();
               System.out.println(time);
               try{
                   TimeUnit.SECONDS.sleep(1);
               }catch(Exception ex){
                   System.out.println(ex);
               }               
            }        
        };
        Thread th1  = new Thread(run);
        th1.start();
        
    }
    
}
