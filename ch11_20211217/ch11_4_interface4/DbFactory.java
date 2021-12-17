/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20211217.ch11_4_interface4;

/**
 *
 * @author xvpow
 */
public final class DbFactory {
    public static final int MYSQL  = 1;
    public static final int PGSQL  = 2;
    private DbFactory(){}
    public static UserDao newUserDao(int v){
        
        switch(v){
            case MYSQL:
                return new MySQLUserDao();               
            case PGSQL:
              return new PostUserDao();               
            default:
               throw new IllegalArgumentException("錯誤的參數!");
        } 
    }
    
}
