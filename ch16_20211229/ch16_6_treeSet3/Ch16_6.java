/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20211229.ch16_6_treeSet3;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch16_6 {

    private static class MyComparator implements Comparator<Integer>{
        int type = -1;
        MyComparator(int type){
            this.type = type;
        }
        public int compare(Integer a1,Integer a2){
            if (a1 > a2){
                return type == 1?1:-1;
            }else if(a1 < a2){
                return type == 1?-1:1;
            }
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入排序類型!");
        int type = scan.nextInt();
          Comparator<Integer> cmp = new MyComparator(type);
//        Comparator<Integer> cmp = new Comparator<Integer>(){
//                public int compare(Integer a1,Integer a2){
//                    if (a1 > a2){
//                        return type==1 ? 1:-1;
//                    }else if(a1 < a2){
//                        return type==1 ? -1:1;                        
//                    }
//                    return 0;
//                }
//            };
        int v = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(cmp);
        System.out.println("請輸入一群整數用空白隔開!");
        while((v = scan.nextInt()) != -1 ){
            //System.out.println(v);
            treeSet.add(v);
        }
        System.out.println(treeSet);
        
        //請輸入一些整數空白隔開 使用-1表示結束
        //再輸入一個 排序方式 1 小大 2 大到小
         
         
        //將輸入的數字依排序方式排列!
   
    }
    
}
