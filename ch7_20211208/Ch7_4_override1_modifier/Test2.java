/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20211208.Ch7_4_override1_modifier;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1 {
    //只能用public複寫
    @Override
    public void testPublic(){
        System.out.println("Test2 testPublic");
    }
    //protected public 複寫
    @Override
    protected void testProtected(){
        System.out.println("Test2 testProtected");
    }
     //default protected public 複寫
    @Override
     void testDefault(){
           System.out.println("Test2 testDefault");
     }
     //@Override
     //不可複寫!
     protected void testPrivate(){
          System.out.println("Test2 testPrivate");
     }
}
