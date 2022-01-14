/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220114.ch23_5_io4_auto_close2;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_5 {

    public static void main(String[] args) {
       try(TestClose close1 = new TestClose("Test1 Close!");
           TestClose close2 = new TestClose("Test2 Close");    ){
           System.out.println("Body!!");
       }catch(IOException ex){
           System.out.println(ex);
       }finally{
           System.out.println("finally!");
       }
        
        
        
    }
    
}
