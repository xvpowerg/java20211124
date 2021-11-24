/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211124;

/**
 *
 * @author xvpow
 */
public class Ch1_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //switch 的參數 可放的類型
        //byte short int String char enum
        int action = 1;
        final int PLAYING = 1,STOP = 2,SAVE =3 ;
        switch(action){
             default:
                   System.out.println("錯誤");
                break;
            case PLAYING:
                System.out.println("播放");
                break;
            case STOP: 
                System.out.println("暫停");
                break;
            case SAVE:
                 System.out.println("存檔");
                break;
           
        }
        
        
    }
    
}
