/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20210103.ch18_5_map5;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch18_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<String,Integer> map = new HashMap<>();
       map.put("Ken", 72);
       map.put("Vivin", 85);
       map.put("Lucy", 63);
       map.put("Iris", 92);
       //假設key存在  就將舊數值放入ov1 新值放入nv2
       //回傳值 會覆蓋相對應key的value
       map.merge("Vivin", 20, (ov1,nv2)->{
           System.out.println(ov1+":"+nv2);
       return ov1 - nv2 ;
       });
       //假設key不存在  新增
       System.out.println(map);
         map.merge("Joy", 68, (ov1,nv2)->{
           System.out.println(ov1+":"+nv2);
       return ov1 - nv2 ;
       });
            System.out.println(map);
    }
    
}
