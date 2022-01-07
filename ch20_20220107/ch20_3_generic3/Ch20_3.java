/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20220107.ch20_3_generic3;
import java.lang.IllegalArgumentException;
/**
 *
 * @author xvpow
 */
public class Ch20_3 {
    
    public static void main(String[] args) {
       Test1.<String>method1("value1");
       Test1.<Integer>method1(12);
       //可透過參數判斷回傳值
      NullPointerException ill = 
              Test1.getException(NullPointerException::new);
      
    }
    
}
