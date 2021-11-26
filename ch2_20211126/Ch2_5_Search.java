/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20211126;

import java.util.Arrays;

/**
 *
 * @author xvpow
 */
public class Ch2_5_Search {

   
    public static void main(String[] args) {
        int[] array1 = {8,1,2,5,6,7,3};
        int target = 9;
        for(int i = 0; i< array1.length;i++){
            if (array1[i] == target){
                System.out.println(i);
                break;
            }else if(i == array1.length -1){
                System.out.println(-1);
               break;
            }            
        }
   
        //如果有6幫我印出index
        //如果找不道幫我印出-1
        
        //二分搜尋一定要先排序
        //100%考
        int[] array2 = {31,45,5,26,15};
        Arrays.sort(array2);
        //5 15 26 31 45 
        int index = Arrays.binarySearch(array2,5);
        System.out.println(index);
        //找不到
        //比所有都小 -1
        index = Arrays.binarySearch(array2,1);
        System.out.println(index);
        //比所有都大 -1 * 陣列長度
          index = Arrays.binarySearch(array2,100);
          System.out.println(index);
        //在中間
        index = Arrays.binarySearch(array2,8);//找靠近目標數最大數值的長度 *-1
        System.out.println(index);
    }
    
}
