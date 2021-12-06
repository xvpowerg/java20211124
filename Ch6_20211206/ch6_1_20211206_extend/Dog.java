/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_1_20211206_extend;

/**
 *
 * @author xvpow
 * 有部分會被繼承
 * public 或 protected的 方法 或屬性
 * 建構式 或 看不到的 屬性或方法不會繼承
 */
public class Dog extends Animal{
      Dog(){  }
      Dog(String name,int height,float weight){
          //可呼叫父類別建構式
          //super() 必須是 第一組命令
          //super() 只能放在建構式
          super(name,height,weight);
//          this.setName(name);
//          this.setHeight(height);
//          this.setWeight(weight);                   
      }
      
       @Override //檢查方法是否為正確的複寫
       public void print(){
           System.out.print("Dog:");
           //super. 呼叫父類別的print()
           super.print();       
       }
      
}
