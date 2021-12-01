/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20211201;

/**
 *
 * @author xvpow
 */
public class Ch4_1_Recursive {
    
    static void test1(int x){
        System.out.println("Start:"+x);
        if (x != 5){
            test1(x+1);
        }
        System.out.println("End:"+x);
    }
    
    public static void main(String[] args) {
        
        test1(1);
        
    }
    
}
