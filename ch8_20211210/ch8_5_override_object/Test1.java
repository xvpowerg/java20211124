/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20211210.ch8_5_override_object;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String name;
    private int count;
    public Test1(){
        
    }
    public Test1(String name,int count){
        this.name = name;
        this.count = count;
    }
    public String toString(){
        return name+":"+count;
    }
    
    public boolean equals(Object obj){
        Test1 tmp = (Test1)obj;
        return this.count == tmp.count &&
                this.name.equals(tmp.name);
    }
}
