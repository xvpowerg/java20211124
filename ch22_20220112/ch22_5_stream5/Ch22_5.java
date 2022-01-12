/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220112.ch22_5_stream5;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch22_5 {
    
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(5);
            list.add(12);
            list.add(7);
            list.add(8);
            list.add(2);
         Optional<Integer> optional =    list.stream().reduce((v1,v2)->{
                System.out.println(v1+":"+v2);
                return v1 + v2;
            });
         System.out.println(optional.get());
       System.out.println("================================");
       int v = list.stream().reduce(25, (v1,v2)->{
                    System.out.println(v1+":"+v2);
                    return v1+v2;
       });
       System.out.println(v);
        
    }
    
}
