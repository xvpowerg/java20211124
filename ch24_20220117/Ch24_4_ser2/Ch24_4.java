/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20220117.Ch24_4_ser2;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public class Ch24_4 {

    public static void main(String[] args) {
        File file = new File("C:\\mydir\\obj\\listobj.obj");    
        try(ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(file))){
            
           ArrayList<String> list =  (ArrayList)objIn.readObject();
            System.out.println(list);
        }catch(IOException | ClassNotFoundException ex){
            System.out.println(ex);
        }
        
    }
    
}
