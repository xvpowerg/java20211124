/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20211126;
import java.util.stream.IntStream;
public class Ch2_2 {
    //陣列
    //可以存放多的數值
    public static void main(String[] args) {
        int[] scores = new int[5];
        scores[1] = 60;
        scores[3] = 75;
        scores[4] = 80;
        int i = 1;
        System.out.println(scores[3]);
        System.out.println(scores[i++]);
        System.out.println(scores[i]);
        
        for (int x =0;x<scores.length;x++){
            System.out.print(scores[x]+" ");
        }
          System.out.println();
//       for (int y = 0;y < scores.length;y++){
//           int v = scores[y];
//           System.out.print(v+" ");
//       }  
//foreach
        for (int v : scores){
            System.out.print(v+" ");   
        }
       System.out.println();
       
       IntStream.of(scores).forEach(System.out::println);
    }
    
}
