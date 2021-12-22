/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20211222.ch13_8_predicate_lambda5;
import java.util.function.Predicate;
public class Ch13_8 {

    public static void main(String[] args) {
        // TODO code application logic here
        Predicate<Integer> p1 = new Predicate<>(){
            public boolean test(Integer i){
                return i >= 18;
            }
        };
        int age = 18;
        if (p1.test(age)){
            System.out.println("成年!");
        }else{
            System.out.println("未成年!");
        }
        
        Predicate<Integer> p2  = (Integer a)->{
            return a >= 18;
        };
        System.out.println(p2.test(age));
        
        Predicate<Integer>p3 = a->a >= 18;
        System.out.println(p3.test(age));
        
        
        
        
    }
    
}
