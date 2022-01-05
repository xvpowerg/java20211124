/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20220105.ch19_3_map3;
import java.util.TreeMap;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      TreeMap <Item,String> tMap = new TreeMap<>();
        
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
       
        TreeMap <Integer,Item> tMap = new TreeMap<>();
        
         for (Item i : array){
            tMap.put(i.getV2(), i);
        }
        
        System.out.println(tMap);
    }
    
}
