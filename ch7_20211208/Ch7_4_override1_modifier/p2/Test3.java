/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20211208.Ch7_4_override1_modifier.p2;
import ch7_20211208.Ch7_4_override1_modifier.Test1;
/**
 *
 * @author xvpow
 */
public class Test3  extends Test1{
     public void testPublic(){
        System.out.println("Test3 testPublic");
    }
    protected void testProtected(){
        System.out.println("Test3 testProtected");
    }
    //因為父類別的testDefault方法是一個 default所以 跨package就無法讀取了
    void testDefault(){
         System.out.println("Test3 testDefault");
    }
    private void testPrivate(){
        System.out.println("Test3 testPrivate");
    }
}
