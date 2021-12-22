/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20211222.ch13_3_inner3;

/**
 *
 * @author xvpow
 */
public class Ch13_3 {
    class InnerClass{
        public String toString(){
            return "InnerClass!!";
        }
    }    
    
    static class StaticInnerClass{
            public String toString(){
                return "StaticInnerClass!!";
            }
    }
    
    public static void main(String[] args) {
       Jump jump1 = new Jump(){
           public void jumping(){
               System.out.println("Jump!!!");
           }
       };
               
    }
    
}
