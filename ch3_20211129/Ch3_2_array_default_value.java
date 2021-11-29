/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20211129;

public class Ch3_2_array_default_value {

    public static void main(String[] args) {
        //很重要背起來!!!
       //基本型態類型 會有特別預設值
       //整數 0
       //浮點數 0.0
       //字元 空白字元
       //布林 false
       int[] array1 = new int[5];
       float[] array2 = new float[5];
       char[] array3 = new char[5];
       boolean[] array4 = new boolean[5];
       System.out.println(array1[0]);
       System.out.println(array2[0]);
       System.out.println(array3[0]);
       System.out.println(array4[0]);       
     System.out.println("========================");
     //非基本型態預設值都為null
     String[]array5 = new String[3];
        System.out.println("array5:"+array5[0]);
        
    }
    
}

