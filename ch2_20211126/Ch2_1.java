/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20211126;

/**
 *
 * @author xvpow
 */
public class Ch2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Start!");
        tag1:          
        for(int i = 1; i<= 3;i++){
            System.out.println("start i:"+i);
            for (int k = 1; k<=2;k++){
                 System.out.println("start k:"+k);
                 //if (i==2) break;
                // if (i==2) continue;
                //if (i==2) break tag1;
                if (i==2) continue tag1;
                 System.out.println("end k:"+k);
            }             
           System.out.println("end i:"+i); 
              System.out.println("=====================");
        }        
        System.out.println("End!");        
    }
    
}
