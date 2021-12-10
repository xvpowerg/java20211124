  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20211210.ch8_4_override_exception;

/**
 *
 * @author xvpow
 */
public class TestOverride {
    public void testCatchedException() throws ParentException{
        System.out.println("testCatchedException!!");
    }
       public void testUncatchedException() throws ParentUncatchedException{
              System.out.println("testCatchedException!!");
       }
}
