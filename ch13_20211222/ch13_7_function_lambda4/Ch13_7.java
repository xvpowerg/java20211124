/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20211222.ch13_7_function_lambda4;
import java.util.function.Function;
public class Ch13_7 {
    public static void main(String[] args) {
       //Function 轉換  字串 轉成 字串長度
       Function<String,Integer> fun1 = new Function<>(){
           public Integer apply(String data){
               return data.length();
           }       
       };
       System.out.println(fun1.apply("abcde"));
         Function<String,Integer> fun2 =  (String s1) ->{         
             return s1.length();
         };
      System.out.println(fun2.apply("qwertyui"));
      
      Function<String,Integer> fun3 = s1->s1.length();
      System.out.println(fun3.apply("qwertyui"));
    }
    
}
