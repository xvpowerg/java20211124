/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20211229.ch16_2_set1;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch16_2 {

    public static void main(String[] args) {
      //set基本上不會重複
      //HashSet 快!!
      HashSet<String> hashSet = new HashSet();
      hashSet.add("Howard");
      hashSet.add("Ken");
      hashSet.add("Vivin");
      hashSet.add("Ken");
      hashSet.forEach(v->System.out.println(v));
     
      
      boolean b1 = hashSet.contains("Ken");
      System.out.println(b1);
      boolean b2 = hashSet.contains("Lucy");
      System.out.println(b2);
      List<String> searchList = new ArrayList<>();
      searchList.add("Vivin");
      searchList.add("Ken");
      boolean b3 = hashSet.containsAll(searchList);
      System.out.println(b3);
      searchList.add("Lucy");
      boolean b4 = hashSet.containsAll(searchList);
      System.out.println(b4);
      
    }
    
}
