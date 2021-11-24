/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211124;

/**
 *for loop
 * @author xvpow
 */
public class Ch1_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        
        for (int i = 1,k=5; i <= 10 && k >=1; i++,k--)
            System.out.print(i+"_"+k+" ");
        
        System.out.println();
    }
    
}
