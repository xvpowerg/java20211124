/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20220107.ch20_5_stream2;
import java.util.stream.Stream;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch20_5 {
    //同一個 Stream 不可重複使用
    //Stream 有分惰性(lazy)不會被執行 與  終端(terminal)會執行
    //Stream 不會修改來源
  
    public static void main(String[] args) {
        // TODO code application logic here
      Stream<String>  st1 =    Stream.of("A","B","C");
      st1.forEach(v->System.out.println(v));
      System.out.println("========================");
      //st1.forEach(v->System.out.println(v));//Stream 不可重複使用
      ArrayList<String> nameList = new ArrayList<>();
      nameList.add("Ken");
      nameList.add("Vivin");
      nameList.add("Join");
      
      nameList.stream().filter(v->{
            System.out.println("filter 1:"+v);
          return v.length() > 2;
      });
       System.out.println("========================");
       nameList.stream().filter(v->{
            System.out.println("filter 2:"+v);
          return v.length() > 2;
      }).count();
          System.out.println("========================");
       
       nameList.stream().filter(n->n.length() > 3).
               forEach(v->System.out.println(v));
       System.out.println(nameList);
    }
    
}
