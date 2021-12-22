/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20211222.ch13_2_inner2;

/**
 *
 * @author xvpow
 */
public class Ch13_2 {
    public static void main(String[] args) {
        int count = 0;
       //count++;
       //匿名內部類 無法更新區域變數 因為匿名內部類會將區域變數改為常數
       TestIF tif = new TestIF(){
            public void run(){
               for (int i =1;i<=10;i++){
                   System.out.print(i+" ");
               }     
               //count++;
               System.out.println(count);
            }
       };
       
       tif.run();
    }
    
}
