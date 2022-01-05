/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20220105.ch19_6_generic2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_6 {
    static void test1(ArrayList<Test1> list){
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        Test3 t3 = new Test3();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.forEach(v->System.out.println(v));
    }
    //? extends Test1 表示 所有繼承Test1 的泛型都可放入
    //? extends Test1 不能新增 用來讀取
    static void test2(ArrayList<? extends Test1> list){
      for (Test1 t1 : list){
          System.out.println(t1);
      }
    }
    static void test3(ArrayList<? super Test2> list){
        
    }
    public static void main(String[] args) {
       //泛型規則
       //一般而言參數必須接受一樣泛型的數值
        ArrayList<Test1> list = new ArrayList();
        test1(list);
//       ArrayList<Test2> list2 = new ArrayList();
//        test1(list2);
        
        ArrayList<Test2> list3 = new ArrayList();
        ArrayList<Test3> list4 = new ArrayList();
        ArrayList<Test1> list5 = new ArrayList();
        System.out.println("===================================");
        list3.add(new Test2());
        list3.add(new Test3());
        test2(list3);
        test2(list4);
        
        test3(list5);
        //test3(list4);
        test3(list3);
        
    }
    
}
