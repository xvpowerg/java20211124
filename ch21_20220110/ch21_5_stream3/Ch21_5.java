/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220110.ch21_5_stream3;
import java.util.ArrayList;
import java.util.OptionalInt;
public class Ch21_5 {    
    public static void main(String[] args) {
     ArrayList<String> list = new ArrayList<>();
     list.add("Ken");
     list.add("Vivin");
     list.add("Lindy");
     list.add("Iris");
     list.add("Joy");
     
    //轉換功能!
    list.stream().map(s->new Item(s,s.length())).forEach(it->System.out.println(it));
    OptionalInt maxOpt = list.stream().mapToInt(s->s.length()).max();
    System.out.println(maxOpt.getAsInt());
    
    }
    
}
