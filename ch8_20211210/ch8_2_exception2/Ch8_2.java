/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20211210.ch8_2_exception2;

import ch8_20211210.ch8_1_exception1.TestException;
import ch8_20211210.ch8_1_exception1.MyCatchedException;
import java.io.IOException;
public class Ch8_2 {
   static void testMyIoException(int m) throws TestMyIOException{
       if (m > 5){
           throw new TestMyIOException();
       }
   }
    public static void main(String[] args) {
             //越下越父
        try{
              TestException.testCatchedException(2);  
              testMyIoException(21);
        }catch(TestMyIOException ex){
             System.out.println("TestMyIOException:"+ex);
        }catch(MyCatchedException ex){
            System.out.println("MyCatchedException:"+ex);
        }catch(IOException ex){
             System.out.println("IOException:"+ex);
        }catch(Exception ex){
            System.out.println("Exception:"+ex);
        }      
    }
}
