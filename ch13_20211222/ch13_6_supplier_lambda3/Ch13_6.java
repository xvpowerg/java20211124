/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20211222.ch13_6_supplier_lambda3;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Ch13_6 {
    
    static void print(String[] array){
        for(String s : array){
            System.out.println(s);
        }
        System.out.println("==========================");
    }
    public static void main(String[] args) {
       
        Supplier<String[]> sup1 = new Supplier(){
            public String[ ] get(){
                return new String[]{"Ken","Vivin","Lucy"};                
            }        
        };
        print(sup1.get());
        
        Supplier<String[]> sup2 = ()->{
            return new String[]{"Ken","Vivin","Lucy"};
        };        
        print(sup2.get());
        
        Supplier<String[]> sup3  = ()->new String[]{"Iris","Joye","Momo"};
        print(sup3.get());
        
        
        
         
         
         
    }
    
}
