/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20211227.list_3;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch15_3 {
    static boolean remove(Integer i){
        if (i == 6) return true;
        else return false;        
    }
    static void test1(){
        //使用匿名內部類
            ArrayList<Integer> list3 = new ArrayList();
            list3.add(5);
            list3.add(4);
            list3.add(6);
            list3.add(8);
            list3.add(6);
            list3.add(9);

            list3.removeIf(new Predicate<Integer>(){
                public boolean test(Integer v){
                   return v%2 == 0;
                }
            });
            System.out.println(list3);
    }
    
     static void test2(){
         //使用lambda
            ArrayList<Integer> list3 = new ArrayList();
            list3.add(5);
            list3.add(4);
            list3.add(6);
            list3.add(8);
            list3.add(6);
            list3.add(9);
            
            list3.removeIf(v->v %2 != 0);
            System.out.println(list3);
    }
     
     static void test3(){
          ArrayList<Integer> list3 = new ArrayList();
            list3.add(5);
            list3.add(4);
            list3.add(6);
            list3.add(8);
            list3.add(6);
            list3.add(9);
            list3.removeIf(Ch15_3::remove);
            System.out.println(list3);
     }
      static void test4(){
            ArrayList<Integer> list3 = new ArrayList();
            list3.add(5);
            list3.add(4);
            list3.add(6);
            list3.add(8);
            list3.add(6);
            list3.add(9);
            
            list3.replaceAll(new UnaryOperator<Integer>(){
                public Integer apply(Integer v){
                       return v + 5;
                }
            });
            System.out.println(list3);
      }
      static void test5(){
            ArrayList<Integer> list3 = new ArrayList();
            list3.add(5);
            list3.add(4);
            list3.add(6);
            list3.add(8);
            list3.add(6);
            list3.add(9);
            
            list3.replaceAll(v->v * 2);
            System.out.println(list3);
      }
      static Integer  replaceAll(Integer i){
          return i -3;
      }
      static void test6(){
            ArrayList<Integer> list3 = new ArrayList();
            list3.add(5);
            list3.add(4);
            list3.add(6);
            list3.add(8);
            list3.add(6);
            list3.add(9);
            
            list3.replaceAll(Ch15_3::replaceAll);
            System.out.println(list3);
      }
    public static void main(String[] args) {
 
        //test1();
        //test2();
         // test3();
        //test4();
        //test5();
        test6();
    }
    
}
