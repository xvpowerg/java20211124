/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20211213.Ch9_2_block1;

public class Test1Block {
    private int[] array = new int[20];
    //非靜態區塊 如果有某個初始化是在每個建構式都需要呼叫的!
    {
    //早於建構式
            for (int i = 0; i < array.length;i++){
                array[i] = -1;
            }
    }
    Test1Block(){
            
    }
    Test1Block(int v){     
    }
    public void printArray(){
        for (int cv : array){
            System.out.println(cv);
        }
    }
}
