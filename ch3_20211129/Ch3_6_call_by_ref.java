/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20211129;

/**
 *
 * @author xvpow
 */
public class Ch3_6_call_by_ref {

    /**
     * @param args the command line arguments
     * call by reference 只要不是基本型態 就是call by reference
     */
    static void swapArray(int[] array1){
        int tmp = array1[0];
       array1[0] = array1[1];
       array1[1] = tmp;
    }
    public static void main(String[] args) {
       int[] array1 = {5,9};
       System.out.printf("a[0]:%d a[1]:%d %n",array1[0],array1[1]);
//       int tmp = array1[0];
//       array1[0] = array1[1];
//       array1[1] = tmp;
        swapArray(array1);
       System.out.printf("a[0]:%d a[1]:%d %n",array1[0],array1[1]);
    }
    
}
