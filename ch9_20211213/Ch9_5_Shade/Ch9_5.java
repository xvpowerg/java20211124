/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20211213.Ch9_5_Shade;

/**
 *
 * @author xvpow
 */
public class Ch9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //遮蔽 shade
       //必須繼承才會有shade
       //口訣
       //只要是屬性 靜態的屬性 靜態的方法 都是遮蔽
       //遮蔽看類別
       //複寫看物件
       
       Test2 t1  = new Test2();
       System.out.println(t1.msg);
       System.out.println(t1.msg2);
    
        Test1 t2  = new Test2();
        t2.method1();
        t2.method2();//遮蔽 看類別
        
    }
    
}
