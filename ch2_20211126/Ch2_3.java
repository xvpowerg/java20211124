/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20211126;
import java.util.Arrays;
/**
 *
 * @author xvpow
 * 排序
 */
public class Ch2_3 {

   
    public static void main(String[] args) {
        int[] array1 = {8,9,11,3,6};
        //小到大
        Arrays.sort(array1);//排序
        //使用foreach 迴圈方式輸出
        for (int v : array1){
            System.out.print(v+" ");
        }
        System.out.println();
        
        //字典序排法
        
        //ABC
        //abc
        //數字 < 大寫 < 小寫
        String[] name = {"kne","apple","Zen","123"};
        Arrays.sort(name);
        for (int i= 0;i < name.length;i++){
            System.out.print(name[i]+" ");
        }
        
        
    }
    
}
