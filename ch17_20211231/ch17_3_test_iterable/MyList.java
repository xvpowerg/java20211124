/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20211231.ch17_3_test_iterable;
import java.util.Iterator;
/**
 *
 * @author xvpow
 */
public class MyList implements Iterable<String>{
   private String[] data = new String[100000];
   private int size = 0;
   private class MyIterator implements Iterator<String>{
       private int index = -1;
       //s=2
       //i=1
       public boolean hasNext(){           
           return size > 0 && index <  size - 1;
       }
       public String next(){
           return get(++index);
       }
   }
   public void add(String value){
       data[size++] =  value;       
   }
   
   public String get(int index){
       return data[index];
   }
   
   public int size(){
       return size;
   }
   
   public Iterator<String> iterator(){
       return new MyIterator();
   }
}
