/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220110.ch21_6_stream4;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch21_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<Item<String>> list = new ArrayList<>();
     Item<String> i1 = new Item("A",10);
     i1.add("A_1");
     i1.add("A_2");
     i1.add("A_3");     
     Item<String> i2 = new Item("B",10);
     i2.add("B_1");
     i2.add("B_2");
     i2.add("B_3");
     Item<String> i3 = new Item("C",10);
     i3.add("C_1");
     i3.add("C_2");  
     i3.add("C_3");
     
     list.add(i1);
     list.add(i2);
     list.add(i3);
     //i3.getData3().add("C_4");
     //System.out.println(i3.getData3());
       // list.stream().map(it->it.getData3()).for;
       //flatMap 可以把Stream展開
     list.stream().flatMap(it->it.getData3()).forEach((v)->System.out.println(v));
      //list.stream().flatMapToInt(it->IntStream.of(it.getData2()));
    }
    
}

