/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220114.ch23_1_stream1;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch23_1 {
    public static void main(String[] args) {
        // TODO code application logic here
          ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(5);
            list.add(12);
            list.add(7);
            list.add(8);
            list.add(2);
      
     int ans = list.stream().parallel().reduce(0, (v1,v2)->{
            System.out.println("v1+v2:"+v1+":"+v2);            
          return v1 + v2;
      }, (c1,c2)->{
          System.out.println("c1+c2:"+c1+":"+c2);
          return c1+c2;
      });
     System.out.println(ans);
    }
    
}
