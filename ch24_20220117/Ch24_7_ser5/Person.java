/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20220117.Ch24_7_ser5;

/**
 *
 * @author xvpow
 */
public class Person {
        private String phoneNumber;
        private String adderss;
 public Person(){
 }
    public Person(String phoneNumber, String adderss) {
        this.phoneNumber = phoneNumber;
        this.adderss = adderss;
    }
            
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAdderss() {
        return adderss;
    }
        
}
