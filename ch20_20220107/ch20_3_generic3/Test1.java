/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20220107.ch20_3_generic3;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Test1 {
    
    public static <T> void method1(T t){
        System.out.println(t);
    }
    
    public static<T extends Exception> T getException(Supplier<T> s){
        return s.get();
    }
}
