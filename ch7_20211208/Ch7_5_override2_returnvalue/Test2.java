/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20211208.Ch7_5_override2_returnvalue;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
//    @Override
    //不是正確的複寫 因為參數類型不一樣
      public void m1(long v2){
         System.out.println("Test2 m1");
    }
      //因為Test2是Test1的子類所以複寫
      @Override
      public Test2 m2(){
            System.out.println("Test2 m2");
          return new Test2();
      }
      
   //如果是基本型態 回傳類型必須跟父類別一樣       
//      public long m3(){
//            System.out.println("Test2 m2");
//          return new Test2();
//      }
}
