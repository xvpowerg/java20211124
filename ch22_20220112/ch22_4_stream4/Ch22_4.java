/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220112.ch22_4_stream4;

import ch22_20220112.ch22_3_stream3.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch22_4 {
    
    public static void main(String[] args) {
        
       Item itm1 = new Item("A",10);
       Item itm2 = new Item("B",15);
       Item itm3 = new Item("C",35);
       Item itm4 = new Item("D",76);
       Item itm5 = new Item("E",82);
       
       ArrayList<Item> list = new ArrayList();
       list.add(itm1);
       list.add(itm2);
       list.add(itm3);
       list.add(itm4);
       list.add(itm5);
       
      Map<Boolean,List<Item>> groupMap =
              list.stream().collect(Collectors.partitioningBy(v->v.getValue2() > 40));
      System.out.println(groupMap);
      
       ArrayList<String> strList = new ArrayList();
       strList.add("Ken");
       strList.add("Vivin");
       strList.add("Lucy");
       strList.add("Joy");
       
     String str2 =  strList.stream().
                     collect(Collectors.joining(",","title:","."));
     
     System.out.println(str2);
     
     String  jointStr = list.stream().map(it->it.toString()).collect(Collectors.joining(","));
     System.out.println(jointStr);
     
   Optional<Item> obj =  list.stream().
             collect(Collectors.maxBy(Comparator.comparing(it->it.getValue2())));
   
   if (obj.isPresent()){
       System.out.println(obj.get());
   }
   
    }
    
}
