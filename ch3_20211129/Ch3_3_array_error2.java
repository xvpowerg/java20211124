/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20211129;

/**
 *
 * @author xvpow
 */
public class Ch3_3_array_error2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][][] array1 = new int[3][][];
        array1[0] = new int[5][];
        array1[2] = new int[2][3];
       // System.out.println(array1[1][0]);//java.lang.NullPointerException
        //System.out.println(array1[0][0][0]);//java.lang.NullPointerException
        //System.out.println(array1[8][0][0]);//java.lang.ArrayIndexOutOfBoundsException
        //System.out.println(array1[2][2][1]);//java.lang.ArrayIndexOutOfBoundsException

    }
    
}
