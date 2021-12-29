/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20211229.ch16_4_treeSet1;
import java.util.TreeSet;
public class Ch16_4 {    
    public static void main(String[] args) {
      TreeSet<Integer> treeSet = new TreeSet<>();
      //預設小到大排序
      treeSet.add(10);
      treeSet.add(15);
      treeSet.add(17);
      treeSet.add(5);
      treeSet.add(9);
      treeSet.forEach(v->System.out.println(v));     
      
      int first = treeSet.first();
      int last = treeSet.last();
      System.out.println(first+":"+last);
      
      int e1 = treeSet.higher(5);//>5
      int e2 = treeSet.ceiling(5);//>=5
              
      int e3 = treeSet.lower(15);//<15
      int e4 = treeSet.floor(15);//<=15
       System.out.println("=======================");
      System.out.println(e1+":"+e2);
      System.out.println(e3+":"+e4);
          System.out.println("=======================");
      int e5 = treeSet.higher(16);//>16
      int e6 = treeSet.ceiling(16);//>=16
      System.out.println(e5+":"+e6);
      int e7 = treeSet.lower(6);//<6
      int e8 = treeSet.floor(6);//<=6
     System.out.println(e7+":"+e8);
    //找不到回傳null 自動解封箱 所以會拋出例外
     Integer e9 = treeSet.floor(2);//<=2
      System.out.println(e9);
      
    }    
}
