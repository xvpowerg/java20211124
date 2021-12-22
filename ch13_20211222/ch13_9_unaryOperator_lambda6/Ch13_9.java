/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20211222.ch13_9_unaryOperator_lambda6;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch13_9 {

    public static void main(String[] args) {
        // TODO code application logic here
        UnaryOperator<Integer> uop1 = new UnaryOperator<>(){
                public Integer apply(Integer i){
                    return i + 5;
                }
        };
        
        System.out.println(uop1.apply(10));
        
        UnaryOperator<Integer> uop2 = (Integer i) ->{
                    return i+10;
        };
        System.out.println(uop2.apply(20));
        
        //+20 精簡寫法
         UnaryOperator<Integer> uop3  = i->i+20;
         System.out.println(uop3.apply(50));
         
    }
    
}
