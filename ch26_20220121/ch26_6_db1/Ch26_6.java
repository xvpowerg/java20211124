/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20220121.ch26_6_db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author xvpow
 */
public class Ch26_6 {
    public static void main(String[] args) {
      String url = "jdbc:derby://localhost:1527/testdb20220121";
        String user = "qwer";
        String password = "12345";
        try( Connection con =  DriverManager.getConnection(url, user, password);
           Statement stm = con.createStatement();){
          
          ResultSet resultSet = 
                  stm.executeQuery("SELECT * FROM student");
         while(resultSet.next()){
             int id = resultSet.getInt(1);
             String name = resultSet.getString("st_name");
             double height = resultSet.getDouble(3);
             System.out.println(id+":"+name+":"+height);
         }          
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
}
