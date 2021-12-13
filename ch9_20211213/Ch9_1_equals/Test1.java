/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20211213.Ch9_1_equals;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String name;
    private int value;
    
    public Test1(String name,int value){
        this.name = name;
        this.value = value;
    }
    
    public boolean equals(Object obj){
        //兩個記憶體相等 那麼就是相同類別
        System.out.println(obj.getClass().getName() == Test1.class.getName());
        if (obj==null || obj instanceof Test1 == false){
            return false;
        } 
        
        
        Test1 t1 = (Test1)obj;
        if (t1.value == this.value &&
                t1.name.equals(this.name)){
            return true;
        }
        return false;
    }
}
