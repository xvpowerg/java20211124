/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20211215.ch10_3_shade3;
public class Ch10_3 {

       //遮蔽 shade
       //必須繼承才會有shade
       //口訣
       //只要是屬性 靜態的屬性 靜態的方法 都是遮蔽
       //遮蔽看類別
       //複寫看物件       
    public static void main(String[] args) {
       Test1 t1 = new Test2();
       t1.setValue1("TestX Value1");
       t1.value2 = "TestX Value2";
       
      String v1 =  t1.getValue1();//null
      String v2 =  t1.getValue2();//TestX Value2
      System.out.println(v1+":"+v2);
    }
    
}
