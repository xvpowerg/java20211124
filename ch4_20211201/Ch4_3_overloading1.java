/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20211201;

/**
 *
 * @author xvpow
 * 多載
 */
public class Ch4_3_overloading1 {

    /**
     * @param args the command line arguments
     * 
     * 多載
     * 方法名稱要一樣  參數的數量 或 類型不一樣
     */
    static void diff(int x,int y,int z ){
        System.out.println(x -y-z);
    }
    static void diff(int x,int y){
        diff(x,y,0);
    }
      static void  diff(int x){
        diff(x,0,0);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        diff(2,5);
        diff(2,5,6);
        diff(7);
       // diff();

    }
    
}
