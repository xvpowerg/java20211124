/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211124;

/**
 *
 * 一元運算子
 */
public class Ch1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        int index = count++;
        System.out.println(index);
        System.out.println(count);
        int y = ++count;
        System.out.println(y);
        System.out.println(count);
        
        int i = 0;
        
        int x = 3 + ++i + i++ +2 - i--;
           //   3 + 1   + 1 + 2 - 2
        System.out.println(x);
        System.out.println(i);
        
        
    }
    
}
