/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20210103.ch18_6_map6;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch18_6 {
    
    public static void main(String[] args) {
       HashMap<String,Integer> map = new HashMap<>();
       map.put("Ken", 72);
       map.put("Vivin", 85);
       map.put("Lucy", 63);
       map.put("Iris", 92);
       //key 存在 把key放到k 把對映value放到v
        //key 不存在 把key放到k 把null放到v
       map.compute("Ken", (k,v)->{
            System.out.println(k+":"+v);
           return 10;
       } );
      System.out.println(map);
       //key 存在computeIfAbsent 不會運行
      map.computeIfAbsent("Ken", (k)->{
          System.out.println("computeIfAbsent!!");
          return 10;
      });
       //key 存在computeIfPresent會運行
       map.computeIfPresent("Ken", (k,v)->{
       System.out.println("computeIfPresent:"+k+":"+v);
       return 56;
       });
                       
    }
    
}
