/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20211229.ch16_1_likkedlist_1;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 *
 * @author xvpow
 */
public class Ch16_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(25);
        list.add(30);
        list.add(16);
        list.add(61);
        
        list.forEach(v->System.out.print(v+" "));
        System.out.println();
        System.out.println("==================================");
        list.addFirst(85);
        list.addLast(73);
        
        list.forEach(v->System.out.print(v+" "));
        System.out.println();
        System.out.println("==================================");
        
        int first = list.getFirst();
        int last = list.getLast();
        System.out.println(first+":"+last);
        //offer
        BlockingQueue<Integer> bq = new LinkedBlockingQueue(3);
        System.out.println(bq.offer(10));
        System.out.println(bq.offer(25));
        System.out.println(bq.offer(16));
        System.out.println(bq.offer(28));
            
        int peek1 = list.peek();
        System.out.println(peek1);
        int peek2 = list.peek();
        System.out.println(peek2);
        //會移除第一筆
        int po1 =   list.poll();
        System.out.println(po1);
        int po2 =   list.poll();
        System.out.println(po2);
        //FILO 先進後出
        LinkedList<Integer> listStack = new  LinkedList<>();
        listStack.push(10);
        listStack.push(25);
        listStack.push(13);
        listStack.push(27);
        
        System.out.println(listStack);
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack);
        
        
         
    }
    
}
