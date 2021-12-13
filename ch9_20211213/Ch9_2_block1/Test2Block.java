/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20211213.Ch9_2_block1;

/**
 *
 * @author xvpow
 */
public class Test2Block {
    //靜態屬性的初始化使用靜態區塊    
    private static int[] array = new int[20];
    static{
      for (int i = 0; i < array.length;i++){
            array[i] = -1;
        }
    }
    Test2Block(){
      
    }
    
    public static void printArray(){
        for (int v : array){
            System.out.println(v);
        }
    }
    
    
}
