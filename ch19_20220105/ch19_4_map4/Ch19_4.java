/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20220105.ch19_4_map4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

/**
 *
 * @author xvpow
 */
public class Ch19_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comparator<Item> cmp = Comparator.comparing((it)->it.getV2());
        cmp = cmp.thenComparing(it ->it.getV1());
        //cmp.reversed()        
      TreeMap<Item,String> treeMap = new TreeMap(cmp);
        Item i1 = new Item("A",100);
        Item i2 = new Item("B",200);
        Item i3 = new Item("A",600);
        Item i4 = new Item("C",300);
        Item i5 = new Item("B",500);
        ArrayList <Item> array = new ArrayList<>();
        array.add(i1);
        array.add(i2);
        array.add(i3);
        array.add(i4);
        array.add(i5);
        for (Item it : array){
              treeMap.put(it, it.getV1());
        }
        System.out.println(treeMap);
        
        
    }
    
}
