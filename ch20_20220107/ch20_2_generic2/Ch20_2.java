/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20220107.ch20_2_generic2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch20_2 {

    public static void main(String[] args) {
        Test1<String,ArrayList<String>> t1 = new Test1();
       ArrayList<String> list = new  ArrayList<>();
       list.add("A");
       list.add("B");
       list.add("C");
       list.forEach(v->System.out.println(v));
        
    }
    
}
