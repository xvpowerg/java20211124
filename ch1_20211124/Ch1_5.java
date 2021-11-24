/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211124;

/**
 *
 * @author xvpow
 * 邏輯運算
 */
public class Ch1_5 {

    public static void main(String[] args) {
        //&& and 兩邊為真才為真
        //|| or  單邊為真就是真
        //! not 唱反調
        //^ xor 一真一假才為真
        boolean b1 = true,b2 = false;
        System.out.println(b1 && b2);
        System.out.println(b1 || b2);
        System.out.println(b1 ^  b2);
        System.out.println(!b2);
        
        //短路現象 達到條件不往右邊執行
        //好處效能提升
        int i = 0;
      //&& 左邊是false不往右
        boolean b3 = i > 10 && ++i > 0;
        System.out.println(i);
        //|| 左邊是true不往右
        b3 = i < 10 || ++i > 0; 
        System.out.println(i);
    }
    
}
