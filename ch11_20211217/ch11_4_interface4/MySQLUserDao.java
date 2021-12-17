/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20211217.ch11_4_interface4;

/**
 *
 * @author xvpow
 */
public class MySQLUserDao implements UserDao{
    public void insert(){
        System.out.println("MySQL INSERT");
    }
    public void update(){
        System.out.println("MySQL Update");
    }
   public void delete(){
       System.out.println("MySQL Delete");
   }
    public void query(){
        System.out.println("MySQL Query");
    }
}
