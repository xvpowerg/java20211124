/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20220105.ch19_5_generic1;

import java.util.ArrayList;
import java.util.function.Consumer;
public class MyList<T>  {
    private ArrayList<T> list = new ArrayList();
    public T get(int index){
        return list.get(index);
    }
    public void add(T v){        
        list.add(v);
    }
    public void foreach(Consumer<T> cn){
        list.forEach(cn);
    }
}
