/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20220121.ch26_5_db1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch26_5 {
    
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/testdb20220121";
        String user = "qwer";
        String password = "12345";
        try( Connection con =  DriverManager.getConnection(url, user, password);
           Statement stm = con.createStatement();){
          
           stm.executeUpdate("INSERT INTO student(id,st_name,height) VALUES(2,'Iris',152.6)");
                   
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        
        
    }
    
}
