/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20211229.ch16_5_treeSet2;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch16_5 {

 
    public static void main(String[] args) {
     TreeSet<Integer> treeSet  = new TreeSet(new Comparator<Integer>(){
         //小到大
         //a1 大於 a2 回傳正數
         //a1 小於 a2 回傳負數
         //a1 等於 a2 回傳0
                public int compare(Integer a1,Integer a2){
                    if (a1 > a2){
                        return 1;
                    }else if (a1 < a2){
                        return -1;
                    }
                    return 0;
                }
     
     });
     treeSet.add(10);
     treeSet.add(5);
     treeSet.add(9);
     treeSet.add(6);
     treeSet.add(8);
     treeSet.add(2);
     
     treeSet.forEach(v->System.out.print(v+" "));
     
    }
    
}
