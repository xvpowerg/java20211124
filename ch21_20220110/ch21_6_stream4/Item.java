/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20220110.ch21_6_stream4;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Item<T> {
    private String data1;
    private int data2;
    private List<T> data3 = new ArrayList();
    
    public void add(T v){
        data3.add(v);
    }
    
    public Item(String data1,int data2){
        this.data1 = data1;
        this.data2 = data2;
    }
    public String getData1(){
            return data1;
    }
    public int getData2(){
        return data2;
    }
   
//       public List<T> getData3(){
//        return data3;
//    }
    public Stream<T> getData3(){
        return data3.stream();
    }
    
    public String toString(){
        return data1+":"+data2;
    }
}
