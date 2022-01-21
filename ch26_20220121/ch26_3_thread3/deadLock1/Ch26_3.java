/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20220121.ch26_3_thread3.deadLock1;

/**
 *
 * @author xvpow
 */
public class Ch26_3 {

    static class TestDeadLock{
        public synchronized void test1(TestDeadLock tlock){
                System.out.println("TestXXXX");
                tlock.test2();
        }
        public synchronized void test2(){
            System.out.println("test2");
        }
    }
    public static void main(String[] args) {
      TestDeadLock t1 = new  TestDeadLock();
      TestDeadLock t2 = new  TestDeadLock();
      
      Thread th1 = new Thread(()->{
          t1.test1(t2);
      });
        Thread th2 = new Thread(()->{
          t2.test1(t1);
      });  
        
      th1.start();
      th2.start();
        
    }
    
}
