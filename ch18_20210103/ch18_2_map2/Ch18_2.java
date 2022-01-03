/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20210103.ch18_2_map2;

import java.util.HashMap;
public class Ch18_2 {

    static int getOrDefault( HashMap<String,Integer> map,String key,int def){
         //containsKey 如果key存在
        if (map.containsKey(key)){
            def = map.get(key);
        }
        return def;
    }
    
    static void putIfAbsent(HashMap<String,Integer> map,String key,int value){
        if (!map.containsKey(key)){
            map.put(key, value);
        }
    }
    public static void main(String[] args) {
     HashMap<String,Integer> map = new HashMap<>();
       map.put("Ken", 72);
       map.put("Vivin", 85);
       map.put("Lucy", 63);
       map.put("Iris", 92);
       
       int value = map.getOrDefault("Vivin", -1);
       System.out.println(value);
       int value2 = map.getOrDefault("Joy", -1);
       System.out.println(value2);
       
      value =getOrDefault(map,"Vivin", -1);
      System.out.println(value);
         value =getOrDefault(map,"Joy", -1);
        System.out.println(value);  
        
        //假設Key重複 put會發生什麼事?
         map.put("Vivin",125 );
         System.out.println(map.get("Vivin"));
         //當Lucy不存在時 改為92
         map.putIfAbsent("Lucy", 92);
         System.out.println(map.get("Lucy"));
        
        putIfAbsent(map,"Iris",71);
        System.out.println(map.get("Iris"));
         putIfAbsent(map,"Ben",71);
         System.out.println(map.get("Ben"));
    }
    
}
