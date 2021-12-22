/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20211222.ch13_5_consumer_lambda2;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch13_5 { 
    public static void main(String[] args) {
        // TODO code application logic here
        
        Consumer<String> c1 = (String s1)->{
            String result = s1.toUpperCase();
            System.out.println(result);
        };        
        c1.accept("ken");
        
       Consumer<String> c2 =(s2)->{
           String reuslt = s2.toLowerCase();
           System.out.println(reuslt);
       };
       c2.accept("Vivin");
       //因為參數只有一個可以不加()
       //因為指令只有一個 可以不加{}
       Consumer<String> c3 = s3->System.out.println(s3.toUpperCase());
       c3.accept("Lucy");
    }
    
}
