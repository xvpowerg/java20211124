/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20211227.list_2;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch15_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(12);
        list.add(17);
        list.add(8);
        ArrayList<Integer> list2 = new ArrayList();
        list2.add(250);
        list2.add(370);
        list2.add(470);
        
        //合併再一起的感覺
        list.addAll(list2);
        System.out.println(list);
        //contains 查看是否有某元素 如果有回傳true
        System.out.println(list.contains(17));
        System.out.println(list.contains(25));
        //因為沒有 100這樣的index IndexOutOfBoundsException 
        //list.get(100);   
        int index1 = list.indexOf(8);
        //找到了就回傳相對應的index
        System.out.println(index1);
        //找不到index就回傳-1
        int index2 = list.indexOf(525);
        System.out.println(index2);
        //isEmpty 是否為空的List
        System.out.println(list.isEmpty());
       ArrayList<Integer> list3 = new ArrayList();
       list3.add(5);
       list3.add(4);
       list3.add(6);
       list3.add(8);
       list3.add(6);
       list3.add(9);
       //由右往左數index
        System.out.println(list3);
        System.out.println(list3.indexOf(6));
        System.out.println(list3.lastIndexOf(6));
        Integer v1 = 250;
        //list.remove(Integer.valueOf(250));
        list.remove(v1);        
        System.out.println("list:"+list);
        //removeAll
        ArrayList<Integer> delArray = new ArrayList<>();
        delArray.add(5);
        delArray.add(8);
        delArray.add(370);
        System.out.println("dellist:"+delArray);
        list.removeAll(delArray);
        System.out.println("removeAll list:"+list);


         
    }
    
}
