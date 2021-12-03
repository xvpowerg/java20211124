/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20211203;

/**
 *
 * @author xvpow
 */
public class Ch5_1_overloading {
    /**
     * 
     * 
     * 多載
     * 方法名稱要一樣  參數的數量 或 類型不一樣
     * 1 先找一樣的類型
     * 2 先找相同類型可相容
     * 3 找不同類型可相容
     * 4 轉封箱類型 
     * 
     */
    static void test1(int a1,short s1){
        System.out.println("Test1 int short");
    }
    static void test1(float f1,double d1){
        System.out.println("Test1 float double");
    }
    
    static void test2(int a1,Integer a2){
         System.out.println("Test2 int Integer");
    }
    static void test2(float f1,double d1){
         System.out.println("Test2 float double");
    }
     
    static void test3(int a1,Float f1){
        System.out.println("test3 int Float");
    }
    
    static void test3(int a1,short f1){
        System.out.println("test3 int short");
    }
    static void test4(int a1,float f1){
          System.out.println("test4 int float");
    }
      static void test4(float f1,int a1){
          System.out.println("test4  float int");
    }
      
     static void test5(int a1,int a2,float f1){
          System.out.println("test4 int int float");
    }
      static void test5(float f1,Integer a2,int a1){
          System.out.println("test4  float Integer int");
    } 
    public static void main(String[] args) {
       test1(1,6);
       test2(0,6);
       //test3(2,15);
      // test4(8,9); \\兩個方法都可以
      test5(1,2,3);
    }
    
}
