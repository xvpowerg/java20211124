/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220112.ch22_2_stream2;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.TreeMap;
public class Ch22_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item itm1 = new Item("A",10);
       Item itm2 = new Item("B",15);
       Item itm3 = new Item("C",35);
       Item itm4 = new Item("D",76);
       Item itm5 = new Item("E",82);
       
       Item itm6 = new Item("D",26);
       Item itm7 = new Item("E",77);
       Item itm8 = new Item("E",41);
       
       ArrayList<Item> list = new ArrayList();
       list.add(itm1);
       list.add(itm2);
       list.add(itm3);
       list.add(itm4);
       list.add(itm5);
       list.add(itm6);
       list.add(itm7);
       list.add(itm8);
       
//      Map<String,Item> map =  list.stream().collect(
//              Collectors.toMap(it->it.getValue1(),
//               (v)->v));
  //System.out.println(map);    
  
  Map<String,Item> map2 =  list.stream().collect(
              Collectors.toMap(it->it.getValue1(), (v)->v, (ov,nv)->{
              
                  Item item = new Item(ov.getValue1(),
                                      ov.getValue2()+nv.getValue2());
                  return item;
              },TreeMap::new));
  

     
      System.out.println(map2);
    }
    
}

