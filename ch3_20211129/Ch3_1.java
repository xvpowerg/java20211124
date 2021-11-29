/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20211129;

/**
 *
 * @author xvpow
 * 定義二維陣列的方式
 */
public class Ch3_1 {
    public static void main(String[] args) {
      int[][] a1 = new int[5][2];
      int[] a2[] = new int[5][2]; 
      int a3[][] = new int[5][2]; 
      
      int[][] a4 = new int[5][];
      int[][] a5 = {{2,5,6},
                    {7,8,9,11}  };
      int[][] a6 = new int[][]{
          {2,5,6},
          {9,10}
      };
        
      
      for (int i = 0;i < a5.length;i++){
          for (int k = 0; k < a5[i].length ;k++){
            System.out.print(a5[i][k]+" ");    
          }
          System.out.println();    
      }

      
    }
    
}
