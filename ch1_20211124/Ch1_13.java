/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211124;

/**
 * for 迴圈順序
 * @author xvpow
 */

public class Ch1_13 {
    static int test1(){
        System.out.println("Test1");
        return 1;
    }
    static boolean test2(){
        System.out.println("Test2");
        return true;
    }
     static int test3(){
        System.out.println("Test3");
        return 0;
    }
       static void test4(int v){
        System.out.println("Test4:"+v);        
    }
    public static void main(String[] args) {
      //1 2 3
      //4 2 3
      //        1       2      4
//        for (int i = 1; i<=5 ; i++){
//            //3
//        }
        
        for(int k = test1();k<=3 && test2();k++,test3()){
            test4(k);
        }
    }
    
}
