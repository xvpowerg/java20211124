/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20220105.ch19_2_map2;

/**
 *
 * @author xvpow
 */
public class Item {
    private String v1;
    private int v2;
    Item(String v1,int v2){
        this.v1 = v1;
        this.v2 = v2;
    }
    public int getV2(){
        return v2;
    }
    public String  toString(){
        return v1+":"+v2;
    }
    
    public boolean equals(Object obj){
        
        if (obj == null || obj instanceof Item == false){
            return false;
        }
        Item it = (Item)obj;
        
        return this.v2 ==  it.v2 && this.v1.equals(it.v1);
    }
    
    public int hashCode(){
        return this.v2 + this.v1.hashCode();
    }
    
    
}
