/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20211203.ch5_3_encapsulation;

/**
 *
 * @author xvpow
 * 封裝的動作
 * 1 設private
 * 2 設定 public 寫入 (set???) 
 * 3 設定 public 讀取 (get???) 
 */
public class Product {
   private String name;
   private int price;
   //建構式 (Constructor) 用來初始化 物件
   //建構式特性
   //無回傳值
   //方法名稱跟類別一樣
   
   //預設建構式
   Product(){
       System.out.println("Product()!!");
   }
   
   Product(String name,int price){
       setName(name);
       setPrice(price);
   }
   //name  不可為空白 也不可是 null
   //長度必須大於1 小於等於 20
   
   public void setName(String inName){
       if (inName == null || inName.isEmpty() || 
               inName.length() <= 1 || inName.length() > 20){
            System.out.println("錯誤的姓名");
            return;//離開方法
       }
         name = inName;
//       if ( inName != null && !inName.isEmpty()  &&
//               inName.length() > 1 && inName.length() <= 20){
//           name = inName;
//       }else{
//           System.out.println("錯誤的姓名");
//       }
       
   }
   public String getName(){
       return name;
   }
   
    //寫入
   public void setPrice(int inPrice){
       if (inPrice >= 41000){
           price = inPrice;
       }else{
           System.out.println("價格低於成本");
       }       
   }
   //讀取
   public int getPrice(){
       return price;
   }
    void print(){
        System.out.println(getName()+":"+getPrice());
    }
}
