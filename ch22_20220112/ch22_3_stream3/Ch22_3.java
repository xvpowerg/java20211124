/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220112.ch22_3_stream3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author xvpow
 */
public class Ch22_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item itm1 = new Item("A",10);
       Item itm2 = new Item("B",15);
       Item itm3 = new Item("C",35);
       Item itm4 = new Item("D",76);
       Item itm5 = new Item("E",82);
       
       Item itm6 = new Item("D",16);
       Item itm7 = new Item("E",89);
       Item itm8 = new Item("D",36);
       Item itm9 = new Item("E",32);
       Item itm10 = new Item("B",72);
       
       ArrayList<Item> list = new ArrayList();
       list.add(itm1);
       list.add(itm2);
       list.add(itm3);
       list.add(itm4);
       list.add(itm5);
       list.add(itm6);
       list.add(itm7);
       list.add(itm8);
       list.add(itm9); 
       list.add(itm10); 
       
     Map<Integer,List<Item>>  map1 =  
             list.stream().collect(Collectors.groupingBy(v->v.getValue2()/10));
      System.out.println(map1);
      
     Map<Integer,Map<String,List<Item>>> map2 = list.stream().
             collect(Collectors.groupingBy(v->v.getValue2()/10,
                Collectors.groupingBy(v->v.getValue1())));
     System.out.println(map2);
     
    Map<Integer,Long> countMap = 
            list.stream().collect(Collectors.groupingBy(v->v.getValue2()/10, 
                                    Collectors.counting()));
    System.out.println(countMap);
     
     
    }
    
}
