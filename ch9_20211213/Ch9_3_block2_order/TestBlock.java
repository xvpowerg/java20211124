/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20211213.Ch9_3_block2_order;

/**
 *
 * @author xvpow
 */
public class TestBlock {
    {
       printMsg("not static  block 1");
    }
    
    static void printMsg(String msg){
        System.out.println(msg);
    }
    
   static {
       printMsg("static  block 1");
    }
   
    {
       printMsg("not static  block 2");
    }
    TestBlock(){
        printMsg("TestBlock()");
    }
    
    public static void test(){}
     static {
       printMsg("static  block 2");
    }
    
}
