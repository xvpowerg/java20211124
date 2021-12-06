/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_6_20211206_constructor4;

/**
 *
 * @author xvpow
 */
//這個case會有問題
//把註解移除可解決
public class Test2  extends Test1{
    //預設情況下
    //類別若無建構式 會自動建立一組 預設建構式
    //類別若無如呼叫super(...)時 會自動呼叫super()
    Test2(){               
       //super(1,2);
       this(1,2);
    }
 Test2(int v1,int v2){
     super(v1,v2);
 }   
}
