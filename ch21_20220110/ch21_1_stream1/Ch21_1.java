/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220110.ch21_1_stream1;
import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch21_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<String> list = new ArrayList<>();
     list.add("Ken");
     list.add("Vivin");
     list.add("Lindy");
     list.add("Iris");
     list.add("Joy");
     list.add("Iris");
     list.add("Iris");
     
     long count = list.stream().filter(n->n.length() > 3).count();
     System.out.println(count);
     list.stream().distinct().forEach(v->System.out.print(v+" "));
     System.out.println();
     System.out.println(list);
     list.stream().limit(3).forEach(v->System.out.print(v+" "));
          System.out.println();
      list.stream().skip(2).forEach(v->System.out.print(v+" "));
       System.out.println();
    }
    
}
