/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220112.ch22_1_stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.TreeSet;
public class Ch22_1 {

    public static void main(String[] args) {
     List<String> list = new ArrayList<>();
     list.add("Ken");
     list.add("Vivin");
     list.add("Lindy");
     list.add("Iris");
     list.add("Joy");
     list.add("Ken");
     list.add("Joy");
     list.add("Ben");
     
    List<String> fList = 
            list.stream().filter(v->v.length() > 3).collect(Collectors.toList());
     System.out.println(fList);
     
    Set<String> fSet =  list.stream().filter(v->v.length() < 4).collect(Collectors.toSet());
       System.out.println(fSet);
       
      TreeSet<String> treeSet =  list.stream().collect(Collectors.toCollection(TreeSet::new));
      System.out.println(treeSet);
      List<String> clist = list.stream().map(String::toUpperCase).
              collect(Collectors.toCollection(ArrayList::new));
      //List的內容都轉大寫
      System.out.println(clist);
    }
    
}
