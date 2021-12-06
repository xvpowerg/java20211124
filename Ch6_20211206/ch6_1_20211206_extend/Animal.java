/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_1_20211206_extend;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
    private int height;
    private float weight;
    Animal(){}
    Animal(String name,int height,float weight){
        this.setName(name);
        this.setHeight(height);
        this.setWeight(weight);
    }
    public void setName(String name){
        //this. 表示當前物件
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    
    public void setWeight(float weight){
        this.weight = weight;
    }
    
    public float getWeight(){
        return weight;
    }
    
    public void print(){
        System.out.println(getName()+":"+getHeight()+":"+getWeight());
    }
}
