/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20211201;

/**
 *
 * @author xvpow
 * 多載
 */
public class Ch4_4_overloading2 {

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
//  1 先找一樣的類型
    static void test1(String s1){
        System.out.println("test1 String");
    }
    static void test1(int v1){
        System.out.println("test1 int");
    }
 //   2 先找相同類型可相容
    static void test2(String s1){
         System.out.println("test2 String");
    }
    static void test2(long v2){
          System.out.println("test2 long");
    }
 //3 找不同類型可相容
    static void test3(short s1){
        System.out.println("test3 short");
    }
    static void test3(float f1){
        System.out.println("test3 float");
    }
    //4 轉封箱類型     
    static void test4(short s1){
          System.out.println("test4 short");
    }
    static void test4(Integer i1){
          System.out.println("test4 Integer");
    }
    
     static void test5(short s1){
          System.out.println("test5 short");
    }
     static void test5(Float f1){
          System.out.println("test5 Float");
     }
 
    public static void main(String[] args) {
            test1(5);
            test1("Test");
            test2(20);
            test3(1);
            test4(6);
            test5(2.5f);//請修正變為正確的
//            Integer i1 = 20;
//            Float f2 = i1;
            
    }
    
}
