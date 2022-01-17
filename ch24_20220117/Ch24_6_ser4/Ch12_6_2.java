/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20220117.Ch24_6_ser4;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch12_6_2 {

    /**
     * @param args the command line arguments
     */
    //反序列化
    public static void main(String[] args) {
              File file = new File("c:\\mydir\\student.obj");
              try(ObjectInputStream objIn = 
                      new ObjectInputStream(new FileInputStream(file))){
                 Student st =  (Student)objIn.readObject();
                 System.out.println(st);
              }catch(IOException | ClassNotFoundException ex){
                  System.out.println(ex);
              }
    }
    
}
