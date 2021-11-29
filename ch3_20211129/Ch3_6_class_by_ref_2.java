/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20211129;

/**
 *
 * @author xvpow
 */
public class Ch3_6_class_by_ref_2 {
    static void testString(String name1,String name2){
         String tmp = name1;
        name1 = name2 ;
        name2 = tmp;
    }
    public static void main(String[] args) {
      String name1 = "Ken";
            name1= "Joy";
      String name2 = "Vivin";
//      String tmp = name1;
//      name1 = name2 ;
//      name2 = tmp;
        testString(name1,name2);
      System.out.println(name1+":"+name2);
              
      
    }
    
}
