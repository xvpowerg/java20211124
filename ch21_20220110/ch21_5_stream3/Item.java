/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20220110.ch21_5_stream3;

/**
 *
 * @author xvpow
 */
public class Item {
    private String data1;
    private int data2;
    
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
    public String toString(){
        return data1+":"+data2;
    }
}
