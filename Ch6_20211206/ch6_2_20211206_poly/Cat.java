/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_2_20211206_poly;
/**
 *
 * @author xvpow
 */
public class Cat  extends Animal{
    Cat(){}
    Cat(String name,int height,float weight){
        super(name,height,weight);
    }
    
    public void print(){
        System.out.print("Cat:");
        super.print();
    }
}
