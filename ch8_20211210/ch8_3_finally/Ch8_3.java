/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20211210.ch8_3_finally;
import  ch8_20211210.ch8_1_exception1.MyCatchedException;
import  ch8_20211210.ch8_1_exception1.TestException;
public class Ch8_3 {
        static void close(){
            System.out.println("Close!!!");
        }
        
    public static void main(String[] args) {        
        try{
            TestException.testCatchedException(10);
            
        }catch(MyCatchedException ex){
            System.out.println(ex);
        }finally{
            //一定執行一次
          close();  
        }  
        
        try{
             TestException.testuncatchedException(20);
         }finally{
            close();   
            }
   
        
    }
    
}
