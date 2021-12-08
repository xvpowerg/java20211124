/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20211208.Ch7_1_modifier1;

/**
 * 1 讀取權限只能越來越開放 
 * public 跨package也可讀寫
 * protected 跨package不可讀寫 繼承後可讀寫
 * default 跨package不可讀寫
 * private 只有當前類別可以讀寫
 * 2 回傳數值如果是基本型態必須一樣
 * 3 回傳數值如果是參考型態 就可以是一樣或子類
 * 4 參數與方法名稱必須一致
 * 5 可拋出子類的例外或不拋出或一樣
 */
public class Ch7_1 {


    public static void main(String[] args) {
 
        Test1 test1 = new Test1();
        
        System.out.println(test1.publicStr);
        System.out.println(test1.protectedStr);
        System.out.println(test1.defaultStr);
    }
    
}
