/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20211129;

/**
 *
 * @author xvpow
 */
public class Ch3_6_call_by_value {

    /**
     * @param args the command line arguments
     * 有一個變數傳入函數此變數是否可被改變?
     * call by value 不會改變
     * 所有基本型態都是call by value
     */
    
    static void swap(int x ,int y){
          int tmp = x;
        x = y;
        y = tmp;
        System.out.printf("swap x:%d y:%d%n",x,y);
    }
    public static void main(String[] args) {
       
        int x=10,y=65;
        System.out.printf("x:%d y:%d%n",x,y);
//        int tmp = x;
//        x = y;
//        y = tmp;
        swap(x,y);//call by value
        System.out.printf("x:%d y:%d%n",x,y);
    }
    
}
