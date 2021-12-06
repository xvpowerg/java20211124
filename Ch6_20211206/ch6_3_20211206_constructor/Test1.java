/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_3_20211206_constructor;

/**
 *
 * @author xvpow
 */
import java.util.Random;
public class Test1 {
    private int v1,v2;
    private static  Random ran = new Random();
    static int getRandomNumber(){
        return ran.nextInt(10000000) + 1;
    }
    Test1(){
        //this() 可呼叫 當前類別的其他建構式
        //this() 只是建構式的第一組命令
        this(getRandomNumber(),getRandomNumber());       
    }
    Test1(int v1,int v2){
        this.v1 = v1;
        this.v2 = v2;
         System.out.println("Test1(int,int)");         
    }
    
    public void print(){
        System.out.println(v1+":"+v2);
    }
}
