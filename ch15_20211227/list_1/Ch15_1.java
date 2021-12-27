/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20211227.list_1;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Ch15_1 {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(12);
        list.add(17);
        list.add(8);
        
        for (int v : list){
            System.out.print(v+" ");
        }
        
        System.out.println();
        for(int i = 0; i < list.size();i++){
            System.out.print(list.get(i)+" ");
        }
          System.out.println();
          
       list.forEach(new Consumer<Integer>(){
            public void accept(Integer v){
                System.out.print("accept:"+v+" ");
            }       
       });
       System.out.println();
       list.forEach(v->System.out.print(v+" "));
        System.out.println();
       list.forEach(System.out::println);
    }
    
}
