/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20220107.ch20_2_generic2;
import java.util.List;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Test1<I,T extends List<I>> {        
    public void run1(T t,Consumer<I> c){
        t.forEach(c);
    }
}
