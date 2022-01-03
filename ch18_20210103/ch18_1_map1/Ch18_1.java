/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20210103.ch18_1_map1;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
public class Ch18_1 {

    public static void main(String[] args) {
       HashMap<String,Integer> map = new HashMap<>();
       map.put("Ken", 72);
       map.put("Vivin", 85);
       map.put("Lucy", 63);
       map.put("Iris", 92);
       System.out.println(map.get("Lucy"));
       System.out.println(map.get("Ben"));
       
       map.forEach((k,v)->System.out.println(k+":"+v));
        System.out.println("========================");
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            int value = map.get(key);
            System.out.println(key+":"+value);
        }
        System.out.println("========================");
       Set<Entry<String,Integer>> entrySet = map.entrySet();
       for (Entry<String,Integer> ent: entrySet){
           System.out.println(ent.getKey()+":"+ent.getValue());
       }
    }
    
}
