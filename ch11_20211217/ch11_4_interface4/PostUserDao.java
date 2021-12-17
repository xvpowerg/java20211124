/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20211217.ch11_4_interface4;

/**
 *
 * @author xvpow
 */
public class PostUserDao  implements UserDao{
    public void insert(){
        System.out.println("PostUserDao insert");
    }
    public void update(){
        System.out.println("PostUserDao update");
    }
   public void delete(){
       System.out.println("PostUserDao delete");
   }
   public void query(){
        System.out.println("PostUserDao query");
   }
}
