/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20211210.ch8_1_exception1;

/**
 *
 * @author xvpow
 */
public class Ch8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //越下越父
        try{
             TestException.testuncatchedException(15);
             TestException.testCatchedException(16);
        }catch(MyCatchedException ex){
            System.out.println(ex);
        }catch(MyUncatchedException ex){
            System.out.println(ex);
        }catch(Exception ex){
        }

    }
    
}
