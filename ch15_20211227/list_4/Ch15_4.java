/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20211227.list_4;

import java.util.ArrayList;


public class Ch15_4 {

    public static void main(String[] args) {
       Item i1 = new Item(5,"V1");
       Item i2 = new Item(8,"V2");
       Item i3 = new Item(9,"V3");
       Item i4 = new Item(15,"V4");
       Item i5 = new Item(7,"V5");
       Item i6 = new Item(8,"V2");
       
       ArrayList<Item> list = new ArrayList();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        
       list.forEach(v->System.out.print(v+" "));
       System.out.println();
       //id 一樣 name 一樣
       System.out.println(i6.equals(i2));
       System.out.println(list.contains(i6));
       list.remove(i6);
       //使用equals來比較
       System.out.println(list);
       
    }
    
}
