/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20211129;

/**
 *
 * @author xvpow
 * 長參數
 */
public class Ch3_5_varargs {

    /**
     * @param args the command line arguments
     */
    static int sum(int[] values){
        int sum = 0;
        for(int i = 0;i < values.length;i++){
            sum += values[i];
        }
        //如果沒傳入數值 回傳0
        //如果有傳入 將傳入的N筆數值相加
        return sum;//return 另一個作用可離開函數
    }
    //長參數
    //必須是最後一個參數
    public static int sum2(int ... values){
        int sum = 0;
        for (int v : values){
            sum += v;
        }
        return sum;
    }
       //長參數必須是最後一個參數
    public static int testVargs(int n,int ... values){    
        int sum = 0;
        for (int v : values){
            sum += v;
        }
        return n * sum;
    }
    public static void main(String[] args) {
        int[] values = {8,5,4,3,2};
        int ans = sum(values);
        System.out.println(ans);
        int ans2 = sum2(1,2,4,5,6,7,8);
         System.out.println(ans2);
         ans2 = sum2();
         System.out.println(ans2);
         int ans3 = testVargs(2,3,5,6,7,9,10);
         System.out.println(ans3);
    }
    
}
