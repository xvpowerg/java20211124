/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20211227.list_5;
import java.util.LinkedList;

public class Ch15_5 {

    public static void main(String[] args) {
        //刪除中間 插入中間 快!
        LinkedList<String> list = new LinkedList<>();
        list.add("Howard");
        list.add("Vivin");
        list.add("Lindy");
        list.add("Lucy");
        
        list.forEach(v->System.out.print(v+" "));
        
        
        
    }
    
}
