/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20220107.ch20_6_stream3;
import java.util.ArrayList;
import java.util.stream.Stream;
public class Ch20_6 {

    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(62);
       list.add(100);
        list.add(85);
        list.add(51);
        list.add(26);
       
        boolean b1 = list.stream().allMatch(v->{
                System.out.print(v+" ");
                return v > 10;
        });
        System.out.print(b1);
        System.out.println("\n=================");
        //短路
        //allMatch 只要回傳false就短路
       boolean b2 = list.stream().allMatch(v->{
            System.out.print(v+" ");
            return v != 85;});
       System.out.println(b2);
         System.out.println("\n=================");
         //anyMatch 短路 條件成立 回傳是true 就短路
        list.stream().anyMatch(p->{
            System.out.println("any:"+p);
        return p< 60;
        });
         System.out.println("=================");
         //noneMatch 短路 條件成立 回傳是false 就短路
       boolean b3 =  list.stream().noneMatch(v->{
           System.out.println("noneMatch v:"+v);
           return v > 80;});
       System.out.println(b3);
    }
    
}


