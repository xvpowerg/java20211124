/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220110.ch21_4_stream2;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Comparator;
public class Ch21_4 {

    public static void main(String[] args) {
     ArrayList<String> list = new ArrayList<>();
     list.add("Ken");
     list.add("Vivin");
     list.add("Lindy");
     list.add("Iris");
     list.add("Joy");

        
     Optional<String> op1 =  list.stream().parallel().findAny();
     Optional<String> op2 = list.stream().findFirst();
     System.out.println(op1.get());
     System.out.println(op2.get()); 
     
     Optional<String> opt3 =  list.stream().max(Comparator.comparing(v1->v1));
     Optional<String> opt4 =  list.stream().min(Comparator.comparing(v1->v1));
     System.out.println(opt3.get());
     System.out.println(opt4.get());     
    }
    
}

