/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20211129;

/**
 *
 * @author xvpow
 * 函數
 */
public class Ch3_4_function1 {
    
    //函數的必要條件
    //必須填回傳值 void 表示無回傳值
    //函數名稱
    //() 傳入參數位置
    //{}函數本體
    
    static void test1(){
        System.out.println("Test1");
        return;//就算是void也可return
    }
    static int test2(int x,int y){        
        int ans = x + y;
        return ans;
    }
    
    public static void main(String[] args) {
      test1();
      System.out.println(test2(2,5));
    }
    
}
