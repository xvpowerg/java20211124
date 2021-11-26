/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20211126;

/**
 *
 * @author xvpow
 */
public class Ch2_6_NDArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] value1 = new int[2][3];
        value1[0][1] = 50;
        value1[1][0] = 11;
        value1[1][2] = 9;
        
//        for(int i = 0  ; i < value1.length ; i++ ){
//            for (int k = 0; k < value1[i].length;k++){
//                System.out.print(value1[i][k]+" ");
//            }
//                System.out.println();
//        }

            for (int[] a1:value1){
               for (int v : a1){
                   System.out.print(v+" ");
               } 
                 System.out.println();
            }
    }
    
}
