/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211124;

/**
 *
 * @author xvpow
 * 討論等於
 */
public class Ch1_6 {

    public static void main(String[] args) {
        int x = 10,y = 10;
        String st1 = "Ken",st2 = "Ken";
        String st3 = new String("Ken");
        System.out.println(x == y);
        System.out.println(st1 == st2);
        System.out.println(st1 == st3);//不要用在非基本型態
        System.out.println(st1.equals(st3));//是否為相同的字
        
    }
    
}
