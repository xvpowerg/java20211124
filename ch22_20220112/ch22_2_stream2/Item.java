/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20220112.ch22_2_stream2;

/**
 *
 * @author xvpow
 */
public class Item {
    private String value1;
    private int value2;
    
    public Item(String value1,int value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public String getValue1(){
        return this.value1;
    }
    
    public int getValue2(){
        return this.value2;
    }
    
    public String toString(){
        return this.value1+":"+this.value2;
    }
}
