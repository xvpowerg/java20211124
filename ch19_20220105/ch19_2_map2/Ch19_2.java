/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20220105.ch19_2_map2;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch19_2 {
    
    public static void main(String[] args) {
        HashMap<Item,Integer> map = new HashMap<>();
        Item i1 = new Item("A",100);
        Item i2 = new Item("B",200);
        Item i3 = new Item("A",100);
        Item i4 = new Item("C",300);
        Item i5 = new Item("B",200);
        
        map.put(i1, i1.getV2());
        map.put(i2, i2.getV2());
        map.put(i3, i3.getV2());
        map.put(i4, i4.getV2());
        map.put(i5, i5.getV2());
        System.out.println(map);
        
        
        
    }
    
}
