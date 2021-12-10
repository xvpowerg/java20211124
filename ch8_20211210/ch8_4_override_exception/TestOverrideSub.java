/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20211210.ch8_4_override_exception;

import java.lang.IllegalArgumentException;

/**
 *
 * @author xvpow
 */
public class TestOverrideSub extends TestOverride {
//      public void testCatchedException() throws ParentException{
//        System.out.println("testCatchedException!!");
//    }

//   public void testCatchedException() throws SubException{
//        System.out.println("TestOverrideSub testCatchedException!!");
//    }
    public void testCatchedException() throws IllegalArgumentException {
        System.out.println("TestOverrideSub testCatchedException!!");
    }

//    public void testUncatchedException() throws ParentUncatchedException{
//              System.out.println("TestOverrideSubtest testUncatchedException!!");
//       }
//        public void testUncatchedException() throws SubUncatchedException{
//              System.out.println("TestOverrideSubtest testUncatchedException!!");
//       }
//       public void testUncatchedException() {
//              System.out.println("TestOverrideSubtest testUncatchedException!!");
//       }
    public void testUncatchedException() throws IllegalArgumentException,
            NullPointerException {
        System.out.println("TestOverrideSubtest testUncatchedException!!");
    }
}
