/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20211220.ch12_8_innserclass3;

/**
 *
 * @author xvpow
 */
public class Ch12_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestInnerClass.StaticInnerClass stIneerClass =
                new TestInnerClass.StaticInnerClass();
        stIneerClass.testStaticInner();
        
        TestInnerClass innerClass = new TestInnerClass();
        TestInnerClass.MyInnerClass 
                myInnerClass = innerClass.new MyInnerClass();
        myInnerClass.testInner();
        
        
        
    }
    
}
