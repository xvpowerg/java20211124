/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20220107.ch20_1_generic1;
import java.util.ArrayList;
public class Ch20_1 {
    //? super 
    //可讀?
    //可寫?
      static void test1(ArrayList< ? super Test2> list){
          for (Object v : list){
              if (v instanceof  Test1){
                  Test1 t1 = (Test1)v;
                  System.out.println(t1);
              }else if(v instanceof  Test2){
                  Test2 t2 = (Test2)v;
                  System.out.println(t2);
              }              
          }
          Test2 obj = new Test2();
          list.add(obj);
          list.forEach(c->System.out.println(c));
      }
      
    public static void main(String[] args) {      
          ArrayList<Test1> list = new ArrayList<>();
          Test1 t1_1 = new Test1();
          Test1 t1_2 = new Test1();
          Test2 t1_3= new Test2();
          list.add(t1_1);
          list.add(t1_2);
          list.add(t1_3);
          test1(list);
          
    }
    
}
