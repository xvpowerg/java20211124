/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20220105.ch19_5_generic1;

/**
 *
 * @author xvpow
 */
public class Ch19_5 {
    
    public static void main(String[] args) {
        //當我使用才決類型
        MyList<String> list = new MyList();
        list.add("Howard");
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Iris");
        
        System.out.println("get:"+list.get(2));
        list.foreach(v->System.out.println(v));
        
        MyList<Integer> list2 = new MyList();
        list2.add(10);
        list2.add(20);
        list2.add(16);
        list2.foreach(v->System.out.println(v));
        
        
    }
    
}
